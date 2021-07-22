package AddressBook_UC;

import java.util.Scanner;

public class Uc_2 
{
	public void contacts(String fname,String lname,String address,String city,
			String state,int zip,double pnumber,String email)
	{
			System.out.println("First-name:"+fname+"\n"+"Last-name:"+lname+"\n"+"Address:"+address+"\n"
								+"City:"+city+"\n"+"State:"+state+"\n"+"Zip:"+zip+"\n"+"Phone-Number:"
								+ pnumber+"\n"+"Email:"+email+"\n");
	}
public static void main(String[] args)
	{
		System.out.println("Welcome to Address Book Program AddressBookMain class");
		System.out.println("\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Contact Details");
		System.out.println("Enter the First Name");
		String fname=sc.next();
		System.out.println("Enter the Last Name");
		String lname=sc.next();
		System.out.println("Enter the address");
		String address=sc.next();
		System.out.println("Enter the city");
		String city=sc.next();
		System.out.println("Enter the state");
		String state=sc.next();
		System.out.println("Enter the Zip");
		int zip=sc.nextInt();
		System.out.println("Enter the phone number");
		double pnumber=sc.nextDouble();
		System.out.println("Enter the email");
		String email=sc.next();
		Uc_1 uc=new Uc_1();
		System.out.println("\n Contect Details you enterwd are ------");
		uc.contacts(fname, lname, address, city, state, zip, pnumber, email);
	}
}
