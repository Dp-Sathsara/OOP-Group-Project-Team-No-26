public class Acamadation extends Visitors_Registration{

    public Acamadation(String name, String idNumber, String phoneNumber) {
        super(name, idNumber, phoneNumber);
    }
    private String RestHouseDetails;
    private int Timeperiod;

    public Acamadation() {
        super("Name", "IdNumber", "phoneNumber");
        this.RestHouseDetails = RestHouseDetails;
        this.Timeperiod = Timeperiod;
    }
    public static void Details1() {
        System.out.println(" ");
        System.out.println("Matale\n" +
                "\n" +
                "Rest House - walawwa Guest House (17802MS)\n" +
                "Address - CJQ7+3PM,Matale.\n" +
                "location - https://maps.app.goo.gl/ucqCwmEsZT1DqqGB9\n" +
                "\n" +
                "Located 3.5km away from Nuwara Mathale town, Walawwa Guest House is surrounded by beautiful surroundings. A young couple as well as a family can come and stay comfortably. You can book rooms as per your requirement. This located near the Udawattekelle, Udawatta kele Sanctuary, Bahirawakanda Vihara BuddhaStatue.\n" +
                "For the couple\n" +
                "One bed \n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 10000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 17000.00\n" +
                "\n" +
                "For One Family\n" +
                "Two beds\n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 22000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 35000.00");
    }
    public static void Details2() {
        System.out.println(" ");
        System.out.println("Jaffna\n" +
                "\n" +
                "Rest House -Nllur Residance  (99876SW)\n" +
                "Address - 656 Point Pedro Rd Nallur, Jaffna 40000 Sri Lanka\n" +
                "location - https://maps.app.goo.gl/t8Z2HT4fRZjZidsK7\n" +
                "\n" +
                "Set within 400 metres of Nallur Kandaswamy Temple and 2.4 km of Jaffna Railway Station. Well-known for its family-friendly environment and proximity to great restaurants and attractions, Nallur Residence makes it easy to enjoy the best of Jaffna. Nallur Residence is a family-friendly inn offering a desk in the rooms.Kadurugoda Buddhist Temple (1.3 mi), located nearby, makes Nallur Residence a great place to stay for those interested in visiting this popular Jaffna landmark.\n" +
                "\n" +
                "For the couple\n" +
                "One bed \n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 10000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 15000.00\n" +
                "\n" +
                "For One Family\n" +
                "Two beds\n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 25000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 32000.00");
    }
    public static void Details3() {
        System.out.println(" ");
        System.out.println("Nuwara Eliya\n" +
                "\n" +
                "Rest House - The Westbury Palace (11022NS)\n" +
                "Address - No.17, Udupussellawa Road, Nuwaraeliya.\n" +
                "location - https://maps.app.goo.gl/3H47ZCL2i3XkSGqY6\n" +
                "\n" +
                "Located 1km away from Nuwara Eliya city, Sulaga Lodge is surrounded by beautiful surroundings. A young couple as well as a family can come and stay comfortably. You can book rooms as per your requirement. This located near the Victoria park, Assemblies of God Church,Galway Forest Reserve, LakeGregory.\n" +
                "\n" +
                "For the couple\n" +
                "One bed \n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 20000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 35000.00\n" +
                "\n" +
                "For One Family\n" +
                "Two beds\n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 45000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 60000.00\n" +
                "\n");
    }
    public static void Details4() {
        System.out.println(" ");
        System.out.println("Kandy\n" +
                "\n" +
                "Rest House - Kandy Holiday Reesidance(1834HR)\n" +
                "Address - NO. 19/5, P.L.P.Alwis Mawatha, Kandy.\n" +
                "location -https://maps.app.goo.gl/oRPMxAJ6e2tJiniEA\n" +
                "\n" +
                "Located in Kandy, Kandy Holiday Residence is just steps from Udawatta Kele Sanctuary and a 2-minute drive from Kandyan Art Association & Cultural Centre. This villa is 1.1 mi (1.7 km) from British Garrison Cemetery and 1.1 mi (1.8 km) from Temple of the Tooth.This located near the Ramboda FAlls,Kandy National Museum,Asgiri Vihara Piriwena,Peradeniya Bridge, Natha Devalaya.\n" +
                "\n" +
                "For the couple\n" +
                "One bed \n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 220000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 27000.00\n" +
                "\n" +
                "For One Family\n" +
                "Two beds\n" +
                "Attached bathroom\n" +
                "For one night with dinner and breakfast buffet - Rs 35000.00\n" +
                "for one night with lunch, Dinner, Breakfast buffet - Rs 42000.00\n");
    }

    public String getRestHouseDetails() {

        return RestHouseDetails;
    }
    public void setRestHouseDetails(String RestHouseDetails) {
        this.RestHouseDetails = RestHouseDetails;
    }
    public int getTimeperiod() {
        return Timeperiod;
    }
    public void setTimeperiod(int Timeperiod) {
        this.Timeperiod = Timeperiod;
    }
    public String toString() {
        String var100=this.getName();
        return var100+" "  + getVisitorNumber() + " ,IdNumber: " + getIdNumber() + ",PhoneNumber: " + getPhoneNumber() + " ,RestHouseDetails: " + RestHouseDetails + " ,Timeperiod: " + Timeperiod;
    }

}
