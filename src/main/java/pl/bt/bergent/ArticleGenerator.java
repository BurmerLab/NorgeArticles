package pl.bt.bergent;
/**
 *
 * @author Michal Burmer
 */
import java.awt.List;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import pl.nordicPaper.Article;
 
public class ArticleGenerator {
  
  public Map<Long, Article> article = new HashMap<Long, Article>();
  
  
  public static void main(String[] args) {
//    final String pageAddress = "http://bt.no";
    final String pageAddress = "http://www.bt.no/";
	
    try {
      
      Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
      ArticleGenerator articleGenerator = new ArticleGenerator();
      
      for(int x = 1; x<=4; x++){
        allArticles = articleGenerator.obtainArticleParameters(x, pageAddress);
        for(int z = 1; z < allArticles.size(); z++){
          
          Article article = allArticles.get(z);
          if(! article.getTitle().equals("o") || article.getTitle().equals("1")){
            System.out.println("id:  " + article.getId()); 
            System.out.println("Href:  " + article.getHref()); 
            System.out.println("Title:  " + article.getTitle()); 
            System.out.println("Image:  " + article.getImage()); 
            System.out.println("=========");
          }
        }
      }
	} catch (IOException e) {
		e.printStackTrace();
	}
 
  }

  public Map<Integer, Article> obtainArticleParameters(int count, String pageAddress) throws IOException{
      
      Document website = Jsoup.connect("http://"+pageAddress).get();
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
       
        if(link.text().equals("o") || link.text().equals("1")){
          article.setImage(img.absUrl("src"));
          article.setHref(linkHref);
          article.setTitle(linkTitle);
        }else{
          article.setImage("");
          article.setHref(linkHref);
          article.setTitle(linkTitle);
          
          if(articleParameters.containsKey(counter-1)){
            counter -= 1;
            Article articleWithPhoto = articleParameters.get(counter);
            counter += 1;
            if(articleWithPhoto.getHref().equals(article.getHref())){
              articleParameters.remove(counter);
              article.setImage(articleWithPhoto.getImage());
            }
          }
        }
        articleParameters.put(y, article);
        counter ++;
      }
    return articleParameters;
    }
}
