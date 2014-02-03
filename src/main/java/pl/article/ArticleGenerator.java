package pl.article;

import java.io.IOException;
import java.util.Map;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public interface ArticleGenerator {
   public Map<Integer, Article> obtainArticleParameters(int count, String pageAddress) throws IOException;
}
