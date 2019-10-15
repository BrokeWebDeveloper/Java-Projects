import java.io.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    // Defining String With Variable And (Value Of Course!)
    String loginwelcome = "Welcome To The AltDel Quiz! To Do The Quiz You Have To First Login Using Username Then Password";
    String q1 = "What Programming Language Is Used For Making Game In Unity?";
    String ifq1csharp = "Well, How Did You Know? It's Correct!";
    String ifq1else = "Nope! It Is Not That Programming Language It Is C#!";
    String q2 = "Who Was The Inventor Of The Classic Hello, World Program? and What Was The Programming Language Of The Book He Made about?";
    String q2ifbriankernighan = "Well, Correct! How Did You Know? You Must Have Read Documentaries Like Me.";
    String q3 = "Do You Use Github, And If So, What Is Your Profile Name?";
    String q3ifusegithub = "Then, I You Use GitHub You're One Of The 60% Of Developers That Publish Open Source Programs! You're Sharing! Knowledge You Know.";
    // Defining The Input 
    InputStreamReader r=new InputStreamReader(System.in); 
    BufferedReader br=new BufferedReader(r);
    // Printing The Questions And Input
    // Printing The First Question
    System.out.println(" Q1. Level : Moderate " + q1 + "");
    String q1s = br.readLine();
    // The If And Else Of Question 1
    if (q1s == ("C#"))
    {
      System.out.println("" + ifq1csharp + "");
    }

    else if (q1s == ("C++")) {
      System.out.println("" + ifq1csharp + "");
    }

    else {
      System.out.println("It Is Not That Language!");
    }
    // Printing The Second Question
    System.out.println("Q2. Level : Medium " + q2 + "");
    String q2s = br.readLine();
  }
}
