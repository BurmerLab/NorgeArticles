/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bt.sandbox;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import pl.norwegian.generator.ArticleNorwegianGenerator;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class ArticleGeneratorTest {

  /**
   * @param args the command line arguments
   */
 public static void main(String[] args) {
    final String pageAddress = "bt.no/";
	
    try {
      Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
      ArticleNorwegianGenerator articleGenerator = new ArticleNorwegianGenerator();
      
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
}
