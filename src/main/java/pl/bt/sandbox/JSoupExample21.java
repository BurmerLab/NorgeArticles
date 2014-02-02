package pl.bt.sandbox;
/**
 *
 * @author Michał
 */
import java.io.IOException;
import java.util.ArrayList;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class JSoupExample21 {
  
  
   public static String obtainHrefAdress(int count) throws IOException{
        Document website = Jsoup.connect("http://bt.no").get();
        Elements master = website.select(".gridRow.contentLevel"+ count +".default.noThemeHeadline");
       
        Element link = master.select("a").first();
        if(IsNotLink(link)){
          return "empty";
        }
        String allHrefAddress = link.attr("abs:href");
        return allHrefAddress;
    }
  
    public static String obtainTitle(int count) throws IOException{
        String titled = "";
        if(count == 0){return "zero";}
        else{
            Document mast = Jsoup.connect("http://bt.no").get();
            Elements master = mast.select(".gridRow.contentLevel"+count+".default.noThemeHeadline");
            Element link = master.select("a").first();
            if(IsNotLink(link)){
              return "empty";
            }
            titled = link.text();
        }
        return titled;
    }

    public static ArrayList<String> obtainOldProblems(String url) throws IOException{
        
        Document mast = Jsoup.connect(url).get();
        Elements master = mast.select(".gridRow.contentLevel2.default.noThemeHeadline").select("a");
        ArrayList<String> allOldProblems = new ArrayList<String>();
        
        for(Element m : master){
          allOldProblems.add(m.attr("abs:href"));
        }
        
        return allOldProblems;
    }
    
  
  
  public static void main(String[] args) {
    String url = "http://bt.no";
	try {
//      System.out.println("LOL: " + JSoupExample.obtainTitle(3));
      for(int x=1; x<=10; x++){
//      int x=2;
        System.out.println("HREF"+x+": " + JSoupExample21.obtainHrefAdress(x));
        System.out.println("TITLE"+x+": " + JSoupExample21.obtainTitle(x));
        
//        if(x==2){
//          ArrayList<String> oldProblems = obtainOldProblems(url);
//          for(int y=0; y<oldProblems.size(); y++){
//            System.out.println("\t\t oldProblems: "+y+" : " + oldProblems.get(y));
//          }
//        }
      }
//			// get the value from href attribute
////			System.out.println("\nlink : " + link.attr("href"));
//			System.out.println("text : " + link.text());
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
  }

  private static boolean IsNotLink(Element link) {
    return link == null;
  }
 
}
