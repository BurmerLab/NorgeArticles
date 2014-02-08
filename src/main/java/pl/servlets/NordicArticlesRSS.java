package pl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.article.GeneratorFactory;
import pl.article.generator.AftenpostenArticlesCatcher;
import pl.pojo.Article;

/**
 *
 * @author Michał Burmer
 */
//localhost:8084/BergenT/NordicArticlesRSS.rss?sourceType=aftenposten&count=4
@WebServlet(name = "NordicArticlesRSS", urlPatterns = {"/NordicArticlesRSS.rss"} )
public class NordicArticlesRSS extends HttpServlet {
  
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    String generatorType;
    int countArticlesPack;
    
    if(request.getParameter("sourceType") == null){
      generatorType = "bergenstidende";
      countArticlesPack = 3;
    }else{
      generatorType = request.getParameter("sourceType");
      countArticlesPack = Integer.parseInt(request.getParameter("count"));
    }
    
    try {
      GeneratorRSS rss = new GeneratorRSS(GeneratorFactory.createGenerator(generatorType));
      out.println(rss.printArticleInRssFormat(countArticlesPack, generatorType));
      
    } finally {      
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

  

}