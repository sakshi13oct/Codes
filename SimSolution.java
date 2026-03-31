import java.util.*;

class SimSolution {
    public static void main(String[] args) {
        
    }
}

class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

    Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }    

    public int getSimId() {
        return simId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getBalance() {
        return balance;
    }
    public double getRatePerSecond() {
        return ratePerSecond;
    }
    public String getCircle() {
        return circle;
    }
}