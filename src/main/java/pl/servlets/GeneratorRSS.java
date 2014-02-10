package pl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import pl.article.ArticleCatcher;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class GeneratorRSS {
  
  private ArticleCatcher articleGenerator;
    
  public GeneratorRSS(ArticleCatcher generator){
      articleGenerator = generator;
  }
  
  public String printArticleInRssFormat(int countArticlesPack) throws IOException {
    Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
    
    StringBuilder rssTextContain = new StringBuilder();
    
    rssTextContain.append("<rss version=\"2.0\">"+"\n");
    rssTextContain.append("\t<channel>"+"\n");
    rssTextContain.append("\t\t<title>Articles from " + articleGenerator.getPage()+ "</title>"+"\n");
    rssTextContain.append("\t\t<link>"+articleGenerator.getPage()+"</link>"+"\n");
    rssTextContain.append("\t\t<description>Latest "+countArticlesPack+" pack articles</description>"+"\n");
    
    for(int x = 1; x <= countArticlesPack; x++){
      allArticles = articleGenerator.obtainArticleParameters(x);
      
      for (Map.Entry entry : allArticles.entrySet()) {
         Article article = (Article) entry.getValue();
        
        if(! article.getTitle().equals("o") && !article.getTitle().equals("1") && !article.getTitle().isEmpty()){
          rssTextContain.append("\t\t\t<item>"+"\n");
          rssTextContain.append("\t\t\t\t<title>"+ article.getTitle() +"</title>"+"\n");
          rssTextContain.append("\t\t\t\t<link>"+ article.getHref() +"</link>"+"\n");
          rssTextContain.append("\t\t\t</item>"+"\n");
        }
      }
    }
    rssTextContain.append("\t</channel>"+"\n");
    rssTextContain.append("</rss>"+"\n");
    
    return rssTextContain.toString();
  }
}
