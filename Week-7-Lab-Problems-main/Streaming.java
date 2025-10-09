class Content {
    String title;
    public Content(String t){title=t;}
    public void play(){System.out.println("Playing " + title);}
}
class Movie extends Content {
    public Movie(String t){super(t);}
    public void subtitles(){System.out.println("Subtitles on for " + title);}
}
class Series extends Content {
    public Series(String t){super(t);}
    public void next(){System.out.println("Next episode of " + title);}
}
class Documentary extends Content {
    public Documentary(String t){super(t);}
    public void tags(){System.out.println("Educational tags for " + title);}
}
public class Streaming {
    public static void main(String[] args) {
        Content c = new Movie("Avengers");
        c.play();
        if(c instanceof Movie) ((Movie)c).subtitles();

        c = new Series("Friends");
        c.play();
        if(c instanceof Series) ((Series)c).next();
    }
}
