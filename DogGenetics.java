/*
    Name: Kamil Xu 
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random; 


public class DogGenetics {

    private static void dogGen() {
        //take input of dogs name
        Scanner dogNamScanner = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogName = dogNamScanner.nextLine();

        //print out message with dogs name in bold by using ascii characters. if this does'nt work on your device delete the ascii codes
        System.out.println("Well then, I have this highly reliable report on " + "\033[0;1m" + dogName + "'s\033[0;0m" + 
        " prestigious background right here.\n");
        System.out.println("\033[0;1m" + dogName + "\033[0;0m" + " is:\n");

        //string with all of the dogs breeds
        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        //function to randomly generate 5 numbers and put them into the ArrayList. 
        //Using the ArrayList here is easier for inputting values into the list of arrays.
        //function iterates through the number of numbers required generating numbers accurately that are not 0, but all amount to a 100
        Random rand = new Random();
        ArrayList<Integer> randInts = new ArrayList<Integer>();
            int temp = 0;
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                if (!(i == 5)) {
                    temp = rand.nextInt((100 - sum) / (5 - i)) + 1;
                    randInts.add(temp);
                    sum += temp;
        
                } else {
                    int last = (100 - sum);
                    randInts.add(last);
                    sum += last;
                }
            }

        //for loop to print out all of the random values generated into the array list and to print out all of the dog breeds from the normal array
        for(int num = 0;num<5;num++){
            System.out.println(randInts.get(num) + "%   " + dogBreeds[num] );

        }
        System.out.println("\nWow, that's QUITE the dog!");
    }


    public static void main(String[] args) {
        //run the program
        dogGen();
      }
}
