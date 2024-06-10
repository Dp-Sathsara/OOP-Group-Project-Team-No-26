import javax.print.attribute.standard.RequestingUserName;
import java.lang.String;
public class Logging_Page extends Visitors_Registration {
    public Logging_Page(String Username, String Password) {
        super(Username, Password);
    }
    public static void Compare_username(String Username, String Password, String NUsername, String NPassword){
        if(Username.compareTo(NUsername)==0 && Password.compareTo(NPassword)==0) {
            System.out.println("Login Successful......");
            System.out.println("Hi, "+Username+" Welcome");

        }else {

            System.out.println("Login Failed..");
            System.out.println("Please Check Your Username and Password.");
        }
    }

    public static void Compare_username(String NUsername, String NPassword) {
        System.out.println("Login Successful......");
        System.out.println("Hi, "+NUsername+" Welcome");
    }
}
