/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.servlets;

import pl.article.webservices.*;
import javax.ws.rs.PathParam;
import pl.article.GeneratorFactory;

/**
 *
 * @author Michał
 */
public class ServletTest {

 public static String getArticles(String generatorType, int number) {
    String allArticlesFromWebsite  = null;
    try {
      GeneratorRSS rss = new GeneratorRSS(GeneratorFactory.createGenerator(generatorType));
      System.out.println(rss.printArticleInRssFormat(number, generatorType));
      
    } catch (Exception e){
            System.out.println("error");
    }
    return allArticlesFromWebsite;
  }
  public static void main(String[] args) {
    ServletTest.getArticles("bergenstidende", 4);
  }
}
