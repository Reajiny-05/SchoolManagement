package object1;


public class Students extends User{
    private int totalWorkPoint = 0;

    //constructor
    public Students(int userID, String email, String password, String username, String phoneNumber,
            String institude, int totalWorkPoint) {
        super(userID, email, password, username, phoneNumber, institude);
    }

    //overloaded constructor
    public Students(String password, String username) {
        super(password, username);
    }

     public int getTotalWorkPoint() {
        return totalWorkPoint;
    }

    protected void setTotalWorkPoint(int totalWorkPoint) {
        if (totalWorkPoint < 0) {
            System.out.println(" Work point must be >= 0.");
            this.totalWorkPoint = 0;
        } else {
            this.totalWorkPoint = totalWorkPoint;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Students [totalWorkPoint=" + totalWorkPoint + "]";
    }


}

