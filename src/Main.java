import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String trash = "";
        double meters = 0;
        double inches = 0;
        double feet = 0;
        double miles = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the measurement in meters: ");

        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
        }
        else
        {
            System.out.println("You entered the measurement of: " + trash );
            System.out.println("Please enter a correct measurement.");
            System.exit(0);
        }

        inches = meters * 39.37;
        feet = meters * 3.281;
        miles = meters / 1609;

        System.out.println("The the measurement of " + meters + ", the value would be " + inches + " inches");
        System.out.println("The the measurement of " + meters + ", the value would be " + feet + " feet");
        System.out.println("The the measurement of " + meters + ", the value would be " + miles + " miles");

    }
}