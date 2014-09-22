import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Eratosthenes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a number, to check primality: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(sieve(number))
			System.out.print("\nThis number is prime.");
		else
			System.out.print("\nThis number is not prime.");
		
	}

	public static boolean sieve(int number){
		List<Boolean> list = new ArrayList<Boolean>(number);
		
		//To-Do
		
		return true;
	}
}
