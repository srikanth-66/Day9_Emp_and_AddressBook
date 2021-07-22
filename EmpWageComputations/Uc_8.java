package EmpWageComputations;

import java.util.Scanner;

public class Uc_8
{
	public void wagesForMonth(double fullttime_hours_in_day_work,
			double Wage_for_hour,double total_days_in_month_work)
		{
			double empWage=Wage_for_hour* fullttime_hours_in_day_work*total_days_in_month_work;
			System.out.println("employee wage full time  is="+empWage);
		}
	//method overloading
	public void wagesForMonth(double parttime_hours_in_day_work,
	 			double Wage_for_hour,int total_days_in_month_work)
	 	{
			double empWage1=Wage_for_hour* parttime_hours_in_day_work*total_days_in_month_work;
			System.out.println("employee wage part  time is is="+empWage1);
	 	}
public static void main(String[] args)
	{
		Uc_8 uc=new Uc_8();
		//Scanner sc=new Scanner(System.in);
	
	    if((Math.random()*10 )%3==0)
	    {
	    	System.out.println("Company 1 wages*-------------*");
	    	
			uc.wagesForMonth(8,20,100);
			uc.wagesForMonth(4,20,100);


	    }
	    else if((Math.random()*10 )%3==1)
	    {
	    	System.out.println("Company 2 wages*-------------*");
	    	
			uc.wagesForMonth(10,30,100);
			uc.wagesForMonth(4,20,100);

	    }
	    else if((Math.random()*10 )%3==2)
	    {
	    	System.out.println("Company 3 wages*-------------*");
			uc.wagesForMonth(8,20,100);
			uc.wagesForMonth(4,20,100);

	    }
	    else
	    	System.out.println("out of random value");

	}
}