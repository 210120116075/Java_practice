/*6. count total no of notes in given amount - 1552
	500 - 3
	200-0
	100-0
	50 - 1
	10-0
	5-0
	1 - 2

7. Write a program to take input from user in seconds and convert into hours and minutes.

	10000 - 2 :46 : 40*/
/*
import java.util.Scanner;
public class CountNotes{
	public static void main(String[] Args){
		int amt,a500,a200,a100,a50,a10,a5,a1;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		amt = scr.nextInt();
		a500=amt/500;
		amt=amt-(a500*500);

		a200=amt/200;
		amt=amt-(a200*200);

		a100=amt/100;
		amt=amt-(a100*100);

		a50=amt/50;
		amt=amt-(a50*50);

		a10=amt/10;
		amt=amt-(a10*10);

		a5=amt/5;
		amt=amt-(a5*5);

		a1=amt/1;
		amt=amt-(a1*1);

		System.out.println("500 : "+a500);
		System.out.println("200 : "+a200);
		System.out.println("100 : "+a100);
		System.out.println("50 : "+a50);
		System.out.println("10 : "+a10);
		System.out.println("5 : "+a5);
		System.out.println("1 : "+a1);
	}
}*/
/*
import java.util.Scanner;
public class CountNotes{
	public static void main(String[] Args){
		int sec,hr,min;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Seconds : ");
		sec = scr.nextInt();
		hr = sec/3600;
		sec = sec-(hr*3600);
		
		min=sec/60;
		sec = sec-(min*60);
		
		System.out.println(hr+" : "+min+" : "+sec);
	}
}*/

/*
8. Write a program to input electricity unit charge and calculate the total 
	electricity bill according to the given condition:

	For first 50 units Rs. 0.50/unit
	For next 100 units Rs. 0.75/unit
	For next 100 units Rs. 1.20/unit
	For unit above 250 Rs. 1.50/unit

	300 
	50 - 0.50 = 25
	100 - 0.75=75
	100 - 1.20 = 120
	50 - 1.50  = 75   total - 295
*/


import java.util.Scanner;
public class CountNotes{
	public static void main(String[] Args){
		int unit;
		double bill=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Electricity Unit : ");
		unit = scr.nextInt();
		if(unit>250){
			unit=unit-250;
			bill=25+75+120+(unit*1.5);
		}
		else if(unit<=200 && unit>100){
			unit=unit-150;
			bill=25+75+(unit*1.20);
		}
		else if(unit<=100 && unit>50){
			unit=unit-150;
			bill=25+(unit*0.75);
		}
		else{
			bill=(unit*0.5);
		}
		System.out.println(bill);
	}
}