package pl.article.webservices;

import com.google.gson.Gson;
import pl.servlets.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pl.article.ArticleCatcher;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class GeneratorArticleWebService {
  
  private ArticleCatcher articleGenerator;
    
  public GeneratorArticleWebService(ArticleCatcher generator){
      articleGenerator = generator;
  }
  
  public String generateArticlesForWebService(int number) throws IOException {
    String allArticlesFromWebsite;
    Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
    List<Article> articleList = new ArrayList<Article>();
    
    for(int x = 1; x <=number; x++){
      allArticles = articleGenerator.obtainArticleParameters(x);
        for(Map.Entry entry : allArticles.entrySet()) {
          Article article = (Article) entry.getValue();
          articleList.add(article);
            System.out.println("id:  " + article.getId()); 
            System.out.println("Href:  " + article.getHref()); 
            System.out.println("Title:  " + article.getTitle()); 
            System.out.println("Image:  " + article.getImage()); 
            System.out.println("=========");
//        }
      }
    }
    Gson gson = new Gson();
    System.out.println(gson.toJson(articleList));
    allArticlesFromWebsite = gson.toJson(articleList);
    return allArticlesFromWebsite;
  }
  
}
