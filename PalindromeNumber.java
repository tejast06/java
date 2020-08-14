package interviewquestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int result=0;
		int actualNum=num;
		while(num!=0) {
			int n=num%10;
			result=result*10+n;
			num=num/10;
		}
		System.out.println(result);
		if(actualNum==result) {
			System.out.println(  actualNum    +  " is palindrome");
		}
		else
			System.out.println(actualNum  + "is not palindrome");

	}

}
