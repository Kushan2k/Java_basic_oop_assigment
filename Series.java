

import java.util.ArrayList;
import java.util.List;


//class for tv series
public class Series {
  
  private List<Video> epiList;
  private String name;
  private int noOfEpisodes;
  private int ratings = 1;
  private Category category;

  public Series(String name, Category cat) {
    this.name = name;
    this.category = cat;
    this.epiList = new ArrayList<>();

  }

  public List<Video> getEpisodeList() {
    return epiList;
  }

  public String getEpisodes() {
    return epiList.toString();
  }

  public void addEpisodeList(List<Video> epiList) {
    this.epiList.addAll(epiList);
    this.noOfEpisodes = this.epiList.size();
  }

  public void addEpisode(Video v) {
    this.epiList.add(v);
    this.noOfEpisodes = this.epiList.size();
  }

  public String getName() {
    return name;
  }

  public int getNoOfEpisodes() {
    return noOfEpisodes;
  }

  public int getRatings() {
    return ratings;
  }

  public void setRatings(int ratings) {
    if (ratings >= 1 && ratings <= 5) {
      this.ratings = ratings;
    } else {
      this.ratings = 1;
    }
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public void getInformations() {
    String res = String.format("Name:- %s\n# of Episodes:- %d\nRatings:- %d\nCategory:- %s\nEpisodes:- %s",
        this.getName(), this.getNoOfEpisodes(), this.getRatings(), this.getCategory(), this.getEpisodes());
    
    System.out.println(res);
        System.out.println("---------------------");
  }
  
  

  
}
