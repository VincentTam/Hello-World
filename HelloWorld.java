import java.util.Scanner;
public class HelloWorld {
	public static void main (String[] args) {
		System.out.print("Enter your name: ");
		Scanner input = new Scanner(System.in);
		String user_name = input.next();
		System.out.println("Hello world, " + user_name + "!");
	}
}	
// vim:sw=4: 
