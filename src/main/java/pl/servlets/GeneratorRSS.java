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
  
  public void printArticleInRssFormat(int countArticlesPack, PrintWriter out) throws IOException {
    Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
    
//    NorwegianArticlesCatcher articleGenerator = new NorwegianArticlesCatcher();
    
//    ArticleCatcher generator = GeneratorFactory.createGenerator(type);
    for(int x = 1; x <= countArticlesPack; x++){
      allArticles = articleGenerator.obtainArticleParameters(x);
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
