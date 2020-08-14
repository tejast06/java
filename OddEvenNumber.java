package interviewquestions;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number" +num);
		}
		else
			System.out.println("odd number" +num);

	}

}
