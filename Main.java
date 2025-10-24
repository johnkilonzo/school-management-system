import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRegistry registry = new StudentRegistry();
        CourseScheduler scheduler = new CourseScheduler();
        FeeTracker fee = new FeeTracker();
        LibrarySystem library = new LibrarySystem();
        String[] st = {"John", "Mary", "Ali"};
        int[][] mk = {{80,90,70},{85,88,92},{78,75,80}};
        PerformanceAnalytics perf = new PerformanceAnalytics(st, mk);
        while (true) {
            System.out.println("\n--- SCHOOL MANAGEMENT SYSTEM ---");
            System.out.println("1. Register Student\n2. View Students\n3. Allocate Course\n4. View Courses\n5. Record Fee Payment\n6. View Fee Records\n7. Add Library Book\n8. Borrow Book\n9. Return Book\n10. View Books\n11. Top Performer\n0. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> { System.out.print("ID: "); String id = sc.next(); System.out.print("Name: "); String name = sc.next(); registry.registerStudent(id, name); }
                case 2 -> registry.viewStudents();
                case 3 -> { System.out.print("Course Name: "); scheduler.allocateCourse(sc.next()); }
                case 4 -> scheduler.viewCourses();
                case 5 -> { System.out.print("Student ID: "); String id = sc.next(); System.out.print("Amount: "); int amt = sc.nextInt(); fee.addPayment(id, amt); }
                case 6 -> fee.viewPayments();
                case 7 -> { System.out.print("ISBN: "); String isbn = sc.next(); System.out.print("Title: "); String title = sc.next(); library.addBook(isbn, title); }
                case 8 -> { System.out.print("ISBN: "); library.borrowBook(sc.next()); }
                case 9 -> library.returnBook();
                case 10 -> library.viewBooks();
                case 11 -> perf.topPerformer();
                case 0 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}