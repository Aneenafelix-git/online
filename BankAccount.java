package projectspackage;
import java.util.*;

	class BankAccount {
		static Scanner sr  = new Scanner(System.in);
		String name, actype;
		int accNo,bal,amt,mob;

		BankAccount(String name, int accNo, String actype, int bal,int mob) {
			this.name = name;
			this.accNo = accNo;
			this.actype = actype;
			this.bal = bal;
			this.mob = mob;
		}
		void create_account() {
			System.out.println("Name:" + name);
			System.out.println("Account No:" + accNo);
			System.out.println("Account Type:" + actype);
			System.out.println("Contact Number:" + mob);
		}

		int deposit() {
			System.out.print("Enter amount to be deposited:");
			amt = sr.nextInt();
			if (amt < 0) {
				System.out.println("Invalid Amount");
				
				return 1;
			}
			bal = bal + amt;
			
			return 0;
		}

		int withdraw() {
			System.out.println("Your Balance=" + bal);
			System.out.print("Enter amount to withdraw:");
			amt = sr.nextInt();
			if (bal < amt) {
				System.out.println("Not sufficient balance.");
				System.out.print("Amount cannot be withdrawn from your account:\n");
				return 1;
			}
			if (amt < 0) {
				System.out.println("Invalid Amount");
				return 1;
			}
			bal = bal - amt;
			System.out.print("Amount is withdrawn from your account:\n");
			return 0;
		}


		void display() {
			System.out.println("Name:" + name);
			System.out.println("Account No:" + accNo);
			System.out.println("Balance:" + bal);

		}

		void display_balance() {
			System.out.println(" Your Balance is:"
					+ bal);
		}
	}
	    
