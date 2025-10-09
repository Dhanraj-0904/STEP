class LibraryUser {
    String name;
    public LibraryUser(String n){name=n;}
    public void info(){System.out.println("User: " + name);}
}
class Student extends LibraryUser {
    public Student(String n){super(n);}
    public void borrow(){System.out.println(name + " borrows books");}
}
class Faculty extends LibraryUser {
    public Faculty(String n){super(n);}
    public void reserve(){System.out.println(name + " reserves book");}
}
class Guest extends LibraryUser {
    public Guest(String n){super(n);}
    public void browse(){System.out.println(name + " browses books");}
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryUser u = new Student("Alice");
        u.info();
        u = new Faculty("Bob");
        u.info();
        u = new Guest("Charlie");
        u.info();
    }
}
