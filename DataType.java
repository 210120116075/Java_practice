import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String str = scr.next();
        System.out.println("Enter Your Age : ");
        byte age = scr.nextByte();
        System.out.println("Enter Your 12th Rank : ");
        short rank = scr.nextShort();
        System.out.println("Enter Your Country Pincode : ");
        int pin = scr.nextInt();
        System.out.println("Enter Your Mobile Number : ");
        long mo = scr.nextLong();
        System.out.println("Enter Your 12th Marks : ");
        float mark = scr.nextFloat();
        System.out.println("Enter Your 1st Sem SPI : ");
        double spi = scr.nextDouble();
        scr.nextLine();
        System.out.println("Enter Your Address : ");
        String add = scr.nextLine();
        System.out.println("Enter Your Gender : ");
        char g = scr.next().charAt(0);
        System.out.println("Your Are Aligible For Voting (18+) : ");
        boolean vote = scr.nextBoolean();

        // printing

        System.out.println("Name : " + str);
        System.out.println("Age : " + age);
        System.out.println("Rank : " + rank);
        System.out.println("Pincode : " + pin);
        System.out.println("Mobile Number : " + mo);
        System.out.println("12th Marks : " + mark);
        System.out.println("1st Sem SPI : " + spi);
        System.out.println("Adsress : " + add);
        System.out.println("Gender : " + g);
        System.out.println("Aligible or not for voting : " + vote);
    }
}
