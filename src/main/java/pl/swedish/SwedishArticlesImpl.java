/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.swedish;

import pl.swedish.generator.ArticleSwedishGenerator;
import pl.article.ArticlesKinds;

/**
 *
 * @author Michał
 */
public class SwedishArticlesImpl extends ArticlesKinds{

  //not supported yet - made only for show strategy
  public SwedishArticlesImpl() {
    articleGenerator = new ArticleSwedishGenerator();
  }
  
  
}
