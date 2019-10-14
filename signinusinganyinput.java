import java.io.*;  
public class Main
{  
public static void main(String args[])throws Exception
     {  
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
  
        System.out.println("Enter Username And Password");
        System.out.println("Please Enter You Username First, Then Password.");
        String Username=br.readLine();  
        System.out.println("Password? "+Username);
        String Password=br.readLine();
        System.out.println("Password : ************");
        System.out.println("Successfuly Logged In!");
     }  
}
