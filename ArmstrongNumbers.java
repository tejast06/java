package interviewquestions;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=155;
		int actualNum=num;
		double result=0;
		while(actualNum!=0) {
			int n= actualNum%10;
			result=result+Math.pow(n, 3);
			actualNum=actualNum/10;
		}
		if(result==num) {
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number ");
		}

	}

}
