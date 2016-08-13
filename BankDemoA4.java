import java.util.Scanner;

public class BankDemoA4 {

	public static void main(String[] args) {

		BankA4 x = new BankA4();
		Scanner s = new Scanner (System.in);
		int op;
		
		do {
			
			System.out.println("****** FIND RATE OF INTERESTS ******");
			System.out.println("1. SBI BANK");
			System.out.println("2. ICICI BANK");
			System.out.println("3. AXIS BANK");
			System.out.println("4. EXIT");
			System.out.print("Enter Your Option(1-4): ");
			op=s.nextInt();
			
			switch(op) {
			
			case 1:
				x = new BankSBIA4();
				System.out.println("Rate Of Interest for SBI Bank is " +x.getRateOfInterest()+"%");
				break;
				
			case 2:
				x = new BankICICIA4();
				System.out.println("Rate Of Interest for ICICI Bank is " +x.getRateOfInterest()+"%");
				break;
				
			case 3:
				x = new BankAXISA4();
				System.out.println("Rate Of Interest for AXIS Bank is " +x.getRateOfInterest()+"%");
				break;
				
			case 4:
				System.out.println("Thank You for using this Application.");
				System.out.println("Good Bye !!!");
				break;
				
			default:
				System.out.println("Incorrect Option.");
				System.out.println("Please try again.");
				break;
			}
			
		} while(op!=4);
		s.close();
	}

}
