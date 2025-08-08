import java.sql.Date;
import object1.Students;
import object1.Task;
import object1.Teachers;
import object1.studentPortfolio;

public class ProductivitySystem {
    public static void main(String[] args) {
        // Create student and teacher
        Students s1 = new Students("katty", "12345", "katty@dg.com");
        Teachers t1 = new Teachers("chanty", "abcde");

        // Create and assign tasks
        Task task1 = new Task(1, "Research", 0, "start", Date.valueOf("2025-10-01"));
        Task task2 = new Task(2, "Presentation", 0, "start", Date.valueOf("2025-09-28"));
        s1.addTask(task1);
        s1.addTask(task2);

        // Teacher grades student
        t1.gradeStudent(s1, 8);

        // Display basic info
        System.out.println("\nStudent Info:");
        System.out.println(s1.displayUserInfo());

        System.out.println("\nTeacher Info:");
        System.out.println(t1.displayUserInfo());

        // Show task list
        System.out.println("\nStudent Task List:");
        s1.displayAllTasksSorted();

        // Create and add portfolio
        studentPortfolio p1 = new studentPortfolio("Java Portfolio", "OOP, JDBC, Threads", "abc123");
        s1.addPortfolio(p1);

        // Show portfolio list
        System.out.println("\nStudent Portfolios:");
        s1.displayAllPortfolios();

        // Show static counters
        System.out.println("\nSystem Stats:");
        System.out.println("Total Students: " + Students.getStudentCount());
        System.out.println("Total Teachers: " + Teachers.getTeacherCount());
        System.out.println("Total Tasks: " + Task.getTaskCount());
    }
}
