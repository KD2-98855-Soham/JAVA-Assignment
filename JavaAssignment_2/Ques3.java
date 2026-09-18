import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
}

public class Ques3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date d1 = new Date(1,1,2020);
		System.out.print("Date is :");
		d1.displayDate();
		
		d1.setDay(25);
		d1.setMonth(07);
		d1.setYear(2003);
		
		System.out.print("Updated date is :");
		d1.displayDate();
		
		System.out.println("Day :" + d1.getDay());
		System.out.println("Month :" + d1.getMonth());
		System.out.println("Year :" + d1.getYear());
		
		sc.close();
		
	}
}
