package pl.article.webservices;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.PathParam;
import pl.article.generator.CatchNorwegianArticles;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
@Path("/rest")
public class ArticleWebServices {
  
//http://localhost:8084/BergenT/rest/getArticleFromWebsite/bt.no/count/1
  @GET
  @Path("/getArticleFromWebsite/{websiteAddress}/count/{number}")
  @Produces("application/json")
  public String getArticleFromWebsite(@PathParam( "websiteAddress" )String websiteAddress, @PathParam( "number" )int number)
  {
    String allArticlesFromWebsite  = null;
    
    try {
      Map<Integer, Article> allArticles = new HashMap<Integer, Article>();
      CatchNorwegianArticles articleGenerator = new CatchNorwegianArticles();
      List<Article> articleList = new ArrayList<Article>();
      
      for(int x = 1; x<=number; x++){
        allArticles = articleGenerator.obtainArticleParameters(x, websiteAddress);
        for(int z = 1; z < allArticles.size(); z++){
          
          Article article = allArticles.get(z);
          if(! article.getTitle().equals("o") || article.getTitle().equals("1")){
            
            articleList.add(article);
//            System.out.println("id:  " + article.getId()); 
//            System.out.println("Href:  " + article.getHref()); 
//            System.out.println("Title:  " + article.getTitle()); 
//            System.out.println("Image:  " + article.getImage()); 
//            System.out.println("=========");
          }
        }
      }
      
      Gson gson = new Gson();
      System.out.println(gson.toJson(articleList));
      allArticlesFromWebsite = gson.toJson(articleList);
      
    } catch (Exception e)
    {
            System.out.println("error");
    }
    return allArticlesFromWebsite;
  }        
}
