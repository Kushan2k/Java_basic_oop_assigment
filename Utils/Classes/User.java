package Utils.Classes;

import java.util.Scanner;


//defining the class user which inherit form person abstract class
public class User extends Person {
  
  private String username, password;

  public User(String afirstName, String alastName, int aage, char g,String username,String password){
    super(afirstName, alastName, aage, g);
    this.username = username;
    this.password = password;

  }
  
  public User(String afirstName, String alastName, String username, String password) {
    super(afirstName, alastName);
    this.username = username;
    this.password = password;
  }
  
  public void setUsername(String u) {
    this.username = u;
  }

  public String getUsername() {
    return this.username;
  }

  //setter for password
  public void setPassword(String s) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter current password:- ");
    String cp = in.nextLine();
    if (cp.equals(this.password)) {
      System.out.println("Enter new password:- ");
      this.password = in.nextLine();
    } else {
      System.out.println("Passwords don't match!");
    }
    in.close();
  }
  
}
