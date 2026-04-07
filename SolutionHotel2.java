import java.util.*;
public class SolutionHotel2 {

    public static int noOfRoomsBookedInGivenMonth(Hotel2[] hotel, String month) {
        int count = 0;
        for(Hotel2 h:hotel) {
            // String[] dates = h.getDateOfBooking().split("-");
            if(h.getDateOfBooking().contains(month)) {
                count += h.getNoOfRoomsBooked();
            }
        }
        return count;
    } 

    public static Hotel2 searchHotelByWifiOption(Hotel2[] hotel, String wifiFacility) {
        
        // Hotel2 ans = null;
        // double hBill = 0;
        // double secHBill = 0;
        // Hotel2 hBillHotel = null;
        // Hotel2 secHBillHotel = null;

        // for(Hotel2 h:hotel) {
        //     if(h.getTotalBill() > hBill) {
        //         secHBill = hBill;
        //         secHBillHotel = hBillHotel;
        //         hBill = h.getTotalBill();
        //         hBillHotel = h;
        //     } else if(h.getTotalBill() > secHBill && h.getTotalBill() != hBill) {
        //         secHBill = h.getTotalBill();
        //         secHBillHotel = h;
        //     }
        // }
        // return secHBillHotel;

        ArrayList<Hotel2> arrList = new ArrayList<>();
        for(Hotel2 h:hotel) {
            if(h.getWifiFacility().equalsIgnoreCase(wifiFacility)) {
                arrList.add(h);
            }
        }
        if(arrList.isEmpty()) {
            return null;
        }
        arrList.sort(Comparator.comparing(Hotel2 :: getTotalBill).reversed());
        
        return arrList.get(1);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel2[] h = new Hotel2[4];
        for(int i = 0;i<4;i++) {
            int hotelId = sc.nextInt();
            String hotelName = sc.nextLine();
            sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble();

            h[i] = new Hotel2(hotelId,hotelName,dateOfBooking,noOfRoomsBooked,wifiFacility, totalBill);
        }
        sc.nextLine();
        String month = sc.nextLine();
        String wifiFac = sc.nextLine();



        System.out.println("            ANSWERS           ");

        int fun1 = noOfRoomsBookedInGivenMonth(h, month);
        if(fun1 == 0) {
            System.out.println("No rooms booked in the given month");
        } else {
            System.out.println(fun1);
        }

        Hotel2 fun2 = searchHotelByWifiOption(h, wifiFac);
        if(fun2 == null) {
            System.out.println("No such option available");
        } else {
            System.out.println(fun2.getHotelId());
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