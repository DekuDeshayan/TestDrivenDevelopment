package Entities;

public class Account {
	
	private Long id;
	private Double balance;
	public static  double DEPOSIT_FEE_PERCENTAGE = 0.02;
	
	public Account()
	{
		
	}

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
		if(amount>0) {
			double fee = amount*DEPOSIT_FEE_PERCENTAGE;
			amount -= fee;
			
			this.balance += amount;
		}

	}
	
	public void withdraw(double amount) {
		
		if(amount>this.balance) {
			throw new IllegalArgumentException();
		}
		this.balance -= amount;
	}
	
	
	public double fullWithdraw() {
		
		double aux = balance;
		
		balance = 0.0;
		
		return aux;
	}
	
	
}
