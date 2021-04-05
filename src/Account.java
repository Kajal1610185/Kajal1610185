
public class Account {
		private double balance;
		public Account() {
			// TODO Auto-generated constructor stub
		}

		public Account(double balance) {
			this.balance = balance;
		}
		public double deposit(double amount) throws NumberFormatException {
			if(amount<0)
				throw new NumberFormatException("Negative amount");
			balance+=amount;
			return balance;
		}
		public double withdraw(double amount) throws NumberFormatException, Test1Exception {
		if (amount<0)
			throw new NumberFormatException("Negative amount");
		if(amount>balance)
			throw new Test1Exception("Insufficient amount");
		balance-=amount;
		return balance;
		
		
		}
}


