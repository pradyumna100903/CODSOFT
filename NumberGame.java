
import java.util.Scanner;
import java.util.Random;

public class NumberGame{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); // to take input from keyboard
     Random r=new Random(); // for generating the Random Number
     int randomNumber=r.nextInt(100 )+ 1; // the value lies between 0-100
   

   int tryCount = 0; // To check
System.out.println("!!!!GuessQuest!!!!");
System.out.println("Hi There!! I Welcome you to Play Number Guessing Game!!!!");
System.out.println("Check How Smart you are in Guessing!");
  while(true){

     System.out.println("Enter Your Guess between (1-100)");

     int playerGuess=sc.nextInt(); // the value taken from user.
    tryCount++;// for incrementing the number of tries
     if(playerGuess==randomNumber)
     {
        System.out.println("Wow Your Skills Rock!! The Guessed Number is Accurate and You Win!!"); // the guessed number is matching with ranfoom number
        System.out.println("It Took You " + tryCount +  " Tries"); // to print the number of tries
        break;
     }
    else if(randomNumber > playerGuess){
            System.out.println("Ohh No! The Guessed number is Quite Low!! ");
        }
        else 
        {
            System.out.println("The Guessed Number is Quite High !!");
          }   
        }        
        sc.close(); 
    
    
    }
 }







 
