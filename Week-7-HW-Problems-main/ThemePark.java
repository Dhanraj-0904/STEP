class Attraction {
    String name;
    Attraction(String n){name=n;}
    public void enter(){System.out.println("Visitor enters " + name);}
    public void operate(){System.out.println(name + " generic operation");}
}
class RollerCoaster extends Attraction {
    RollerCoaster(String n){super(n);}
    public void operate(){System.out.println(name + " thrill ride with safety checks");}
}
class WaterRide extends Attraction {
    WaterRide(String n){super(n);}
    public void operate(){System.out.println(name + " depends on weather, safety gear needed");}
}
class Show extends Attraction {
    Show(String n){super(n);}
    public void operate(){System.out.println(name + " showtime starting soon");}
}
public class ThemePark {
    public void ticket(int price){System.out.println("Standard ticket: " + price);}
    public void ticket(int price, boolean vip){System.out.println("Ticket: " + (vip?price+200:price));}

    public static void main(String[] args) {
        Attraction[] list = { new RollerCoaster("Dragon Ride"), new WaterRide("Splash"), new Show("Magic Show") };
        for(Attraction a:list){
            a.enter();
            a.operate();
        }
        ThemePark park = new ThemePark();
        park.ticket(500);
        park.ticket(500,true);
    }
}
