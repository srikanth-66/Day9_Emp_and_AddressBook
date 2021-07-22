package EmpWageComputations;

import java.util.Scanner;

public class Uc_6 
{
	public void wagesForMonth(int total_hours_in_day_work,int parttime_hours_in_day_work,
			int Wage_for_hour,int total_days_in_month_work)
	{
	    if((Math.random()*10 )%2==1)
	    {
	   	 double empWage=Wage_for_hour* total_hours_in_day_work*total_days_in_month_work;
	    	 System.out.println("employee wage full time  is="+empWage);
	    }
	    else
	    {
		 double empWage=Wage_for_hour* parttime_hours_in_day_work*total_days_in_month_work;
		 System.out.println("employee wage part  time is is="+empWage);
	    }
	}
	public static void main(String[] args) {
		Uc_5 uc=new Uc_5();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter hours which is 8 for full time  only");
		int fiw=sc.nextInt();
		System.out.println("enter hours which is 4 for part timr  only");
		int piw=sc.nextInt();
		System.out.println("enter wage for hour which is 20 for  only");
		int wfh=sc.nextInt();
		System.out.println("enter wage for hour which is 100 for month  only");
		int wim=sc.nextInt();

		uc.wagesForMonth(fiw,piw,wfh,wim);
	}


}
