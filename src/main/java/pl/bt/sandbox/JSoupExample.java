/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bt.sandbox;
/**
 *
 * @author Michał
 */
import java.io.IOException;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class JSoupExample {
  
  private String title = "";
  
    public static String foundTitle(int count) throws IOException{
        String titled = "";
        if(count == 0){return "Parametr funkcji nie moze byc rowny 0";}
        else{
            Document mast = Jsoup.connect("http://bt.no").get();
            Elements master = mast.select(".gridRow.contentLevel"+count+".default.noThemeHeadline");
            Element link = master.select("a").first();
            if(link==null){
              return "Link" + count +" jest pusty";
            }
            titled = link.text();
        }
        return titled;
    }

    public static String foundHref(int count) throws IOException{
        Document mast = Jsoup.connect("http://bt.no").get();
        Elements master = mast.select(".gridRow.contentLevel"+count+".default.noThemeHeadline");
        Element link = master.select("a").first();
        if(link==null){
//          return "Link" + count +" jest pusty";
          return "";
        }
        String titled = link.attr("abs:href");//wynik: http://www.bt.no/nyheter/lokalt/Nekter-for-bussdrapene-3002682.html
        return titled;
    }
    
  
  
  public static void main(String[] args) {
	try {
//      System.out.println("LOL: " + JSoupExample.foundTitle(3));
      for(int x=1; x<=30; x++){
//      int x=25;
        System.out.println("TITLE"+x+": " + JSoupExample.foundTitle(x));
        System.out.println("HREF"+x+": " + JSoupExample.foundHref(x));
//        System.out.println("------------------------");
      }
		// get page title
//		String title = doc.title();
//        Elements lol = doc.select("scale scale2 f-normal webhit_article");
//         for (Element test : lol) {
//			System.out.println("text : " + test.text());
// 
//		}
        
// Element masthead = doc.select("div.masthead").first();

//        Element test = doc.select("div.gridRow contentLevel1 default noThemeHeadline").first();
//        Element test = doc.classNames("scale scale2 f-normal webhit_article");
//		System.out.println("LOL:" + test.data());
//        
//        
//        
//		// get all links
//		Elements links = doc.select("div.gridRow contentLevel1 default noThemeHeadline");//gridRow contentLevel1 default noThemeHeadline 
//        for (Element link : links) {
// 
//			// get the value from href attribute
////			System.out.println("\nlink : " + link.attr("href"));
//			System.out.println("text : " + link.text());
// 
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
  }
 
}
