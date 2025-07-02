import java.sql.Date;


public class Task {
    int taskID;
    String taskName;
    int workPoint;
    String progress;
    Date deadline;
    Boolean importance_status;
    
    public Task(int taskID, String taskName, int workPoint, String progress, Date deadline, Boolean importance_status) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.workPoint = workPoint;
        this.progress = progress;
        this.deadline = deadline;
        this.importance_status = importance_status;
    }



}