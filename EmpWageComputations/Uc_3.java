package EmpWageComputations;

public class Uc_3
{
	static int check;

	public Uc_3()
	{
		check=(int) Math.floor(Math.random()*10%3);
		if(check==0)
		{
			System.out.println("Employee is absent");
			System.out.println("\n");
			System.out.println("come office regularly--> No Sakary for Today");


		}
		else if(check==1)
		{
			System.out.println("Employee is present  As a parttime");
			empDailyWage();
		}
		else
		{
			System.out.println("Employee is present  As a Fulltime");
			if (check ==2)
			{
				Uc_2 uc2=new Uc_2(20,8);

			}

		}

	}
	public Uc_3(int wfh ,int pdh)
	{
		int empWd=wfh*pdh;
		System.out.println(" your wage  for today as a part time is\n"+empWd);
	}
	public void empDailyWage()
	{
		System.out.println("______________________________________________");
	}
	
	public static void main(String[] args) 
	{
		Uc_3 uc=new Uc_3();
		
		if (uc.check ==1)
		{
			Uc_3 uc1=new Uc_3(20,4);

		}
	}



}
