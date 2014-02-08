package pl.article;

import java.io.IOException;
import java.util.Map;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public interface ArticleCatcher {
   public String getPage();
   public Map<Integer, Article> obtainArticleParameters(int count) throws IOException;
}
