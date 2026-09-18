
import java.util.Scanner;
class Invoce{
	private String partnum;
	private String partdisc;
	private int quantity;
	private double price;
	
	
	public Invoce() {
		
	}
	
	public Invoce(String partnum, String partdisc, int quantity, double price){
		this.partnum = partnum;
		this.partdisc = partdisc;
		this.quantity = quantity;
		this.price = price;
		
		
		if(price>0)
		{
			this.price =price;
		}
		else
		{
			this.price = 0;
		}
		
	}
	
	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}
	
	public void setPartdisc(String partdisc) {
		this.partdisc = partdisc;
	}
	
	public void setQuantity(int quantity) {
		
		if (quantity < 0) {
			this.quantity = 0;
		}
		else{
			this.quantity = quantity;
		}
	}
	
	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0.0;
		}
		else {
			this.price = price;
		}
	}
	
	public String getPartnum() {
		return partnum;
	}
	
	public String getPartdisc() {
		return partdisc;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getinvoiceAmount() {
		return quantity*price;
	}
	
	

}

public class Ques1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the part number :");
		String partnum= sc.nextLine();
		
		System.out.print("Enter the part descriptin :");
		String partdisc= sc.nextLine();
		
		System.out.print("Enter the part quantity :");
		int quantity= sc.nextInt();
		
		System.out.print("Enter the part price :");
		double price= sc.nextDouble();
		
		Invoce inv = new Invoce(partnum,partdisc,quantity,price);
	
		
		System.out.println(inv.getinvoiceAmount());
	}
	

}
