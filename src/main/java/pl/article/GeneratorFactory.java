package pl.article;

import pl.article.generator.BergensTidendeArticlesCatcher;
import pl.article.generator.FaedrelandsvennenArticleCatcher;
import pl.article.generator.AftenpostenArticlesCatcher;
import pl.article.generator.SwedishArticlesCatcher;

/**
 *
 * @author Michał
 */
public class GeneratorFactory {
   public static ArticleCatcher createGenerator(String generatorType){
       
     if(generatorType.equals("aftenposten")){
           return new AftenpostenArticlesCatcher();
           
       }else if(generatorType.equals("bergenstidende")){
           return new BergensTidendeArticlesCatcher();
           
       }else if(generatorType.equals("Faedrelandsvennen ")){
           return new FaedrelandsvennenArticleCatcher();
           
       }else if(generatorType.equals("swedish")){
           return new SwedishArticlesCatcher();
       }
       
       throw new UnsupportedOperationException("There is no strategy");
  }
}

//i teraz uzycie w servlecie:

//protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
//                throws ServletException, IOException {

// cos tu robi 
// String type = request.getParameter("articlesType") ; 
// tutaj "swedish', 'norwegian'
// ArticleCatcher generator = GeneratorFactory.createGenerator(type); // cos robi }
