/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.servlets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.article.GeneratorFactory;
import pl.article.webservices.ArticleWebServices;

/**
 *
 * @author Michał
 */
public class GeneratorRSSTest {
  
  public GeneratorRSSTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of printArticleInRssFormat method, of class GeneratorRSS.
   */
  @Test
  public void testPrintArticleInRssFormat() throws Exception {
    System.out.println("printArticleInRssFormat");
    int countArticlesPack = 4;
    String generatorType = "bergenstidende";
    ArticleWebServices instance = new ArticleWebServices();
    GeneratorRSS rss = new GeneratorRSS(GeneratorFactory.createGenerator(generatorType));
    String result = rss.printArticleInRssFormat(countArticlesPack);
    assertNotNull(result);
  }
}
