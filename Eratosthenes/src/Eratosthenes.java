// Jim O'Connor
//
// This program determines the number of Primes between 0 
// and a given number using the Sieve of Eratosthenes

import java.util.Scanner;


public class Eratosthenes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a number, to check the number of primes up to that number: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.print("\nThere are ");
		sieve(number);
		System.out.print(" primes between 0 and "+number+".");
		
	}

	// Determines the number of primes between 0 and the given value
	// using the Sieve of Eratosthenes
	public static void sieve(int number){
		boolean[] list = new boolean[number + 1];
		int primes = 0;
		
		for(int i = 2; i <= number; i++)  // true the whole list
			list[i] = true;
		
		for(int i = 2; i*i <= number; i++)
			if(list[i])
				for(int j = i; i*j <= number; j++) // sieve the list
					list[i*j] = false;
		
		for(int i = 0; i < number; i ++) // count the primes in the list post-sieve
			if(list[i])
				primes++;
		
		System.out.print(primes); // output the number of primes
	}
}
