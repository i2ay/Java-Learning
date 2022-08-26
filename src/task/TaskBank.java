package task;

public class TaskBank {
	
	abstract class Bank {
		abstract void getBalance();
	}

	class BankA extends Bank {
		void getBalance() {
			System.out.println("Deposited 100");
		}
	}
	
	class BankB extends Bank {
		void getBalance() {
			System.out.println("Deposited 150");
		}
	}
	
	class BankC extends Bank {
		void getBalance() {
			System.out.println("Deposited 200");
		}
	}
	
	public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}
}
