
import java.util.Random;
import java.util.Scanner;
public class RollDice {
	public static void main(String args[])
	{
		System.out.print("Enter the num of dice: ");
		Scanner input = new Scanner(System.in);
		int numOfDice = input.nextInt();

		// Initializing the Random obj for generating random num
		Random ranNum = new Random();
		int total = 0;
		int randomNumber = 0;

		for (int i = 0; i < numberOfDice; i++) {

			// Generate the random num & storing it in the 'randomNumber' variable
			randomNumber = ranNum.nextInt(6) + 1;
			total = total + randomNumber;
			System.out.print(randomNumber);
			System.out.print(" ");
		}

		System.out.println("");
		System.out.println("Total: " + total);
		input.close();
	}
}
