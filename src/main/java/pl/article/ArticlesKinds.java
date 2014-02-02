/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.article;

import pl.pojo.*;
import java.io.IOException;
import pl.pojo.*;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public abstract class ArticlesKinds {
  
  public ArticleGenerator articleGenerator;
  
  public void performArticle(int count, String href) throws IOException{
    articleGenerator.obtainArticleParameters(count, href);
  }

  public void setArticleGenerator(ArticleGenerator articleGenerator) {
    this.articleGenerator = articleGenerator;
  }

}
