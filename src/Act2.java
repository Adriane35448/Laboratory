import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		int n1 = 0, n2 = 1, sum;
		
		
		System.out.print("\nFibonacci Series up to " +n+ " terms: ");
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print(n1 + " ");
			
			sum = n1 + n2;
			
			n1 = n2;
			
			n2 = sum;
		}
		
		scanner.close();

	}

}
