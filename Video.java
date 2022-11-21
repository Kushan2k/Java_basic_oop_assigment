

// importing relavent classes 
import java.util.List;

import java.util.ArrayList;


// video class declearation 
//video class is decleard abstract so no objects can be created
public abstract class Video implements IVideo {
  
  //instance variables for videos class
  
  protected String name,description;
  protected List<Person> actors;
  protected int duration=0, rating,playSate=0;
  protected ImageThumbnail img;

  // parameterized constructors 
  public Video(String aname, List<Person> alist) {
    this.name = aname;
    this.actors = new ArrayList<>();
    this.actors.addAll(alist);
  }

  public Video(String aname, String adescription, int aduration, int arating) {
    this.name = aname;
    this.description = adescription;
    this.duration = aduration;
    this.actors = new ArrayList<>();
    this.setRating(arating);
  }



  // default constructor 
  public Video(String aname) {
    this.actors = new ArrayList<>();
    this.name = aname;
  }

  // getters and setters 
  public void setVideoName(String n) {
    this.name = n;
  }

  public void setImage(ImageThumbnail img) {
    if (img instanceof ImageThumbnail) {
      this.img = img;
    } else {
      this.img = null;
    }
  }


  //getters and setters
  public ImageThumbnail getImage() {
    return this.img;
  }

  public String getActors() {
    return this.actors.toString();
  }

  // overload getactors method 
  public List<Person> getActorList() {
    return this.actors;
  }

  public String getVideoName() {
    return this.name;
  }

  public void addActor(List<Person> l) {
    this.actors.addAll(l);
  }

  public void addActor(Person p) {
    this.actors.add(p);
  }

  public void setDescription(String des) {
    this.description = des;
  }

  public String getDescription() {
    return this.description;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int r) {

    if (r >= 1 && r <= 5) {
      this.rating = r;
    } else {
      this.rating = 1;
    }

  }
  
  public int getDuration() {
    return this.rating;
  }

  public void setDuration(int d) {
    this.duration = d;
  }


  //overiding the super class getInformation method

  @Override
  public void getInformation() {

    String res = String.format("Name:- %s\nRatings:- %d\nDuration:- %d\nActors:- %s", this.getVideoName(),
        this.getRating(),
      this.getDuration(),
        this.getActors());
    System.out.println(res);

  }
  

  //overriding the interface methods
  @Override
  public void play() {
    this.playSate = 1;
    System.out.println("Playing!");
    
    
  }

  @Override
  public void pause() {
    this.playSate = 0;
    System.out.println("Paused!");
    
  }

  @Override
  public boolean isPaused() {
    if (this.playSate == 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    
    return this.name;
  }

  
  
}
