import java.io.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    // Defining The String For Welcome
    String welcome = "Welcome To This Survey. In This Survey, @CapitalFront Is Asking Repl.it Users To See If The Platform Is Good Or Not.";
    // Defining The String For Login
    String login = "Please Enter Your Repl.it Username, So I Can List The Survey Submitters";
    String Question1 = "Do Repl.it's Dark Mode Good? Say Yes Or No";
    String message = "Thanks For Submitting Your Username! ";
    String ifyes = "So, You Liked The Dark Mode! That's Good Opinion";
    String ifnot = "You Don't Like It That's Ok :)";
    // Defining The Inputs
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    // Printing The Questions And Inputs
    // Printing The Welcome String
    System.out.println("" + welcome + "");
    // Printing The Login Form
    System.out.println("" + login + "");
    String usernameforlog = br.readLine();
    System.out.println("" + message + "" + usernameforlog + "");
    System.out.println("" + Question1 + "");
    String questionone = br.readLine();
    // A Conditioner
    if (questionone == ("Yes"))
    {
      System.out.println("" + ifyes + "");
    }
    
    else if (questionone == ("No")) {
      System.out.println("" + ifnot + "");
    };
  }
}
