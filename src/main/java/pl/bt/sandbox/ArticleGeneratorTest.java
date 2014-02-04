package pl.bt.sandbox;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import pl.article.ArticleCatcher;
import pl.article.GeneratorFactory;
import pl.article.webservices.GeneratorArticleWebService;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class ArticleGeneratorTest {

// public static void main(String[] args) {
//    final String pageAddress = "bt.no/";
//	
//    try {
//      Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
//      GeneratorArticleWebService articleWebService = new GeneratorArticleWebService(GeneratorFactory.createGenerator(sourceType));
//      allArticlesFromWebsite = articleWebService.generateArticlesForWebService(3, "bergenstidende");
//      
//      ArticleCatcher generator = GeneratorFactory.createGenerator("bt.no");
//      
////      NorwegianArticlesCatcher articleGenerator = new NorwegianArticlesImpl();
//      
//      for(int x = 1; x<=4; x++){
//        allArticles = articleGenerator.obtainArticleParameters(x, pageAddress);
//        for(int z = 1; z < allArticles.size(); z++){
//          
//          Article article = allArticles.get(z);
//          if(! article.getTitle().equals("o") || article.getTitle().equals("1")){
//            System.out.println("id:  " + article.getId()); 
//            System.out.println("Href:  " + article.getHref()); 
//            System.out.println("Title:  " + article.getTitle()); 
//            System.out.println("Image:  " + article.getImage()); 
//            System.out.println("=========");
//          }
//        }
//      }
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
// 
//  }
}
