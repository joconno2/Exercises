// A simple, 5-Minute Bubble Sort for practice

import java.util.ArrayList;
import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int inputNum = 0;
		
		System.out.println();
		System.out.print("Enter a series of numbers to be sorted, seperated by returns. End with a zero: ");
		
		// The input / closing mechanism here is awkward at best,
		// but I didn't want to get into parsing for this simple
		// exercise
		do{
			inputNum = scanner.nextInt();
			list.add(inputNum);
		}while(inputNum != 0);
		
		scanner.close();
		
		System.out.print("\n\nThe pre sorted list: ");
		printList(list);
		
		System.out.print("\n\nThe post sorted list: ");
		list = bubbleSort(list);
		printList(list);
		
	}
	
	public static void printList(ArrayList<Integer> list){
		System.out.print(list);
	}
	
	
	// The bubble sort itself
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
		int x;
		
		for(int j = 0; j < list.size()-1; j++){
			for(int i = 0; i < list.size()-1; i++){
				if(((Integer) list.get(i)) > (Integer)list.get(i+1)){
					x = (Integer)list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i,x);
				}			
			}
		}
		
		return list;
	}

}
