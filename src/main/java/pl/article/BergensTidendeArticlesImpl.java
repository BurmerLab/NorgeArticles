package pl.article;

import pl.article.ArticlesStrategy;
import pl.article.generator.BergensTidendeArticlesCatcher;


/**
 *
 * @author Michał
 */
public class BergensTidendeArticlesImpl extends ArticlesStrategy{

  public BergensTidendeArticlesImpl() {
    articleCatcher = new BergensTidendeArticlesCatcher();
  }
  
}
