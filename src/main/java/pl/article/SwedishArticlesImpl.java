/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.article;

import pl.article.generator.SwedishArticlesCatcher;
import pl.article.ArticlesStrategy;

/**
 *
 * @author Michał
 */
public class SwedishArticlesImpl extends ArticlesStrategy{

  //not supported yet - made only for show strategy
  public SwedishArticlesImpl() {
    articleCatcher = new SwedishArticlesCatcher();
  }
  
  
}
