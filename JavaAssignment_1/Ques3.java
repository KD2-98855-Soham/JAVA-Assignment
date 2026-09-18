import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int quantity;
		double totalBill = 0;
		
		while(true) {
			System.out.println("--------Menu--------");
			System.out.println("1. Dosa       - Rs. 50");
            System.out.println("2. Samosa     - Rs. 20");
            System.out.println("3. Idli       - Rs. 40");
            System.out.println("4. Vada       - Rs. 30");
            System.out.println("5. Misal      - Rs. 60");
            System.out.println("6. Poha       - Rs. 30");
            System.out.println("7. Upma       - Rs. 35");
            System.out.println("8. Tea        - Rs. 15");
            System.out.println("9. Coffee     - Rs. 25");
            System.out.println("10. Generate Bill");
            
            System.out.println("Enter the choice :");
            choice = sc.nextInt();
            
            if(choice==10) {
            	break;
            }
            
            if(choice <1 || choice > 10) {
            	System.out.println("Invalid choice!!");
            }
            
            System.out.print("Enter the quantity :");
            quantity = sc.nextInt();
            
            if(quantity <= 0) {
            	System.out.println("Invalid quantity");
            }
            
            switch(choice) {
            
            case 1:
                totalBill = totalBill + (50 * quantity);
                System.out.println("Dosa added to cart.");
                break;

            case 2:
                totalBill = totalBill + (20 * quantity);
                System.out.println("Samosa added to cart.");
                break;

            case 3:
                totalBill = totalBill + (40 * quantity);
                System.out.println("Idli added to cart.");
                break;

            case 4:
                totalBill = totalBill + (30 * quantity);
                System.out.println("Vada added to cart.");
                break;

            case 5:
                totalBill = totalBill + (60 * quantity);
                System.out.println("Misal added to cart.");
                break;

            case 6:
                totalBill = totalBill + (30 * quantity);
                System.out.println("Poha added to cart.");
                break;

            case 7:
                totalBill = totalBill + (35 * quantity);
                System.out.println("Upma added to cart.");
                break;

            case 8:
                totalBill = totalBill + (15 * quantity);
                System.out.println("Tea added to cart.");
                break;

            case 9:
                totalBill = totalBill + (25 * quantity);
                System.out.println("Coffee added to cart.");
                break;
            	
            	
            }
            
		}
		 System.out.println("Total Bill = Rs. " + totalBill);
		 System.out.println("Thank you! Visit again.");
		 
		 sc.close();
	}

}
