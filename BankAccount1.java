public class BankAccount1{

    private String accountHolderName;
    private int balance;

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

	// Getter for balance
	public int getBalance() {
    return balance;
	}


    // Deposit method
    public void deposit(int amount){
		
		this.balance = this.balance + amount;  //add amount in current balance with
		System.out.println("deposit amount: " + amount);
		//this.deposit = deposit + this.balance;
		//this.addbalance = addbalance;
	
	}

    // Withdraw method
    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        } else {
            System.out.println("Insufficient Balance in your account");
        }
    }

    public static void main(String[] args) {

        BankAccount1 b1 = new BankAccount1();

        // Using setter
        b1.setAccountHolderName("Poonam Bhavsar");
        

        b1.deposit(100000);
        b1.withdraw(5000);

        // Using getter
        System.out.println("Account Holder: " + b1.getAccountHolderName());
        System.out.println("Current Balance: " + b1.getBalance());
    }
}
