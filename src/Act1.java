import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = scanner.nextLine();
		
		System.out.print("\nEnter your Age: ");
		int age = scanner.nextInt();
		
		
		System.out.print("\nMy name is "+name+ ", ");
		System.out.print("I am "+age+" years old, ");
		
		scanner.close();
	}

}
