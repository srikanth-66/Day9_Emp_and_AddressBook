package AddressBook_UC;

import java.util.Scanner;

public class Uc_4 
{
	private static String fname,lname,address,city,state,email,newFname,newLname;
	private static int zip,pnumber;;
	static Scanner sc=new Scanner(System.in);

//displaying the user entered contact details 
	public static void displayContacts(String fname,String lname,String address,String city,
			String state,int zip,double pnumber,String email)
	{
			System.out.println("\n Contect Details you enterwd are ------");

			System.out.println("First-name:"+fname+"\n"+"Last-name:"+lname+"\n"+"Address:"+address+"\n"
								+"City:"+city+"\n"+"State:"+state+"\n"+"Zip:"+zip+"\n"+"Phone-Number:"
								+ pnumber+"\n"+"Email:"+email+"\n");
	}
	public void addContacts()
	{
		//Asking user to enter the contact details and adding 
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
		System.out.println("\n");
		displayContacts(fname, lname, address, city, state, zip, pnumber, email);
		//editContacts(newName);
		System.out.println("\n");
		System.out.println("enter the name u want to delete");
		String newFname=sc.next();
		String newLname=sc.next();

		fname=newFname;
		lname=newLname;
		if(fname==newFname && lname==newLname)
		{
			System.out.println("Contact is deleted");

		}
	

	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Address Book Program AddressBookMain class");
		System.out.println("\n");
			Uc_4 uc=new Uc_4();
			uc.addContacts();
		

	}


}
