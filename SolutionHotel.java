import java.util.*;

public class SolutionHotel{
    public static int totalnoOfRoomsBooked(Hotel[] hotel, String cabFacility){
        int ans = 0;
        for(Hotel h: hotel) {
            if(h.getCabFacility().equalsIgnoreCase(cabFacility) && h.getnoOfRoomsBooked() > 5) {
                ans = ans + h.getnoOfRoomsBooked();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] h = new Hotel[4];
        for(int i = 0;i<4;i++) {
            int hotelId = sc.nextInt();
            sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String cabFacility = sc.nextLine();
            double totalBill = sc.nextDouble();

            h[i] = new Hotel(hotelId, hotelName, dateOfBooking,noOfRoomsBooked,cabFacility, totalBill);
        }
        sc.nextLine();
        String cabFac = sc.nextLine();

        System.out.println("    ANSWER:      ");

        int ans = totalnoOfRoomsBooked(h, cabFac);
        if(ans <= 0 ) {
            System.out.print("No such rooms booked");
        } else {
            System.out.println(ans);
        }
    }
}

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }
    public int getHotelId(){
        return hotelId;
    }
    public String getHotelName() {
        return hotelName;
    }
    public String getDateOfBooking(){
        return dateOfBooking;
    }
    public int getnoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
    public String getCabFacility(){
        return cabFacility;
    }
    public double getTotalBill(){
        return totalBill;
    }

}