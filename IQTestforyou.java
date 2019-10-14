import java.io.*;
public class MyClass
{
    public static void main(String args[])throws Exception
    {
        // Defining The Method For Keyboard Input In Console
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        // Defining Strings With Variable 
        String Question = "What Is You Hobby?";
        String Answer = "Write Your Answer Below.";
        String Outro = "Thank You For Participating In The Test, We Hope You Get IQ Above 100";
        String Congratulate = "Congratulations! Your IQ is 100000 Nope. It Is 200.";
        String Thanks = "Thanks For Participating! ";
        // Printing String With Questions With Some Answers Containing Input
        System.out.println("Q1. " + Question + " " + Answer + "");
        String Q2=br.readLine();
        System.out.println("Q2. What Is Your Username?");
        String Q3=br.readLine();
        System.out.println("" + Outro + "");
        System.out.println("" + Congratulate + "");
        System.out.println("" + Thanks + "" + Q3 + ".");
    }
}
