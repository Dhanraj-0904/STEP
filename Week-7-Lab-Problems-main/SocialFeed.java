class Post {
    String author, content, time;
    public Post(String a, String c, String t) {
        author = a; content = c; time = t;
    }
    public void display() {
        System.out.println(author + ": " + content + " (" + time + ")");
    }
}
class Instagram extends Post {
    int likes;
    public Instagram(String a, String c, String t, int l) {
        super(a,c,t); likes=l;
    }
    @Override
    public void display() {
        System.out.println("IG @" + author + ": " + content + " #" + likes + "likes");
    }
}
class Twitter extends Post {
    int retweets;
    public Twitter(String a,String c,String t,int r){super(a,c,t);retweets=r;}
    @Override
    public void display(){System.out.println("Tweet @" + author + ": " + content + " (" + content.length() + " chars, " + retweets + " RTs)");}
}
class LinkedIn extends Post {
    int connections;
    public LinkedIn(String a,String c,String t,int conn){super(a,c,t);connections=conn;}
    @Override
    public void display(){System.out.println("LinkedIn " + author + ": " + content + " | " + connections + " connections");}
}
public class SocialFeed {
    public static void main(String[] args) {
        Post[] feed = {
            new Instagram("alice","Beach day","2pm",100),
            new Twitter("bob","Java rocks!","3pm",50),
            new LinkedIn("carol","New job update","5pm",500)
        };
        for(Post p: feed) p.display();
    }
}
