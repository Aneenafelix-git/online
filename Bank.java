package projectspackage;

	import java.util.*;
	class Bank
	{
		public static void main(String args[]) {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter your Name: ");
			String n = sc.nextLine();
			System.out.println("Enter Account Number: ");
			int num = sc.nextInt();
			System.out.println("Enter Account Type: ");
			String t = sc.next();
			System.out.println("Enter Initial Balance: ");
			int bal = sc.nextInt();
			System.out.println("Enter Mobile Number: ");
			int mob = sc.nextInt();
			BankAccount b1 = new BankAccount(n, num, t, bal,mob);
			
			
			int ch;
			System.out.println("Welcome to UST Bank");
			System.out.println("-------------------------");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Display Details");
			System.out.println("5. Exit");
			System.out.println("---------------------------");
			boolean b = false;
			do {
				System.out.print("Enter your choice:\n ");
		
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					b1.create_account();
					System.out.println("****Your account is created******");
					System.out.println("---------------------------");
					break;
				
				case 2:
					b1.deposit();
					System.out.print("Amount is deposited in your account:\n");
					System.out.println("---------------------------");
					break;

				case 3:
					b1.withdraw();
					
					b1.display_balance();
					System.out.println("---------------------------");
					break;

				case 4:
					b1.display();
					System.out.println("---------------------------");
					break;

				case 5:
					b = true;
					System.out.println("***************Thank you****************");
					break;
				}
			} while (!b);
		}
	}
	           
	

