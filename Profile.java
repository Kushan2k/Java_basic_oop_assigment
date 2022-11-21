

import java.util.ArrayList;
import java.util.List;

//implementing Iprofile interface
public class Profile implements IProfile {

  //instance variables for profile class

  private boolean isLoggedin = false;
  private User user;
  private List<Video> favoriteList;
  private Category preferdCategory;
  

  public Profile(User user) {
    this.user = user;
    this.favoriteList = new ArrayList<>();
    this.preferdCategory = Category.UNDEFINED;
  }

  

  //setters and getters
  public void setPrefferdCategory(Category c) {
    this.preferdCategory = c;
  }

  public Category getPrefferdCategory() {
    return this.preferdCategory;
  }

  public void AddToFavorite(Video v) {
    this.favoriteList.add(v);
  }

  public List<Video> getFavoriteList() {
    return this.favoriteList;
  }

  public String getFavorites() {
    return this.favoriteList.toString();
  }

  @Override
  public boolean login() {
    this.isLoggedin = true;

    return true;

  }

  public User getUser() {
    return this.user;
  }

  @Override
  public void logout() {
    this.isLoggedin = false;
    
  }

  @Override
  public void remove() {
    System.out.println("profile deleted!");

  }
  
  public boolean isLoggedIn() {
    return this.isLoggedin;
  }

  @Override
  public boolean register() {
    System.out.println("Register Successful");
    return true;
  }
  
}
