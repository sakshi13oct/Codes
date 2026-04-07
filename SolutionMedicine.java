import java.util.Scanner;

public class SolutionMedicine {
    public static int countMedicinesByMedicineName (Medicine[] m, String medicineName) {
        int count = 0;
        for(Medicine m:medicine) {
            if(m.getMedicineName().equalsIgnoreCase(medicineName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] m = new Medicine[4];
        for(int i = 0;i<4;i++) {
            int medicineId = sc.nextInt();
            sc.nextLine();
            String medicineName = sc.nextLine();
            String medicineType = sc.nextLine();
            double price = sc.nextDouble();

            m[i] = new Medicine(medicineId,)medicineName,
        }
    }
}

class Medicine {
    private int medicineId;
    private String medicineName;
    private String medicineType;
    private double price;

    public int getMedicineId() {
        return medicineId;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public String getMedicineType() {
        return medicineType;
    }
    public double getPrice() {
        return price;
    }
}