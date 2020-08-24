package interviewquestions;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without new operator
		String s1= "tejas";
		String s2= "tejas";
		System.out.println("Without new operator:"  +(s1==s2));
		
		//with new operator
		String s3 = new String("tejas");
		String s4 = new String("tejas");
		System.out.println("With new operator: " +(s3==s4));
		
		String s5="tejas";
		s5.concat("toley");
		System.out.println(s5);
		
		
		
		
				

	}

}
