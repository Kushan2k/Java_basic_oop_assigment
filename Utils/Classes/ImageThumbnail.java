package Utils.Classes;

//creating class for holding the image details
public class ImageThumbnail {
  
  private String src;
  private int width, height;

  //consructor
  public ImageThumbnail(String src, int w, int h) {
    this.src = src;
    this.width = w;
    this.height = h;
  }

  //getters and setters
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  
}
