/* 
 * Project Euler: Problem 2
 * Accessed from https://projecteuler.net/problem=2
 * 
 * Date: 03/23/2018
 */
package edu.ilstu;

/**
 * "Even Fibonacci numbers"
 * 
 * "Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:"
 * "1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ..."
 * "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
 * 
 * @author Christopher Runyan
 */
public class Problem2 {
	public static void main(String[] args) {
		int sum = 0;
		int num1 = 1;
		int num2 = 2;
		int temp = 0;
		
		System.out.println(" -- Project Euler: Problem 2 --\n");
		
		while(num2<=4000000) {
			if(num2%2 == 0) {
				sum+=num2;
			}
			
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println("The sum of all even-values terms of the Fibonacci sequence (starting with 1 and 2) whose values do not exceed four million is "+sum+".");
	}
}
