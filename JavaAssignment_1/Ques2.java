import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first double value :");
		if (!sc.hasNextDouble()) {
	        System.out.println("Error: First input is not a valid double value.");
	        return;
	    }
		double n1 = sc.nextDouble();
		
		System.out.print("Enter second double value :");
		if (!sc.hasNextDouble()) {
	        System.out.println("Error: Second input is not a valid double value.");
	        return;
	    }
		double n2 = sc.nextDouble();
		
		double avg = (n1+n2)/2;
		
		System.out.println("The first number is :" + n1);
		System.out.println("The second number is :" + n2);
		System.out.println("The average of two double number is :" + avg);
		
		
		sc.close();
		
		
	}

}
