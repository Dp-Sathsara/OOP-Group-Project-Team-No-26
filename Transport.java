public class Transport extends FoodCampingEquiment {
    public String NameOfVehicle;
    private String VehicleDetails;



    public String getNameOfVehicle() {
        return NameOfVehicle;
    }
    public void setNameOfVehicle(String NameOfVehicle) {
        this.NameOfVehicle = NameOfVehicle;
    }
    public String getVehicleDetails() {
        return VehicleDetails;
    }
    public void setVehicleDetails(String VehicleDetails) {
        this.VehicleDetails = VehicleDetails;
    }
    public void Details() {
        System.out.println("Name Of Vehicle: " + NameOfVehicle);
        System.out.println("Vehicle Details: " + VehicleDetails);
    }
    public Transport(String NameOfVehicle, String VehicleDetails) {
        super(NameOfVehicle, "IdNumber", "phoneNumber");
        this.NameOfVehicle = NameOfVehicle;
        this.VehicleDetails = VehicleDetails;
    }

    public void NameOfVehicle() {

    }
    public static void VehicleDetails1() {
        System.out.println("Toyota Allion (Car)");
        System.out.println("Vehicale Number - \tNW-2345\n" +
                "Driver Name - \t\tChaminda Jayalath\n" +
                "Contact Number - \t0758934891\n" +
                "No of Sheets - \t\t4\n" +
                "AC/Non AC - \t\tAC\n" +
                "Service Charge - \t1 km to Rs 100");

    }
    public static void VehicleDetails2() {
        System.out.println("Toyota KDH (Van)");
        System.out.println("Vehicale Number - \tNW-6745\n" +
                "Driver Name - \t\tSampath Kumara \n" +
                "Contact Number - \t0778934899\n" +
                "No of Sheets - \t\t12\n" +
                "AC/Non AC - \t\tAC\n" +
                "Service Charge - \t1 km to Rs 80 ");

    }
    public static void VehicleDetails3() {
        System.out.println("Bajaj RE SP (Three Wheel)");
        System.out.println("Vehicale Number - \tNW-8955\n" +
                "Driver Name - \t\tAnjith Silva \n" +
                "Contact Number - \t0778939992\n" +
                "No of Sheets - \t\t3\n" +
                "AC/Non AC - \t\tNon AC\n" +
                "Service Charge - \t1 km to Rs 50 ");

    }
}
