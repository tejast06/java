package interviewquestions;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1960;
		boolean leap=false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else {
					leap=false;
				}
				
			}
		}
		if(leap)
		{
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " not a leap year");
		}
		

	}

}
