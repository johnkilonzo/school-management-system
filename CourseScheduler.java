import java.util.*;
public class CourseScheduler {
    Queue<String> courseQueue = new LinkedList<>();
    void allocateCourse(String course) { courseQueue.add(course); }
    void viewCourses() { for (String c : courseQueue) System.out.println(c); }
}