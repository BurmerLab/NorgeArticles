package pl.article;

import pl.pojo.*;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import pl.pojo.*;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public abstract class ArticlesStrategy {
  
  public ArticleGenerator articleGenerator;
  
  public void performArticle(int count, String href) throws IOException{
    articleGenerator.obtainArticleParameters(count, href);
  }

  public void setArticleGenerator(ArticleGenerator articleGenerator) {
    this.articleGenerator = articleGenerator;
  }
  
}
