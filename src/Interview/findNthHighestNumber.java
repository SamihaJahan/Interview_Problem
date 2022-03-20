package Interview;

import java.util.Arrays;
import java.util.Collections;

public class findNthHighestNumber {

	/*
	 * Write a function that takes two input, an array integer list with unique
	 * numbers and an integer(n) find the nth highest number from the list. 
	 * input =[50, 20, 30,10,40, 55]; n= 3 ; output = 40
	 */
	public static void main(String[] args) {
		Integer input[] = { 50, 20, 30, 10, 40, 55};
		int n = 3;
		Arrays.sort(input, Collections.reverseOrder()); 
		System.out.println("the "+ n +"th highest number: " + input[n-1]);

	}

}