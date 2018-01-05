/*Author: Harish B
  Date 1/4/2018
  Feel free to fork and extend
  however, copy and paste this comment*/
import java.util.Scanner;
public class mort {
	public static double numprice;
	public static double numyears;
	public static double numrate;
	public static double mortgage;
	public static void main(String[] args){
		Scanner stuffie = new Scanner(System.in);
		mort2 mort2Object = new mort2();
		System.out.println("Would you like to calculate a monthly mortgage payment? Type yes or no.");
		String x = stuffie.next();
		if (x.equalsIgnoreCase("yes")){
			System.out.println("What is the price of the house?");
			double price = stuffie.nextDouble();
			System.out.println("What was your down payment percentage? Just type the percentage without the percent sign");
			double down = stuffie.nextDouble();
			numprice = price*(1-(down/100));
			System.out.println("What is the compound interest rate. Just type the percentage without the percent sign");
			numrate = stuffie.nextDouble();
			System.out.println("Would you like me to give you some suggestions to the amount of years for your mortgage?");
			System.out.println("Type yes or no to my offer.");
			String y = stuffie.next();
			if (y.equalsIgnoreCase("yes")){
				System.out.println("Amount of Years \t Mortgage payment per month");
				for (int z = 5; z<=30; z+=5){
					System.out.println(z+"\t\t\t $"+mort2Object.morter(numprice, z, numrate));
				}
			}else if(y.equalsIgnoreCase("no")) {
				System.out.println("How many years would your mortgage be?");
				numyears = stuffie.nextDouble();
				System.out.println("Your mortgage is $"+mort2Object.morter(numprice, numyears, numrate));
			}else{
				System.out.println("Please type whatever the question tells you too and not "+x);
			}
			
		}else if (x.equalsIgnoreCase("no")){
			
		}else{
			System.out.println("Please type whatever the question tells you too and not "+x);
		}
		System.out.println("Would you like to calculate a maximum loan?");
		x = stuffie.next();
		if (x.equalsIgnoreCase("yes")){
			System.out.println("What is your mortgage payment per month?");
			mortgage = stuffie.nextDouble();
			System.out.println("What is the compound interest rate. Just type the percentage without the percent sign");
			numrate = stuffie.nextDouble();
			System.out.println("Would you like me to tell you the amount for loans for certain years, or do you already have the amount of years?");
			System.out.println("Type yes or no");
			x = stuffie.next();
			if (x.equalsIgnoreCase("yes")) {
				System.out.println("Amount of Years \t Maximum Loan \t Money paid per year");
				for (int a = 5; a<=30; a+=5){
					System.out.println(a+"\t\t\t $"+mort2Object.loaner(mortgage, a, numrate)+" \t $"+Math.round(100*(mort2Object.loaner(mortgage, a, numrate))/a)/100.0);
				}
			}else if (x.equalsIgnoreCase("no")){
				System.out.println("For how many years do you plan to pay your mortgage.");
				numyears = stuffie.nextDouble();
				System.out.println("Your maximum loan is $"+mort2Object.loaner(mortgage, numyears, numrate));
			}else{
				System.out.println("Please type whatever the question tells you too and not "+x);
			}
		}System.out.println("Have a nice day!");
	}	
}
