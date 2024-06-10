public class Foreigner extends Visitors_Registration {


    public Foreigner(String name, String idNumber, String phoneNumber, String userName, String password) {
        super(name, idNumber, phoneNumber);
    }

    public String toString() {
        String var100=this.getName();
        return var100+" "  + getVisitorNumber() + " ,IdNumber: " + getIdNumber() + ",PhoneNumber: " + getPhoneNumber()+",UserName: "+getUserName();
    }


}
