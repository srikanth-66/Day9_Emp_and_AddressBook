package AddressBook_UC;

public class Uc_1 
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
		Uc_1 uc=new Uc_1();
		uc.contacts("Srikanth", "Midathapalli","vanasthalipuram", "Hyderabad","telngana",
				500070, 987654321,"sri@gmail.com");
		//creating contacts by passing arguments to the contacts method
		uc.contacts("Sri", "M","nasthalipuram", "Hyderabad","telngana",
				500070, 987654321,"sri@gmail.com");

		//if we want to create or add the contact we can do it by passing arguments 
	}

}
