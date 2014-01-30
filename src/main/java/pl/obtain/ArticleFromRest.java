/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.obtain;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import pl.nordicPaper.Article;

/**
 *
 * @author Michał
 */
public class ArticleFromRest {

	public static void main(String[] args) throws Exception	{
      
		String json = readUrl("http://localhost:8084/BergenT/rest/getArticleFromWebsite/bt.no/count/3");
        
        Gson gson = new Gson();
		JsonParser jsonParser = new JsonParser();
		JsonArray articleJsonArray = jsonParser.parse(json).getAsJsonArray();
        
		List<Article> articles = new ArrayList<Article>();
		for (JsonElement articleFromJson : articleJsonArray){
			Article article = gson.fromJson(articleFromJson, Article.class);
			articles.add(article);
		}

		for (Article articleObj : articles)	{
			System.out.println("getId : " + articleObj.getId());
			System.out.println("getHref  " + articleObj.getHref());
			System.out.println("getTitle : " + articleObj.getTitle());
			System.out.println("getImage  : " + articleObj.getImage());
            System.out.println("\n");
        }

	}
    
	private static String readUrl(String urlString) throws Exception {
		BufferedReader reader = null;
		try
		{
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);
			return buffer.toString();
            
		} finally {
			if (reader != null)
				reader.close();
		}
	}
}
  
  
