import java.util.Scanner;

public class SolutionMedicine {
    public static int countMedicinesByMedicineName (Medicine[] medicine, String medicineName) {
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

            m[i] = new Medicine(medicineId,medicineName,medicineType,price);
        }
        sc.nextLine();
        String mediName = sc.nextLine();

        int ans = countMedicinesByMedicineName(m, mediName);
        if(ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("No medicines found with that name");
        }
    }
}

class Medicine {
    private int medicineId;
    private String medicineName;
    private String medicineType;
    private double price;

    Medicine(int medicineId, String medicineName, String medicineType, double price) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.medicineType = medicineType;
        this.price = price;
    }

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