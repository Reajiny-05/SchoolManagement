package object1;
import java.sql.Date;


public class Task {
    private int taskID;
    private String taskName;
    private Date deadline;
    private int score;
    private String progress;

    protected static int taskCount = 0; // Static variable to count the total tasks made by one student

    //contructor 
    public Task(int taskID, String taskName, int score, String progress, Date deadline) {
        this.taskID = taskID;
        setTaskName(taskName);      // using setter with validation
        setScore(score);            // only teacher calls this
        setProgress(progress);       // student can call with condition
        this.deadline = deadline;
        taskCount++;
    }



    private int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    protected void setTaskName(String taskName){
        if (isValidTaskName(taskName)) {
            this.taskName = taskName;
        }
        else {
            System.out.println("Task name cannot be empty.");
        }
    }

    public Date getDeadline() {
        return deadline;
    }

    public int getScore() {
        return score;
    }
    
     // Protected setter: only Teachers can set this in the same package
    protected void setScore(int score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        }
        else {
            System.out.println("Score must be between 0 and 10.");
        }
    }

    public String getProgress() {
        return progress;
    }

    protected void setProgress(String progress) {
        if (progress == null) {
        System.out.println("Progress cannot be null.");
        return;
        }

        progress = progress.trim().toLowerCase(); // normalize input

        if (progress.equals("start") || progress.equals("in progress") || progress.equals("complete")) {
            this.progress = progress;
        } 
        else {
            System.out.println("Invalid progress status. Allowed values: start, in progress, complete.");
        }
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
