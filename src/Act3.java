import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[5];
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Enter a number " + (i + 1) + ": ");
			numbers[i] = scanner.nextDouble();	
		}
		
		double sum = 0;
		
		for(double num : numbers) {
			sum += num;
		}
		
		double average = sum / numbers.length;
		
		System.out.print("\nSum: " + sum);
		System.out.print("\nAverage: " + average);
		
		scanner.close();
	}

}
