public class PerformanceAnalytics {
    int[][] marks;
    String[] students;
    PerformanceAnalytics(String[] students, int[][] marks) {
        this.students = students;
        this.marks = marks;
    }
    void topPerformer() {
        int best = 0, sum, top = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = 0;
            for (int j = 0; j < marks[i].length; j++) sum += marks[i][j];
            if (sum > best) { best = sum; top = i; }
        }
        System.out.println("Top Performer: " + students[top] + " with total: " + best);
    }
}