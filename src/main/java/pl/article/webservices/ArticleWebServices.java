package pl.article.webservices;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.PathParam;
import pl.article.GeneratorFactory;
import pl.pojo.Article;
import pl.servlets.GeneratorRSS;

/**
 *
 * @author Michał
 */
@Path("")
public class ArticleWebServices {
  
//http://localhost:8084/BergenT/rest/getArticles/aftenposten/count/1
  @GET
  @Path("/getArticles/{sourceType}/count/{number}")
  @Produces("application/json")
  public String getArticles(@PathParam( "sourceType" )String sourceType, @PathParam( "number" )int number) {
    String allArticlesFromWebsite  = null;
    
    try {
      GeneratorArticleWebService articleWebService = new GeneratorArticleWebService(GeneratorFactory.createGenerator(sourceType));
      allArticlesFromWebsite = articleWebService.generateArticlesForWebService(number);
      
    } catch (Exception e){
            System.out.println("error");
    }
    return allArticlesFromWebsite;
  }

          
}
