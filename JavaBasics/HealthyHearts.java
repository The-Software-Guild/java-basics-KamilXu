package JavaBasics;
/*
    Name: Kamil Xu 
    HealthyHearts
*/
import java.util.Scanner;

public class HealthyHearts {

    public static void yourHealth() {
        //ask for and take in users age
        Scanner askAge = new Scanner(System.in);
        System.out.print("What is your age?");
        int age = askAge.nextInt();
        //calculate maximum heart rate
        double max = 220 - age;
        System.out.println("Your maximum heart rate should be " + max +" beats per minute");
        
        //accurately calculate HR Zone and round it to the nearest whole number using Meth.ceil function
        double lower_percentage =  (double)Math.ceil((max*(50.0f/100.0f)));
        double higher_percentage = (double)Math.ceil((max*(85.0f/100.0f)));
        
        //Print out the HR Zones as a whole number with 0 decimal places
        System.out.println("Your target HR Zone is " + String.format("%.0f", lower_percentage) + " - " + String.format("%.0f", higher_percentage) + " beats per minute");
    }

    public static void main(String[] args) {
        //run the program
        yourHealth();
    }
}
