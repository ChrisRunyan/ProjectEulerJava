/* 
 * Project Euler: Problem 1
 * Accessed from https://projecteuler.net/problem=1
 * 
 * Date: 03/23/2018
 */
package edu.ilstu;

/**
 * "Multiples of 3 and 5"
 * 
 * "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23."
 * "Find the sum of all the multiples of 3 or 5 below 1000."
 * 
 * @author Christopher Runyan
 */
public class Problem1 {
	public static void main(String[] args) {
		int total=0;
		
		System.out.println(" -- Project Euler: Problem 1 --\n");
		
		for(int i=0; i<(1000-1); i++) {
			if((i+1)%3 == 0 || (i+1)%5 == 0) {
				total += (i+1);
			}
		}
		
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + total + ".");
	}
}
