package pistachio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner potato = new Scanner(System.in);

		System.out.println("Please enter your test grades.");

		System.out.print("Test 1: ");
		int test1 = potato.nextInt();
		System.out.print("Test 2: ");
		int test2 = potato.nextInt();
		
		System.out.println();

		System.out.println("Please enter your quiz grades.");
		System.out.print("Quiz 1: ");
		int quiz1 = potato.nextInt();
		System.out.print("Quiz 2: ");
		int quiz2 = potato.nextInt();
		System.out.print("Quiz 3: ");
		int quiz3 = potato.nextInt();
		
		System.out.println();

		System.out.println("Please enter your homework average.");
		System.out.print("Homework: ");
		double hmwk = potato.nextDouble();
		
		System.out.println();
		
		double testAvg = ((double)test1 + (double)test2) / 2.0;
		System.out.println("Test Average: " + testAvg);
		
		double quizAvg = ((double)quiz1 + (double)quiz2 + (double)quiz3) / 3;
		System.out.println("Quiz Average: " + quizAvg);
		
		double weighted = (testAvg * 0.5) + (quizAvg * 0.3) + (hmwk * 0.2);
		System.out.println("Final Grade: " + weighted);
		
		

	}

}
