package Static;

public class StaticClass {

	String name;
	int age;
	double balance;
	static double rateOfIntrest = 0.10;
	
	
	/*public StaticClass (String n, int a , double b){
		this.name = n;
		this.age = a;
		this.balance = b;
	}*/
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name = n;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		this.age = a;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double b){
		this.balance = b;
	}
	

	public static double findInterest(StaticClass c){
		c.balance = (c.balance + c.balance*rateOfIntrest);
		return c.balance;
	}
	
	public void printBalanceWithNoParameter(){
		System.out.println(this.balance);
	}
	
	public double updateBalanceAndReturn(double intrest){
		this.balance = this.balance + intrest;
		return this.balance;
	}
	
	
	
	/* public static double findInterest1(StaticClass c){
		c.balance = (c.balance + c.balance*5);
		return c.balance;
	} */
}
