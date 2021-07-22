package EmpWageComputations;
public class Uc_2
{
	int check;

	public Uc_2()
	{
		check=(int) Math.floor(Math.random()*10%2);
		if(check==0)
		{
			System.out.println("Employee is absent");
			System.out.println("\n");
			System.out.println("come office regularly--> No Sakary for Today");


		}
		else 
		{
			System.out.println("Employee is present");
			empDailyWage();
		}

	}
	public Uc_2(int wfh ,int fdh)
	{
		int empWd=wfh*fdh;
		System.out.println("its your wage  for today is\n"+empWd);
	}
	public void empDailyWage()
	{
		System.out.println("______________________________________________");
	}
	
	public static void main(String[] args) 
	{
		Uc_2 uc=new Uc_2();
		
		if (uc.check ==1)
		{
			Uc_2 uc2=new Uc_2(20,8);

		}
	}


}
