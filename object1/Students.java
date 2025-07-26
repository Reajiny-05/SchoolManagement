package object1;


public class Students extends User{
    private int totalWorkPoint = 0;

    //constructor
    public Students(int userID, String email, String password, String username, String phoneNumber,
            String institude, int totalWorkPoint) {
        super(userID, email, password, username, phoneNumber, institude);
        this.setTotalWorkPoint(totalWorkPoint);
    }

    //overloaded constructor
    public Students(String password, String username) {
        super(password, username);
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
        return super.toString() + ", Students [totalWorkPoint = " + totalWorkPoint + "]";
    }

    @Override
    public String displayUserInfo() {
        return super.displayUserInfo() + ", totalWorkPoint = " + totalWorkPoint;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // using the equals method from User class to compare email, and reuse the logic from user class
    }
    
}

