package pl.article.generator;

import java.io.IOException;
import java.util.Map;
import pl.article.ArticleCatcher;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class SwedishArticlesCatcher implements ArticleCatcher{

  //not supported yet - made only for show strategy
  @Override
  public Map<Integer, Article> obtainArticleParameters(int count) throws IOException {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
}
