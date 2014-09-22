// Jim O'Connor
//
// A simple Fizzbuzz to start my new exercises repo

public class Fizzbuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++){
			if(i % 15 == 0)
				System.out.println(i+" Fizzbuzz");
			else if(i % 5 == 0)
				System.out.println(i+" Buzz");
			else if(i % 3 == 0)
				System.out.println(i+" Fizz");
			else
				System.out.println(i);
		}
	}
}
