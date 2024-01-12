import java.util.Random;
import java.util.Scanner;
class guess {
    public static void numberGame() {
        Scanner sc = new Scanner(System.in);
		Random rand=new Random();
        int number = rand.nextInt(1,100);
		System.out.println("Enter the number of Trials to guess the number");
        int n = sc.nextInt();
		int i,guess;
		System.out.println("Enter the numbers from 1 to 100");
        for (i = 0; i < n; i++) {
            guess = sc.nextInt();
        
        if (guess == number) 
		{
            System.out.println("Congrulations!!You guessed the number");
			break;
        } 
		
		else if (guess > number && i != n - 1) {
            System.out.println("Your Number is Too High");
        } 
		else {
            if (guess < number && i != n - 1) {
                System.out.println("Your number is too short");
            }
        }
		}
        if (i == n) {
            System.out.println("Your trials are completed");
        }
        System.out.println("The number is " + number);

    }
    public static void main(String[] args) {
        numberGame();
    }
}