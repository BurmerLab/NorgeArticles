/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.swedish.generator;

import java.io.IOException;
import java.util.Map;
import pl.article.ArticleGenerator;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class ArticleSwedishGenerator implements ArticleGenerator{

  //not supported yet - made only for show strategy
  @Override
  public Map<Integer, Article> obtainArticleParameters(int count, String pageAddress) throws IOException {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
}
