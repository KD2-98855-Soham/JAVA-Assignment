import java.util.Scanner;


public class Ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		
		System.out.println("Given number is :" + n);
		System.out.println("Binary equivalent of  number is :" + Integer.toBinaryString(n));
		System.out.println("Octal equivalent of number is :" + Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent of number is :" + Integer.toHexString(n));
		
		sc.close();

	}

}
