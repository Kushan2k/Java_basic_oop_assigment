package Utils.Classes;

//importing relavent clasess
import java.util.List;

//creating the class Episode which inherit from video class
public class Episode extends Video {

  private int epiNo;

  //constructor
  public Episode(String aname, String adescription, int aduration, int arating,int no) {
    super(aname, adescription, aduration, arating);
    this.epiNo = no;

  }
  //overload constructors
  public Episode(String aname, List<Person> alist) {
    super(aname, alist);
  }

  public Episode(String aname, int no) {
    super(aname);
    this.epiNo = no;

  }

  //getters and setters
  public int getEpisodeNumber() {
    return epiNo;
  }

  public void setEpisodeNumber(int epiNo) {
    this.epiNo = epiNo;
  }
  
  //overriding tostring method
  @Override
  public String toString() {
    return String.format("%d-%s", this.getEpisodeNumber(),this.getVideoName());
  }
  
  

}
