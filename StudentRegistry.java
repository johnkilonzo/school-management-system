import java.util.*;
public class StudentRegistry {
    HashMap<String, Student> students = new HashMap<>();
    void registerStudent(String id, String name) { students.put(id, new Student(id, name)); }
    void viewStudents() { for (Student s : students.values()) System.out.println(s.id + " - " + s.name); }
}