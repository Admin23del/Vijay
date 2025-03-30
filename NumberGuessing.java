import java.util.Scanner;
import java.util.Random;
public class NumberGuessing
{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String play="yes";

        //while loop to determine if we are going to play game again
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randNum= rand.nextInt(100);
            int guess=-1;
            int tries=0;

            //while loop to check if the game is over

            while(guess!=randNum)
            {
                System.out.println("Guess a number between 1 and 100");
                guess=r.nextInt();
                tries++;

                if(guess==randNum)
                {
                    System.out.println("Awesome! You Guessed The Number");
                    System.out.println("It only took you "+tries+" Guesses");
                    System.out.println("would you like to play again? Yes or No: ");
                    play=r.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("Your guess is too high. Try again. ");
                }
                else {
                    System.out.println("Your Guess is too low, Try again.");
                }
            }
        }
      r.close();
    }
}
