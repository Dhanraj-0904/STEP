class Delivery {
    public void calculate(int distance) {
        System.out.println("Basic delivery cost: " + (distance * 5));
    }
    public void calculate(int distance, int priorityFee) {
        System.out.println("Premium delivery cost: " + (distance * 5 + priorityFee));
    }
    public void calculate(int distance, int orders, double discount) {
        System.out.println("Group delivery cost: " + (distance * 5 - (orders * discount)));
    }
    public void calculate(int distance, double discountPercent, int amount) {
        int cost = distance * 5;
        if (amount > 500) System.out.println("Festival special: Free delivery!");
        else System.out.println("Festival special cost: " + (cost - (cost * discountPercent / 100)));
    }
}
public class FoodDeliveryApp {
    public static void main(String[] args) {
        Delivery d = new Delivery();
        d.calculate(10);
        d.calculate(10, 20);
        d.calculate(10, 3, 5);
        d.calculate(10, 10, 400);
    }
}
