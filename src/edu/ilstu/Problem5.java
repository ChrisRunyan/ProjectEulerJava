/* 
 * Project Euler: Problem 5
 * Accessed from https://projecteuler.net/problem=5
 * 
 * Date: 04/03/2018
 */
package edu.ilstu;

/**
 * "Smallest multiple"
 * 
 * "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder."
 * "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 * 
 * Author Note: Running time of <1/20 of a second. O(n) running time complexity. 
 * 
 * @author Christopher Runyan
 */
public class Problem5 {
	public static void main(String[] args) {
		boolean divByAll = false;
		int smallestNum = 0;
		
		System.out.println(" -- Project Euler: Problem 5 --\n");
		
		for(int i=20; !divByAll; i+=20) {
			divByAll = true;
			
			for(int j=19; j>10 && divByAll; j--) {
				if(i%j != 0) {
					divByAll = false;
				}
			}
			
			smallestNum = i;
		}
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+smallestNum);
	}
}