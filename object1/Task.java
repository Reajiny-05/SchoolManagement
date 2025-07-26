package object1;
import java.sql.Date;

public class Task {
    private int taskID;
    private String taskName;
    private String deadline;
    private int score;
    private String progress;

    protected static int taskCount = 0; // Static variable to count the total tasks made by one student

    //contructor 
    public Task(int taskID, String taskName, int score, String progress, Date deadline) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.score = score;
        this.progress = progress;
        this.deadline = deadline;
        this.importance_status = importance_status;
    }

    //static method to return the number of tasks
    public static int getTaskCount() {
    return taskCount;
    }

    //static method to make sure that there is a name for the task
    public static boolean isValidTaskName(String name) {
    return name != null && !name.trim().isEmpty();
    
    }

    @Override
    public String toString() {
       return "Name=" + taskName + ", Score=" + score +
               ", Progress=" + progress + ", Deadline=" + deadline + "]";
    
    }


}