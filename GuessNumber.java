import java.util.Scanner;

public class GuessNumber{
	public static void main(String[] args){
		//Generate random number to be guessed
		int number = (int) (Math.random() * 101);
		int count;
		count = 0;
		String[] cArray = new String[]{ " ","First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth"};
		String dec = "####################################################";

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number){
			//prompt user to enter a number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			count++;

			if (guess == number){
				System.out.println(dec);
				System.out.println("Yes, the number is " + number);
				System.out.println("You got it on your " + cArray[count] + " guess!");
				System.out.println(dec);

			}
			else if (guess > number){
				System.out.println("Your guess is too high");
				System.out.println("This is your " + cArray[count] + " guess");
			}
			else{
				System.out.println("Your guess is too low");
				System.out.println("This is your " + cArray[count] + " guess");
			}

			if (count == 10){
				System.out.println("You have reached your guess limit! ");
				System.exit(0);
			}
		}//end of loop

	}
}