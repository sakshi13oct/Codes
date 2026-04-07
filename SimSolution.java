import java.util.*;

class SimSolution {
    public static Sim[] transferCustomerCircle(Sim[] sim, String circle1, String circle2) {
            ArrayList<Sim> transferred = new ArrayList<>();
            for(Sim s:sim) {
                if(s.getCircle().equalsIgnoreCase(circle1)) {
                    transferred.add(s);
                    s.setCircle(circle2);
                }
            }
            transferred.sort(Comparator.comparing(Sim :: getRatePerSecond).reversed());
            return transferred.toArray(new Sim[0]);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sim = new Sim[5];
        for(int i = 0;i<5;i++) {
            int simId = sc.nextInt();
            sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();

            sim[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();

        System.out.println("     ANSWERSSS................                ");
        Sim[] ans = transferCustomerCircle(sim, circle1, circle2);
        for(int i = 0;i<ans.length;i++) {
            System.out.println(ans[i].getSimId());
            System.out.println(ans[i].getCustomerName());
            System.out.println(ans[i].getCircle());
            System.out.println(ans[i].getRatePerSecond());
        }   
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

    public void setSimId(int simId) {
        this.simId = simId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }
    public void setCircle(String circle) {
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