package pl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import pl.article.generator.CatchNorwegianArticles;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class GeneratorRSS {
  
  public static void printArticleInRssFormat(int countArticlesPack, String pageAddress, PrintWriter out) throws IOException {
    Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
    CatchNorwegianArticles articleGenerator = new CatchNorwegianArticles();
    
    for(int x = 1; x <= countArticlesPack; x++){
      allArticles = articleGenerator.obtainArticleParameters(x, pageAddress);
      for(int z = 1; z < allArticles.size(); z++){
        
        Article article = allArticles.get(z);
        
        if(! article.getTitle().equals("o") || article.getTitle().equals("1")){
          out.println("\t\t\t<item>");
          out.println("\t\t\t\t<title>"+ article.getTitle() +"</title>");
          out.println("\t\t\t\t<link>"+ article.getHref() +"</link>");
          out.println("\t\t\t</item>");
        }
      }
    }
  }
  
}
