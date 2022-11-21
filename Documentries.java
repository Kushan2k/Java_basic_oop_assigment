


//define Decumentires class as public which inherit form video abstract class
public class Documentries extends Video {

  //private about field
  private String about;

  //parameterized constructer
  public Documentries(String aname, String adescription, int aduration, int arating) {
    super(aname, adescription, aduration, arating);

  }
  
  //gettters and setters
  public void setAbout(String a) {
    this.about = a;
  }

  public String getAbout() {
    return this.about;
  }

  //overriding super class getInformation method
  @Override
  public void getInformation() {
    super.getInformation();
    System.out.println("About:- " + this.getAbout());
    System.out.println("==============");
  }
  
}
