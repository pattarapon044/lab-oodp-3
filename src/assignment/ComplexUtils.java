package assignment;

import java.util.GregorianCalendar;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;

public class ComplexUtils {
	/**
	 * Q1. Compare two names and if they are the same return "Same name", otherwise
	 * if they start with exactly the same letter return "Same first letter",
	 * otherwise return "No match".
	 *
	 * @param firstName
	 * @param secondName
	 *
	 * @return one of three Strings: "Same name", "Same first letter", "No match"
	 */
	public String areSameName(String firstName, String secondName) {
		
		//TODO: implement here
		if (firstName.equals(secondName)) {
			return "Same name";
		}
		
		if (firstName.charAt(0) == secondName.charAt(0))
		{
			return "Same first letter";
		}

		return "No match";
	}

	/** areSameName(String, String) => String **/

	/**
	 * Q2. Determine if the given year is a leap year.
	 *
	 * @param year
	 *
	 * @return true if the given year is a leap year, false otherwise
	 */
	public boolean isALeapYear(int year) {
		
		//TODO: implement here
		GregorianCalendar ggrCalendar = new GregorianCalendar();

        return ggrCalendar.isLeapYear(year);
	}


	/**
	 * Q3. Return the given string in reverse order.
	 *
	 * @param str
	 *
	 * @return the String with characters in reverse order
	 */
	public String reverseString(String str) {
		String reverseStr = "";

		//TODO: implement here
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		reverseStr = sb.reverse().toString();

		return reverseStr;
	}

	/** reverseString(String) => void **/



	/**
	 * Q4. Determine if the given number is a prime number.
	 *
	 * @param num
	 *
	 * @return true is the given number is a prime, false otherwise
	 */
	public boolean isPrime(int num) {
		
		//TODO: implement here
		if (num <= 1) {
            return false;
		}
		
        for (int i = 2; i < num; i ++) {
        	
        	if (num % i == 0) {
        		return false;
        	}
        }
        
        return true;
	}

	/**
	 * Q5. Determine if the given string is a palindrome (case folded).
	 *
	 * @param str
	 *
	 * @return true if string is palindrome, false otherwise
	 */
	public boolean isStringPalindrome(String str) {
		
		//TODO: remove return and implement here 
		return reverseString(str).equals(str);
	}

	/** isStringPalindrome(String) => boolean **/

	/**
	 * Q10. Generate a space separated list of all the prime numbers from 2 to the
	 * highest prime less than or equal to the given integer.
	 *
	 * @param num
	 *
	 * @return the primes as a space separated list
	 */
	public String printPrimeNumbers(int num) {
		
		//TODO: implement here
		if (num <= 1) {
			return "No prime number found";
		}
		
		//Create list to store prime number in range var num
		List<Integer> primeNumber = new ArrayList<Integer>();
		
		//Check value is prime?
		for (int i = 2; i <= num; i++) {
			
			/*
    		 * Can also just use this
    		if (isPrime(i) {
    			primeNumber.add(i);
    		}
    		*/
			
			boolean isPrime = true;
			
    		for (int p:primeNumber) {
    			if (i % p == 0) {
    				isPrime = false;
    				break;
    			}
    		}
    		
    		if (isPrime) {
    			primeNumber.add(i);
    		}
		}
		
		//Format output
		String format = primeNumber.toString();
		return String.join(" ", format.substring(1, format.length()-1).split(", "));
	}
	
}
