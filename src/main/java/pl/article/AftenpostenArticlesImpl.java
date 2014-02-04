package pl.article;

import pl.article.ArticlesStrategy;
import pl.article.generator.AftenpostenArticlesCatcher;


/**
 *
 * @author Michał
 */
public class AftenpostenArticlesImpl extends ArticlesStrategy{

  public AftenpostenArticlesImpl() {
    articleCatcher = new AftenpostenArticlesCatcher();
  }
  
}
