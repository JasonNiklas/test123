package fixed;


public class Account extends FixedPointNumber {

    public Account() {
        super(100, 0, 0.0); 
    }

    public void multiply(double factor) {
    	double currentValue = get();
        double result = (1.0 / getScalingFactor()) * currentValue * factor;
        set(result);
    }
    
    public Account(double initialBalance) {
        super(100, 0, initialBalance); 
    }

    public void deposit(double amount) { 
        add(amount);
    }

    public void withdraw(double amount) {
        subtract(amount);
    }    
    
}