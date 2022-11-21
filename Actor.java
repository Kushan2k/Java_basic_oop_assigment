
//importin relate classes from util package
import java.util.ArrayList;
import java.util.List;


//define public class acter which inherit from person
public class Actor extends Person {

  //private instance variables for actor 
  //encapsulate actors fields **
  private List<Movie> movieList;
  private int rating = 1;

  //construct
  public Actor(String afirstName, String alastName) {
    super(afirstName, alastName);
    this.movieList = new ArrayList<>();

  }
  
  public Actor(String afirstName, String alastName, int aage, char g) {
    super(afirstName, alastName, aage, g);
    this.movieList = new ArrayList<>();
  }

  //getters and setters
  public String getMyMovies() {
    return this.movieList.toString();
  }

  public List<Movie> getMyMoviesList() {
    return this.movieList;
  }
  
  public void setRating(int r) {
    if (r >= 1 && r <= 5) {
      this.rating = r;
    } else {
      this.rating = 1;
    }
  }

  public int getRatings() {
    return this.rating;
  }

  //override person's calss GetDetails methos (polymorephysm)
  public void GetDetails() {
    super.GetDetails();
    System.out.println("Movies:- " + this.getMyMovies());
    System.out.println("-----------------\n");
  }
  
}
