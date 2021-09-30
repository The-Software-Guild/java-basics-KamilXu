/*
    Name: Kamil Xu 
*/
import java.util.Scanner;
import java.util.Random; 

public class RockPaperScissors {

    public static void RPSMethod(){
        //array to hold all the choosing options for user and computer
        String[] RPS = {"Rock", "Paper", "Scissors"};
        //create and instance of Random class
        Random rand = new Random();
        //scores
        int wins = 0;
        int draws = 0;
        int losses = 0;
    
        Scanner roundsInput = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper Scissors Game!");
        System.out.println("How many rounds would you like to play? Choose between 1 and 10:");
        int rounds = roundsInput.nextInt();
        if(rounds < 1 || rounds > 10){
            System.out.println("Error, Invalid number of rounds. The program will now close.");
            System.exit(1);
        }else{
            System.out.println("You have chosen to play " + rounds + " rounds");
        }
        int round_num = 1;
        while(rounds > 0){
            System.out.println("\n-------------------- Round " + round_num + " --------------------");
            System.out.println("Choose 1 for Rock, 2 for Paper, 3 for Scissors");

            int choice = roundsInput.nextInt();
            int rand_int = rand.nextInt(3);
            int ai_array_choice = rand_int;
            
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
            int ai_choice = ai_array_choice + 1;
            if(choice == ai_choice){
                System.out.println("tie");
                draws++;
            //rock vs paper
            }else if(choice == 1 && ai_choice == 2){
                System.out.println("computer win");
                losses++;
            //rock vs scissors
            }else if(choice == 1 && ai_choice == 3){
                System.out.println("user win");
                wins++;
            //paper vs rock
            }else if(choice == 2 && ai_choice == 1){
                System.out.println("user win");
                wins++;
            //paper vs scissors
            }else if(choice == 2 && ai_choice == 3){
                System.out.println("computer win");
                losses++;
            //scissors vs rock
            }else if(choice == 3 && ai_choice == 1){
                System.out.println("computer win");
                losses++;
            //scissors vs paper
            }else if(choice == 3 && ai_choice == 2){
                System.out.println("user win");
                wins++;
            }
            round_num++;
            rounds--;
        }

        System.out.println("\n------------------ Score Board ------------------");

        if(losses > wins){
            System.out.println("You lost! Better luck next time.");
        }else if(wins > losses){
            System.out.println("Congratulations! You win.");
        }else{
            System.out.println("Tie! It was a draw");
        }
        
        System.out.println("Wins = " + wins + ", Draws = " + draws + ", Losses = " + losses );
        Scanner answer = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String userAnswer = answer.nextLine(); 
        switch(userAnswer.toLowerCase()){
            case "yes":
                RPSMethod();
                break;
            case "no":
                System.out.println("\nThanks for playing!");
                break;
        }
    }

    public static void main(String[] args) {
        
        RPSMethod();
      }
}
