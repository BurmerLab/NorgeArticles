/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.norwegian;

import pl.article.ArticlesKinds;
import pl.norwegian.generator.ArticleNorwegianGenerator;


/**
 *
 * @author Michał
 */
public class NorwegianArticlesImpl extends ArticlesKinds{

  public NorwegianArticlesImpl() {
    articleGenerator = new ArticleNorwegianGenerator();
  }
  
}
