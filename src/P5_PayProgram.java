import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		double pay = computePay(hourlyRate, numOfHoursWorked); 
		System.out.println("Total Pay = " + pay);

	}
	public static double computePay(double hourlyRate, int numOfHoursWorked) {
		double computePay; 
		if(numOfHoursWorked <= 40)  
			computePay = hourlyRate * numOfHoursWorked; 
		else 
			computePay = (hourlyRate * numOfHoursWorked) + (1.5 * (hourlyRate * (numOfHoursWorked - 8))); 
		return computePay; 

	}

}
