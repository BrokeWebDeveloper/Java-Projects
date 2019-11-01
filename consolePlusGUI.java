import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.util.concurrent.*;
public class consolePlusGUI
{
	public static void main(String[] args)throws Exception
	{
		// defining the user input objects
		// Java.io
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		// java.util.Scanner
		Scanner scanner = new Scanner(System.in);
		// Making strings with value
	    String intro = "Thanks for downloading this program created by BrokeWebDeveloper!";
	    String description = "This program is what I made in 30 min, with an unexpected elements. Which is combining Console and GUI.";
	    String satornot = "Are you satisfied with this program? (y/n)";
	    String ifsat = "Thanks! even though I made this in 30 min, you still liked it! :)";
	    String ifno = "Ok then. I made this in 30 min, I expected that you don't liked it anyway. :(";
	    String startornot = "Do you want to start the GUI program? (y/n)";
	    String ifyesone = "Ok.. the program will start........";
	    String ifnoone = "Ok.. the program will close.........";
	    // Printing the commands
	    System.out.println("" + intro + "");
	    System.out.println("" + description + "");
	    System.out.println("" + satornot + "");
	    String satornotscan = scanner.nextLine();
	    if (satornotscan.equalsIgnoreCase("y"))
	    {
	    	System.out.println("" + ifsat + "");
	    }
	    
	    else if (satornotscan.equalsIgnoreCase("n"))
	    {
	    	System.out.println("" + ifno + "");
	    }
	    
	    else 
	    {
	    	System.out.println("Sorry, you typed the wrong command run the program, please run the program again.");
	    	TimeUnit.SECONDS.sleep(5);
	    	System.exit(0);
	    }
	    System.out.println("" + startornot + "");
	    String startornotscan = scanner.nextLine();
	    if (startornotscan.equalsIgnoreCase("y"))
	    {
	    	System.out.println("" + ifyesone + "");
		    // Creating the GUIS
		    JFrame f = new JFrame("Console PLUS GUI Application!");
		    JLabel jlone = new JLabel("You've got HAX! more information on why you got HAX! http://jabrils.com or https://www.youtube.com/jabrils");
		    JLabel jltwo = new JLabel("Credits to :");
		    JLabel jlthree = new JLabel("GUI: BrokeWebDeveloper, Console: BrokeWebDeveloper (Not the actual console itself, it's invented by microsoft)");
	        jlone.setBounds(100, 420, 700, 50);
	        jltwo.setBounds(100, 440, 700, 50);
		    jlthree.setBounds(100, 460, 700, 50);
		    f.add(jlone); f.add(jltwo); f.add(jlthree);
		    f.setSize(1000, 1000);
		    f.setLayout(null);
	    	f.setVisible(true);
	    }
	    
	    else if (startornotscan.equalsIgnoreCase("n"))
	    {
	    	System.out.println("" + ifnoone + "");
            TimeUnit.SECONDS.sleep(2);
            System.exit(1);
	    }
	    
	    else 
	    {
	    	System.out.println("Sorry, you typed the wrong command run the program, please run the program again.");
	    }
	}
}
