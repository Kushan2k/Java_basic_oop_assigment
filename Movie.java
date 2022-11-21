import java.util.List;



//defining the movie class which inherit form video class
public class Movie extends Video {

  private Category category;

  //constructer
  public Movie(String aname) {
    super(aname);
    this.category = Category.UNDEFINED;

  }
  
  public Movie(String aname, String adescription, int aduration, int arating) {

    super(aname, adescription, aduration, arating);
    this.category = Category.UNDEFINED;

  }
  
  public Movie(String aname, List<Person> alist) {
    super(aname, alist);
    this.category = Category.UNDEFINED;
  }


  //getters and setters
  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category c) {

    this.category = c;
  }

  //method for showing informating
  public void getInformation() {

    System.out.println("----------Movie----------");
    super.getInformation();
    System.out.println("-------------------------");


  }

  

  
}
