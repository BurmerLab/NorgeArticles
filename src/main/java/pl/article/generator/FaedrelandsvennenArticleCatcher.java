package pl.article.generator;
/**
 *
 * @author Michal Burmer
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import pl.article.ArticleCatcher;
import pl.pojo.Article;
 
public class FaedrelandsvennenArticleCatcher implements ArticleCatcher{
  
  private String page = "fvn.no";
  
  public String getPage() {
    return page;
  }
  
  @Override
  public Map<Integer, Article> obtainArticleParameters(int count) throws IOException{
      
      Document website = Jsoup.connect("http://fvn.no").get();
      Elements master = website.select(".gridRow.contentLevel"+count);//.default.noThemeHeadline
      Elements links = master.select("a");
      
      Map<Integer, Article> articleParameters = new HashMap<Integer, Article>();
      int counter = 0;
      
      for(int y=0; y < links.size(); y++){
        Element link = links.get(counter);
        Element img = link.select("img").first();
        
        String linkHref = link.attr("abs:href");
        String linkTitle = link.text();
            
        Article article = new Article();
        article.setId(y);
       
        if(isArticleWithOnlyImage(link, img)){
          article.setImage(img.absUrl("src"));
          article.setHref(linkHref);
          article.setTitle(linkTitle);
        }else{
          article.setImage("");
          article.setHref(linkHref);
          article.setTitle(linkTitle);
          
          if(articleParameters.containsKey(counter-1)){
            Article articleWithPhoto = articleParameters.get(counter-1);
            if(articleWithPhoto.getHref().equals(article.getHref())){
              articleParameters.remove(counter-1);
              article.setImage(articleWithPhoto.getImage());
            }
          }
        }
        articleParameters.put(y, article);
        counter ++;
      }
    return articleParameters;
    }

  private boolean isArticleWithOnlyImage(Element link, Element img) {
    return (link.text().equals("o") || link.text().equals("l") ) && img!=null;
  }
}
