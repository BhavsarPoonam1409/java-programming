public class Bank_account{
	protected String accountHolderName;
	protected int balance;
	
	
	public int getbalance(){
		return this.balance;
	} 
	
	public void deposit(int amount){
		
		this.balance = this.balance + amount;  //add amount in current balance with
		System.out.println("deposit amount: " + amount);
		//this.deposit = deposit + this.balance;
		//this.addbalance = addbalance;
	
	}
	public void withdraw(int amount){
		if(amount < this.balance){    //minus amount in withdraw with condition 
			this.balance = this.balance - amount;
			System.out.println("withdrawamount: " + amount);
		}
		else{
			System.out.println("Insufficient Balance in your acount");
		}
	}
	
	public static void main(String[] args){
		Bank_account b1 = new Bank_account();
		b1.deposit(10000);
		b1.withdraw(5000);	
		
		System.out.println("Current Balance	" + b1.getbalance());
		
		
	}
}