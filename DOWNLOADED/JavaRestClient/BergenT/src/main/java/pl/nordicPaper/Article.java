/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.nordicPaper;

/**
 *
 * @author Michał
 */
public class Article {
  
  private long id;
  private String href;
  private String title;
  private String image;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
  
}
