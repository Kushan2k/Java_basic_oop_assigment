package Utils;
import Utils.Classes.Actor;
import Utils.Classes.Documentries;
import Utils.Classes.Episode;
import Utils.Classes.ImageThumbnail;
import Utils.Classes.Movie;
import Utils.Classes.Person;
import Utils.Classes.Profile;
import Utils.Classes.Series;
import Utils.Classes.User;
import Utils.Interfaces.Category;


//class for implementing testing fetures...
public class App {
  
  public App() {

    //creating a user and a profile
    System.out.println("============Profile=================");
    System.out.println();

    User user = new User("Kushan", "Gayantha", 22, 'M', "kushan2k", "*****");

    Profile profile = new Profile(user);
    profile.login();
    profile.setPrefferdCategory(Category.ADVANTURE);

    user.GetDetails();
    
    

    //crating a movie
    System.out.println("============moviei=================");
    System.out.println();
    Movie m1 = new Movie("Black Adam", "the man who cam from gods", 2, 5);
    m1.setImage(new ImageThumbnail("blackadm.png", 500, 600));
    m1.setCategory(Category.ACTION);

    Actor a1, a2, a3;
    
    //creating acotrs for the tv series
    a1 = new Actor("Dwayne", "Johnson", 50, 'M');
    a2 = new Actor("Sarah", "Shahi", 42, 'F');
    a3 = new Actor("Henry", "Cavill", 39, 'm');
    m1.addActor(a1);
    m1.addActor(a2);
    m1.addActor(a3);

    profile.AddToFavorite(m1);

    m1.getInformation();
    for (Person actor : m1.getActorList()) {

      actor.GetDetails();
      
    }


    
    //craetin a tv seirs object

    System.out.println("============Series=================");
    System.out.println();
    Series arrow = new Series("arrow", Category.ACTION);

    Episode e1, e2, e3;
    e1 = new Episode("pilot", "coming back", 45, 5, 1);
    e2 = new Episode("the hood", "killer in the city", 45, 4, 2);
    e3 = new Episode("oliver queen", "who is He", 50, 4, 3);
    Actor stephn = new Actor("Stephen", "Amell", 41, 'm');
    Actor felicity = new Actor("Emily", "Rickards", 31, 'f');

    e1.addActor(stephn);
    e1.addActor(felicity);
    e2.addActor(stephn);
    e2.addActor(felicity);
    e3.addActor(stephn);
    e3.addActor(felicity);

    arrow.addEpisode(e1);
    arrow.addEpisode(e2);
    arrow.addEpisode(e3);

    arrow.setRatings(5);

    arrow.getInformations();
    

    //documentries
    System.out.println("============Documentries=================");
    System.out.println();
    Documentries dc1 = new Documentries("ronaldo", "story of a footballer", 3, 5);

    Actor ronaldo = new Actor("christiano", "ronaldo", 37, 'm');
    dc1.addActor(ronaldo);
    dc1.setImage(new ImageThumbnail("ronaldo.png", 400, 450));
    dc1.setAbout("story of the ronaldo trying to be the best in the world");

    dc1.getInformation();

    for (Person actor : dc1.getActorList()) {

      actor.GetDetails();

    }
    

    profile.AddToFavorite(m1);
    profile.AddToFavorite(dc1);
    profile.AddToFavorite(e1);

    System.out.println("============User Favourites=================");
    System.out.println(profile.getFavorites());
    
    

    }
      
}
