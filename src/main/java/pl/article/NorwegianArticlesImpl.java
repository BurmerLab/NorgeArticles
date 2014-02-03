package pl.article;

import pl.article.ArticlesStrategy;
import pl.article.generator.CatchNorwegianArticles;


/**
 *
 * @author Michał
 */
public class NorwegianArticlesImpl extends ArticlesStrategy{

  public NorwegianArticlesImpl() {
    articleGenerator = new CatchNorwegianArticles();
  }
  
}
