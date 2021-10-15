import java.util.Scanner;

public class TestClass {

	public static void main(String args[])
	  {
		String n;
		String email;
		String phoneno;
		String address;
		String type; 
		int choice;
	 
	     Scanner in = new Scanner(System.in);
	     
	     System.out.println("Enter user type : ");
	     System.out.println(" 1. HouseOwner \n 2. HouseBuyer");
	     choice = in.nextInt();
	     in.nextLine();

	     if(choice == 1)
	     {
	    	 UserFactory users = new UserFactory();
	 	     UserAdd u = new UserAdd(users);
	 	     
	 	     User user = u.create("", "", "", "", "ho");
	 	     System.out.println(user);
	    	 
	     }
	     else if(choice == 2)
	     {
	  	   
		 UserFactory users = new UserFactory();
		 UserAdd u = new UserAdd(users);
		     
	     System.out.println("Enter your name: ");
	     n = in.nextLine();
	     System.out.println("Enter your email: ");
	     email = in.nextLine();
	     System.out.println("Enter your phoneno: ");
	     phoneno = in.nextLine();
	     System.out.println("Enter your address: ");
	     address = in.nextLine();
	     	     
	     User user = u.create(n, email, phoneno, address, "hb");
	     System.out.println(user);
	     }
	     else
	     {
		     System.out.println("Invalid choice !!!");
 
	     }
	  }
}
