package object1;
import java.sql.Date;

public class Task {
    protected int taskID;
    protected String taskName;
    protected String deadline;
    protected int score;
    protected String progress;

    protected static int taskCount = 0; // Static variable to count the total tasks made by one student

    //contructor 
    public Task(int taskID, String taskName, int workPoint, String progress, Date deadline, Boolean importance_status) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.workPoint = workPoint;
        this.progress = progress;
        this.deadline = deadline;
        this.importance_status = importance_status;
    }

    //setter and getter for score for teacher to marks
    public static int getTaskCount() {
    return taskCount;
    }

    public int getScore() {
        return score;
    }

    //static method to return the number of tasks
    public void setScore(int score) {
        this.score = score;
    }


    //static method to make sure that there is a name for the task
    public static boolean isValidTaskName(String name) {
    return name != null && !name.trim().isEmpty();
    }


}