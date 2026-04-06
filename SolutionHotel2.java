import java.util.*;
public class SolutionHotel2 {

    public static int noOfRoomsBookedInGivenMonth(Hotel2[] hotel, String month) {
        int count = 0;
        for(Hotel2 h:hotel2) {
            String[] dates = h.getDateOfBooking().split(" ");
            if(dates[i].equals(month)) {
                count += h.getNoOfRoomsBooked();
            }
        }
        return count;
    } 

    public Hotel2 searchHotelByWifiOption(Hotel2[] hotel, String wifiFacility) {
        Hotel2 ans = null;
        int hBill = 0;
        int secHBill = 0;
        Hotel2 hBillHotel = null;
        Hotel2 secHBillHotel = null;

        for(Hotel2 h:hotel2) {
            if(h.getTotalBill() > hBill) {
                secHBill = hBill;
                secHBillHotel = hBillHotel;
                hBill = h.getTotalBill();
                hBillHotel = h;
            } else if(h.getTotalBill() > secHBill && h.getTotalBill() != hBill) {
                secHBill = h.getTotalBill();
                secHBillHotel = h;
            }
        }
        return secHBillHotel;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel2[] h = new Hotel2[4];
        for(int i = 0;i<4;i++) {
            int hotelId = sc.nextInt();
            int hotelName = sc.nextInt();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble();

            h[i] = new Hotel2(hotelId,hotelName,dateOfBooking,noOfRoomsBooked,wifiFacility, totalBill);
        }
    }
}

class Hotel2 {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public int getHotelId() {
        return hotelId;
    }
    public String getHotelName() {
        return hotelName;
    }
    public String getDateOfBooking() {
        return dateOfBooking;
    }
    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
    public String getWifiFacility() {
        return wifiFacility;
    }
    public double getTotalBill() {
        return totalBill;
    }

    Hotel2(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }
}