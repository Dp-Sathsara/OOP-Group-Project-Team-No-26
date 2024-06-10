public class Visitors_Registration {
    private String name;
    private String Address;
    private String IdNumber;
    private String phoneNumber;
    private static int nextVisitorNumber = 100;
    private int visitorNumber;
    private String UserName;
    private static String Password;



    public Visitors_Registration(String idNumber, String name, String phoneNumber) {
        this.name = name;
        this.IdNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.Password = Password;
        this.UserName = UserName;
        this.visitorNumber = nextVisitorNumber;
        nextVisitorNumber++;
    }

    public Visitors_Registration(String UserName, String password) {
    }



    public String getName() {
        return name;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public String getAddress() {
        return Address;
    }
    public String getIdNumber() {
        return IdNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getVisitorNumber() {
        return visitorNumber;
    }

    public void setPassword(String Password) {
        this.Password = Password;
        
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }
    public static String getPassword() {
        return Password;

    }
    public String toString() {
        return "visitor{Name: "+ name + " ,IdNumber: " + IdNumber + ",PhoneNumber: " + phoneNumber+"UserName: "+UserName+"Password: "+Password+" }";
    }
    //Logging in
}
