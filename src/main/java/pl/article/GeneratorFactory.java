package pl.article;

import pl.article.generator.NorwegianArticlesCatcher;
import pl.article.generator.SwedishArticlesCatcher;

/**
 *
 * @author Michał
 */
public class GeneratorFactory {
   public static ArticleGenerator createGenerator(String generatorType){
       if(generatorType.equals("swedish")){
           return new SwedishArticlesCatcher();
           
       }else if(generatorType.equals("norwegian")){
           return new NorwegianArticlesCatcher();
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
// ArticleGenerator generator = GeneratorFactory.createGenerator(type); // cos robi }
