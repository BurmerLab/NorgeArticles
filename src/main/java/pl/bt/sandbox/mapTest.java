/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bt.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pl.pojo.Article;

/**
 *
 * @author Michał
 */
public class mapTest {
  public static Map<Integer, ArrayList<String>> articleParameters = new HashMap<Integer, ArrayList<String>>();
  
  public static void main(String[] args) {
    ArrayList<String> tab = new ArrayList<String>();
    tab.add("dupa");
    tab.add("kolo");
    tab.add("jiji");
    tab.add("yeyeye");
    tab.add("rerere");
    tab.add("gygygygy");
    
    ArrayList<String> src = new ArrayList<String>();
    tab.add("42342");
    tab.add("43242");
    tab.add("j43242iji");
    tab.add("34242");
    
    Map<Integer, ArrayList<String>> temp = new HashMap<Integer, ArrayList<String>>();
    ArrayList<String> tmp = new ArrayList<String>();
    
    for(int x=0; x<=tab.size(); x++){
      tmp.add(tab.get(x));
    }
      temp.put(1, tmp);
    
    for(int x=0; x<=src.size(); x++){
      
      tmp.add(src.get(x));
      temp.put(x, tmp);
    }
    
    
    
    
    
    articleParameters.put(1, tab);
    
    System.out.println("mapa: " + articleParameters.get(1));
  }
}
