import java.sql.Date;


public class Task {
    private int taskID;
    private String taskName;
    private int workPoint;
    private String progress;
    private Date deadline;
    private Boolean importance_status;
    
    //contructor 
    public Task(int taskID, String taskName, int workPoint, String progress, Date deadline, Boolean importance_status) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.workPoint = workPoint;
        this.progress = progress;
        this.deadline = deadline;
        this.importance_status = importance_status;
    }



}