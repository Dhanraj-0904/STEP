class Course {
    String title;
    Course(String t){title=t;}
    public void showProgress(){
        System.out.println(title + ": generic course progress");
    }
}
class VideoCourse extends Course {
    VideoCourse(String t){super(t);}
    public void showProgress(){
        System.out.println(title + ": 70% completed, 3 hours watched");
    }
}
class InteractiveCourse extends Course {
    InteractiveCourse(String t){super(t);}
    public void showProgress(){
        System.out.println(title + ": quizzes done and 1 project submitted");
    }
}
class ReadingCourse extends Course {
    ReadingCourse(String t){super(t);}
    public void showProgress(){
        System.out.println(title + ": 50 pages read with notes");
    }
}
public class LearningPlatform {
    public static void main(String[] args) {
        Course[] arr = { new VideoCourse("Java OOP"), new InteractiveCourse("DSA"), new ReadingCourse("History") };
        for(Course c:arr) c.showProgress();
    }
}
