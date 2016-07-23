package Static;

public class StaticMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticClass c1 = new StaticClass();
		c1.setName("Divya");
		c1.setAge(27);
		c1.setBalance(4000);
	    double initialBalance = c1.balance;
		System.out.println("Initial balance: " + initialBalance);
		double newbalance = c1.updateBalanceAndReturn(200);
		System.out.println("New balance: " + newbalance);
		
		
		
		StaticClass c2 = new StaticClass();
		c2.setName("Sravya");
		c2.setAge(29);
		c2.setBalance(4020);
		
		double r1 = StaticClass.findInterest(c1);
		System.out.println("Rate of Intrest: " + StaticClass.rateOfIntrest);
		System.out.println("Updated Balance: " + r1);
		
		
		
	}

}
