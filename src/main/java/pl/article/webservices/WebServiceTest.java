/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.article.webservices;

import javax.ws.rs.PathParam;
import pl.article.GeneratorFactory;

/**
 *
 * @author Michał
 */
public class WebServiceTest {

 public static String getArticles(String sourceType, int number) {
    String allArticlesFromWebsite  = null;
    try {
      GeneratorArticleWebService articleWebService = new GeneratorArticleWebService(GeneratorFactory.createGenerator(sourceType));
      allArticlesFromWebsite = articleWebService.generateArticlesForWebService(number);
      
    } catch (Exception e){
            System.out.println("error");
    }
    return allArticlesFromWebsite;
  }
  public static void main(String[] args) {
    String articles = getArticles("bergenstidende", 4);
//    System.out.println("TEST: " + articles);
  }
}
