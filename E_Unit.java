/*
8. Write a program to input electricity unit charge and calculate the total 
	electricity bill according to the given condition:

	For first 50 units Rs. 0.50/unit 50
	For next 100 units Rs. 0.75/unit 100
	For next 100 units Rs. 1.20/unit 200
	For unit above 250 Rs. 1.50/unit 250

	300 
	50 - 0.50 = 25
	100 - 0.75=75
	100 - 1.20 = 120
	50 - 1.50  = 75   total - 295

*/
import java.util.Scanner;
public class E_Unit{
	public static void main(String[] args){
		int unit;
		double bill=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Unit : ");
		unit = scr.nextInt();
		if(unit>250){
			unit=unit-250;
			bill=25+75+120+(unit*1.5);			
		}
		else if(unit>200 && unit<=250){
			unit=unit-150;
			bill=25+75+(unit*1.20);
		}
		else if(unit>100 && unit<=200){
			unit=unit-50;
			bill=25+(unit*0.75);
		}
		else{
			bill=unit*0.5;		
		}
		System.out.println(bill);

	}
}