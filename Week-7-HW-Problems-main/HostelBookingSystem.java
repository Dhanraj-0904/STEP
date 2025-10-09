class Hotel {
    public void book(String room, int nights) {
        System.out.println("Standard booking: " + room + " for " + nights + " nights");
    }
    public void book(String room, int nights, double seasonalMultiplier) {
        double cost = nights * 1000 * seasonalMultiplier;
        System.out.println("Seasonal booking cost: " + cost);
    }
    public void book(String room, int nights, double discount, boolean meal) {
        double cost = nights * 1000 - discount;
        if(meal) cost += 500;
        System.out.println("Corporate booking cost: " + cost);
    }
    public void book(String room, int nights, int guests, double decorFee, double catering) {
        double cost = nights * 2000 + guests * catering + decorFee;
        System.out.println("Wedding package cost: " + cost);
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.book("Deluxe", 2);
        h.book("Deluxe", 3, 1.5);
        h.book("Deluxe", 4, 600, true);
        h.book("Banquet", 2, 150, 4000, 800);
    }
}
