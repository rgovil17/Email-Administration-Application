package emailapp;
import java.util.Scanner;


public class EmailApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Creating a new employee (i.e. an object of the Email class)
		Email em1 = new Email("John", "Doe");
		
		int choice = -1;
		do {
			System.out.println("\n**************************\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
					+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Exit");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				em1.getInfo();
				break;
			case 2:
				em1.set_password();
				break;
			case 3:
				em1.set_mailCap();
				break;
			case 4:
				em1.alternate_email();
				break;
			case 5:
				System.out.println("\nTHANKS!!!");
				break;
			default:
				System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}
			
		}while(choice!=5);
		
	}

}
