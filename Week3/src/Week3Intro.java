import java.util.Scanner;

//Spencer Davis

public class Week3Intro {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter you name: ");
		int n = in.nextInt();
		
		System.out.println("Hello " + n + "! Day 2 already!");
		
		
		if (n > 10) {
		       System.out.print("*****");
		}
		
		if (n > 7) { 
		       System.out.print("****"); 
		}
		
		if (n > 4) { 
		       System.out.print("***"); 
		}
		
		if (n > 1) { 
		       System.out.print("**"); 
		}
		
		System.out.println("*");
		
		in.close();
	}	
}
