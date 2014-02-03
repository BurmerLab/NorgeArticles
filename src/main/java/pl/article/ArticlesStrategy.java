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
  
//  public abstract class ArticlesDao { 
//    public ArticleGenerator articleGenerator;
//    
//    public ArticlesDao(ArticleGenerator articleGenerator) {
//      this.articleGenerator = articleGenerator; }
//
//    public Map<Integer, Article> getArticles(int count, String href) throws IOException{ 
//      return articleGenerator.obtainArticleParameters(count, href);
//    }
//
//  }

}
