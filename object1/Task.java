package object1;
import java.sql.Date;

public class Task {
    private int taskID;
    private String taskName;
    private Date deadline;
    private int score;
    private String progress;

    private static int taskCount = 0; // Static variable to count the total tasks made by one student

    //contructor 
    public Task(int taskID, String taskName, int score, String progress, Date deadline) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.score = score;
        this.progress = progress;
        this.deadline = deadline;
      
    }

    
    // Getters
    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getScore() {
        return score;
    }
    protected void setScore(int score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Score must be between 0–10.");
        }
    }

    public String getProgress() {
        return progress;
    }
    protected void setProgress(String progress) {
        this.progress = progress;
    }

    public Date getDeadline() {
        return deadline;
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