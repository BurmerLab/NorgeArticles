package pl.article;

import pl.article.ArticlesStrategy;
import pl.article.generator.FaedrelandsvennenArticleCatcher;


/**
 *
 * @author Michał
 */
public class FaedrelandsvennenArticlesImpl extends ArticlesStrategy{

  public FaedrelandsvennenArticlesImpl() {
    articleCatcher = new FaedrelandsvennenArticleCatcher();
  }
  
}
