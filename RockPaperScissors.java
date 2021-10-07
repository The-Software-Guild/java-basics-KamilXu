/*
    Name: Kamil Xu 
*/
import java.util.Scanner;
import java.util.Random; 

public class RockPaperScissors {

    public static void RPSMethod(){
        try{
            //array to hold all the choosing options for user and computer
            String[] RPS = {"Rock", "Paper", "Scissors"};

            //create and instance of Random class
            Random rand = new Random();

            //scores
            int wins = 0;
            int draws = 0;
            int losses = 0;

            //take input of number of rounds
            Scanner roundsInput = new Scanner(System.in);
            System.out.println("\nWelcome to Rock Paper Scissors Game!");
            System.out.println("How many rounds would you like to play? Choose between 1 and 10:");
            int rounds = roundsInput.nextInt();

            //check if the number of rounds is correct between 1 and 10
            if(rounds < 1 || rounds > 10){
                System.out.println("Error, Invalid number of rounds. The program will now close.");
                System.exit(1);
            }else{
                System.out.println("You have chosen to play " + rounds + " rounds");
            }

            //while loop to run the number of rounds
            int round_num = 1;
            while(rounds > 0){
                System.out.println("\n-------------------- Round " + round_num + " --------------------");
                System.out.println("Choose 1 for Rock, 2 for Paper, 3 for Scissors");

                //user input and AI random generated answer
                int choice = roundsInput.nextInt();
                int rand_int = rand.nextInt(3);
                int ai_array_choice = rand_int;

                //print out user and AI choice
                if(choice == 1){
                    System.out.println(RPS[0] + " vs " + RPS[ai_array_choice]);
                }else if(choice == 2){
                    System.out.println(RPS[1] + " vs " + RPS[ai_array_choice]);
                }else if(choice == 3){
                    System.out.println(RPS[2] + " vs " + RPS[ai_array_choice]);
                }else{
                    System.out.println("Error, Not a valid choice. The program will now close.");
                    System.exit(1);
                }

                //compare user and AI choices and add to score counter
                int ai_choice = ai_array_choice + 1;
                //Draws
                if(choice == ai_choice){
                    System.out.println("tie");
                    draws++;
                //Losses
                }else if((choice == 1 && ai_choice == 2) || (choice == 2 && ai_choice == 3) || (choice == 3 && ai_choice == 1)){
                    System.out.println("computer win");
                    losses++;
                //Wins
                }else if((choice == 1 && ai_choice == 3) || (choice == 2 && ai_choice == 1) || (choice == 3 && ai_choice == 2)){
                    System.out.println("user win");
                    wins++;
                }
                //keeps decrementing until the user is out of rounds and incrementing on which round the user is on
                round_num++;
                rounds--;
            }

            System.out.println("\n------------------ Score Board ------------------");

            //prints out final result and scores
            if(losses > wins){
                System.out.println("You lost! Better luck next time.");
            }else if(wins > losses){
                System.out.println("Congratulations! You win.");
            }else{
                System.out.println("Tie! It was a draw");
            }
            System.out.println("Wins = " + wins + ", Draws = " + draws + ", Losses = " + losses );

            //check if the user would like to play again
            Scanner answer = new Scanner(System.in);
            System.out.println("Would you like to play again?");
            String userAnswer = answer.nextLine(); 

            //switch case changes user input to lower case to avoid casing issues and runs the program again or exits the program depending on the users choice
            switch(userAnswer.toLowerCase()){
                case "yes":
                    RPSMethod();
                    break;
                case "no":
                    System.out.println("\nThanks for playing!\n");
                    break;
            }
        }catch(Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void main(String[] args) {
        //run the program
        RPSMethod();
      }
}