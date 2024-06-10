public class Domestic extends Visitors_Registration {
    public Domestic(String name, String idNumber, String phoneNumber, String UserName, String Password) {
        super(name, idNumber, phoneNumber);
    }
    public String toString() {
        String var100=this.getName();
        return var100+" "  + getVisitorNumber() + " ,IdNumber: " + getIdNumber() + ",PhoneNumber: " + getPhoneNumber()+",UserName: "+getUserName();
    }
}
