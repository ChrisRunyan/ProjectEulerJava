/* 
 * Project Euler: Problem 4
 * Accessed from https://projecteuler.net/problem=4
 * 
 * Date: 03/30/2018
 */
package edu.ilstu;

/**
 * "Largest palindrome product"
 * 
 * "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99."
 * "Find the largest palindrome made from the product of two 3-digit numbers."
 * 
 * @author Christopher Runyan
 */
public class Problem4 {
	/**
	 * Accepts an int as input and tests to see if it is a palindromic number by parsing the accepted int to a String, creating the inverse of the String, and comparing the two together. 
	 * 
	 * @param toTest the number to test to see if it is a palindromic number or not
	 * @return true or false depending on if toTest is a palindromic number or not 
	 */
	static boolean isPalindrome(int toTest) {
		String toTestString = Integer.toString(toTest);
		String toTestBackwardsString = "";
		
		for(int i=0; i<toTestString.length(); i++) {
			toTestBackwardsString += toTestString.charAt((toTestString.length() - i)-1);
		}
		
		if(toTestString.equals(toTestBackwardsString)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int toTest = 0;
		int num1 = 0;
		int num2 = 0;
		int largestPalindrome = 0;
		
		System.out.println(" -- Project Euler: Problem 4 --\n");

		for(int i=999; i>99; i--) {
			for(int j=999; j>99; j--) {
				toTest = i*j;
				if(isPalindrome(toTest)) {
					if(toTest > largestPalindrome) {
						largestPalindrome = toTest;
						num1 = i;
						num2 = j;
					}
				}
			}
		}
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is "+largestPalindrome+", made from the product of "+num1+" and "+num2+".");
	}
}
