import java.io.*;
public class MyClass
{
    public static void main(String args[])throws Exception
    {
        // Defining The Variables And Values
        String Topic1 = "If Statements In Java.";
        String Topic1sentence = "An if statement can be used in EVERY language.";
        // Defining The Input Functions/Methods
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        // Printing The Strings
        System.out.println("Enter You Username First Then Password To Log In");
        // Username Input Method
        String enterusername = br.readLine();
        System.out.println("Welcome! " + enterusername + " Now Enter You Password. ");
        // Password Input Method
        String enterpassword = br.readLine();
        System.out.println("Logged In! Username:  " + enterusername + " Password: " + enterpassword + "" );
        System.out.println("Topic: " + Topic1 + ".");
        System.out.println("Paragraph1: " + Topic1sentence + "");
    }
}
