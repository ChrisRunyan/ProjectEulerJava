/* 
 * Project Euler: Problem 3
 * Accessed from https://projecteuler.net/problem=3
 * 
 * Date: 03/29/2018
 */
package edu.ilstu;

/**
 * "Largest prime factor"
 * 
 * "The prime factors of 13195 are 5, 7, 13 and 29."
 * "What is the largest prime factor of the number 600851475143 ?"
 * 
 * Author Note: There are many ways to complete this problem, but through much refinement and revision, this solution is able to run in less than one millisecond. 
 * 
 * @author Christopher Runyan
 */
public class Problem3 {
	/**
	 * Accepts a long as input and checks to see if it is prime or not. Improved running time by testing all numbers up to the square root of the number being tested for whole quotients, as 
	 * opposed to up to hald of the number being tested (this resulted in a significant improvement, but is only affected by the calling of this method in the main). 
	 * 
	 * @param toTest the number to test to see if it is prime or not
	 * @return true or false depending on if toTest is prime or not 
	 */
	static boolean isPrime(long toTest) {
		boolean toReturn = false;
		
		if(toTest > 2 && toTest%2 != 0) {
			for(long i=3; i<Math.sqrt(toTest); i+=2) {
				if(toTest%i == 0) {
					toReturn = false;
					i = toTest/2;
				}
				else {
					toReturn = true;
				}
			}
		}
		
		return toReturn;
	}
	
	public static void main(String[] args) {
		long largestPrimeFactor = 0;
		long numToFindLargestPrimeFactorOf = 600851475143L;
		
		System.out.println(" -- Project Euler: Problem 3 --\n");
		
		// Tests only up to the square root of 600851475143, as the largest prime factor has to be less than the square root of the number. Starts i at 1 and increments by 2 each loop because i 
		// has to be an odd number. Initially looped 600851475143/2 number of times and incremented by 1, changing this took over one second off the running time. 
		for(long i=1; i<Math.sqrt(numToFindLargestPrimeFactorOf); i+=2) {
			if(numToFindLargestPrimeFactorOf%i == 0) {
				if(isPrime(i)) {
					largestPrimeFactor = i;
				}
			}
		}
		
		System.out.println("The largest prime factor of the number 600851475143 is "+largestPrimeFactor+".");
	}
}
