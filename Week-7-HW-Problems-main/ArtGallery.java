class Art {
    String title;
    Art(String t){title=t;}
}
class Painting extends Art {
    Painting(String t){super(t);}
    public void brush(){System.out.println(title + " uses oil painting style.");}
}
class Sculpture extends Art {
    Sculpture(String t){super(t);}
    public void material(){System.out.println(title + " is made from bronze.");}
}
public class ArtGallery {
    public static void main(String[] args) {
        Art a = new Painting("Mona Lisa");
        if(a instanceof Painting){
            Painting p = (Painting)a;  // downcasting
            p.brush();
        }
    }
}
