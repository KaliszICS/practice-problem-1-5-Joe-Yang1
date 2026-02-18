/**
	* File: Lesson 1.5: Characters
	* Author: Joe Yang
	* Date Created: February 10, 2023
	* Date Last Modified: February 18, 2023
	*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char c = 'a';
		System.out.println(c);
	
	}

	public static void q2() {
		//Write question 2 code here
	Scanner input = new Scanner (System.in);
	System.out.print("Input a word: ");
	String word;
	char w;
	word = input.nextLine();
	w = word.charAt(2);
	System.out.println(w);
	}

	public static void q3() {
		//Write question 3 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String word;
	word = input.nextLine();
	char c;
	c = word.charAt(1);
	System.out.println("The second character user entered was: " + c);
	
	}

	public static void q4() {
		//Write question 4 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num;
	num = input.nextInt();
	
	System.out.println("Your number plus 1 is: " + ( num + 1));

	}

	public static void q5() {
		//Write question 5 code here
	Scanner input = new Scanner(System.in);
	System.out.print("Input a letter: ");
	char w;
	String word1 = input.nextLine();
	w = word1.charAt(0);
	System.out.print("Input another letter: ");
	char w2;
	String word2 = input.nextLine();
	w2 = word2.charAt(0);
	System.out.println(w + w2);

	


	
	}

}
