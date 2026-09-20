import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number :");
		int accno = sc.nextInt();
		
		System.out.print("Enter balance at the begining of month :");
		int beginingBalance = sc.nextInt();
		
		System.out.print("Enter total of all items charged this month :");
		int totalitemCharged = sc.nextInt();
		
		System.out.print("Enter total credits applied this month :");
		int totalCredit = sc.nextInt();
		
		System.out.print("Enter allowed credit limit :");
		int allowedCredit = sc.nextInt();
		
		
		int newBalance = beginingBalance+totalitemCharged-totalCredit;
		
		System.out.println("New balance :"+newBalance);
		
		if(newBalance > allowedCredit) {
			System.out.print("Credit limit is exceeded.");
		}
		else {
			System.out.print("Credit limit not exceeded.");
		}
		
		sc.close();
		

	}

}
