package lTI_BANK;

public class Test {

	public static void main(String[] args) {
		// Account ac =new Account("polo",5000);
		// ac.summary();
		// ac.deposit(3000);
		// System.out.println(ac.getBalance());
		// ac.withdraw(4000);
		// System.out.println(ac.getBalance());
		// ac.withdraw(7000);

		// Savings s=new Savings("mansha");
		// s.withdraw(5000);

		//
		// Current c = new Current("janet", 1000, 10000);
		// c.withdraw(5000);
		// c.deposit(5000);
		// c.summary();
//		Bank sav = AccountFactory.openAccount("savings", "polo");
//		sav.summary();
//		sav.deposit(2000);
//		sav.deposit(4000);
//		try {
//			sav.withdraw(1000);
//		} catch (BalanceException e) {
//			// e.printStackTrace();
//			// System.out.println(e);
//			System.out.println(e.getMessage());
//		}

		// sav.statement();
		////
		 Bank cur = AccountFactory.openAccount("current","bolo" );
		 cur.summary();
		 cur.deposit(4000);
		 cur.deposit(1000);
		 try {
		 cur.withdraw(7000);
		 } catch (BalanceException e) {
		 e.printStackTrace();
		 }
		 try {
			cur.withdraw(1000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 cur.statement();
		

	}

}
