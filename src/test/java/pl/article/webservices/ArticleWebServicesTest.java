/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.article.webservices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michał
 */
public class ArticleWebServicesTest {
  
  public ArticleWebServicesTest() {
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
   * Test of getArticles method, of class ArticleWebServices.
   */
  @org.junit.Test
  public void testGetArticles() {
    System.out.println("getArticles");
    String sourceType = "bergenstidende";
    int number = 4;
    ArticleWebServices instance = new ArticleWebServices();
    String result = instance.getArticles(sourceType, number);
    assertNotNull(result);
  }
}
