public class FoodCampingEquiment extends Acamadation{
    public String NameOfPackage;
    private String NameOfFood;
    private String TypeOfFood;
    private String NameOfEquipmentPackage;
    double EquipmentPackageprice;
    private int Quantity;

    public  FoodCampingEquiment() {
        super("NameOfVehicle", "IdNumber", "phoneNumber");
        this.NameOfFood = NameOfFood;
        this.TypeOfFood = TypeOfFood;
        this.NameOfEquipmentPackage = NameOfEquipmentPackage;
        this.EquipmentPackageprice = EquipmentPackageprice;
        this.Quantity = Quantity;
    }

    public FoodCampingEquiment(String nameOfVehicle, String idNumber, String phoneNumber) {
        super(nameOfVehicle, idNumber, phoneNumber);
    }



    public String getNameOfFood() {
        return NameOfFood;
    }
    public String getTypeOfFood() {
        return TypeOfFood;
    }
    public String getNameOfEquipmentPackage() {
        return NameOfEquipmentPackage;
    }
    public double getEquipmentPackageprice() {
        return EquipmentPackageprice;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setNameOfFood(String NameOfFood) {
        this.NameOfFood = NameOfFood;
    }
    public void setTypeOfFood(String TypeOfFood) {
        this.TypeOfFood = TypeOfFood;
    }
    public void setNameOfEquipmentPackage(String NameOfEquipmentPackage) {
        this.NameOfEquipmentPackage = NameOfEquipmentPackage;

    }
    public void setEquipmentPackageprice(double EquipmentPackageprice) {
        this.EquipmentPackageprice = EquipmentPackageprice;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public void Details() {
        System.out.println(" ");
        System.out.println("Name Of Food: " + NameOfFood);
        System.out.println("Type Of Food: " + TypeOfFood);
        System.out.println("Name Of Equipment Package: " + NameOfEquipmentPackage);
        System.out.println("Equipment Package Price: " + EquipmentPackageprice);
        System.out.println("Quantity: " + Quantity);
    }
    public static void Menu() {
        System.out.println(" ");
    }
    public void Booking() {

    }

    public void NameOfEquipmentPackage() {
        System.out.println("\uD835\uDC1C\uD835\uDC1A\uD835\uDC26\uD835\uDC29\uD835\uDC22\uD835\uDC27\uD835\uDC20 \uD835\uDC1E\uD835\uDC2A\uD835\uDC2E\uD835\uDC22\uD835\uDC29\uD835\uDC26\uD835\uDC1E\uD835\uDC27\uD835\uDC2D \uD835\uDC1F\uD835\uDC28\uD835\uDC2B \uD835\uDC2B\uD835\uDC1E\uD835\uDC27\uD835\uDC2D\n" +
                "\n" +
                "\n" +
                "4 \uD835\uDC95\uD835\uDC98\uD835\uDC90 \uD835\uDC90\uD835\uDC93 \uD835\uDC8E\uD835\uDC90\uD835\uDC93\uD835\uDC86 \uD835\uDC85\uD835\uDC82\uD835\uDC9A \uD835\uDC79\uD835\uDC94.800/=\n" +
                "6 \uD835\uDC95\uD835\uDC98\uD835\uDC90 \uD835\uDC90\uD835\uDC93 \uD835\uDC8E\uD835\uDC90\uD835\uDC93\uD835\uDC86 \uD835\uDC85\uD835\uDC82\uD835\uDC9A \uD835\uDC79\uD835\uDC94.800/=\n" +
                "\n" +
                "\uD835\uDE72\uD835\uDE98\uD835\uDE95\uD835\uDE8E\uD835\uDE96\uD835\uDE8A\uD835\uDE97 \uD835\uDE91\uD835\uDE92\uD835\uDE90\uD835\uDE91 \uD835\uDE9A\uD835\uDE9E\uD835\uDE8A\uD835\uDE95\uD835\uDE92\uD835\uDE9D\uD835\uDEA2 \uD835\uDE9D\uD835\uDE8E\uD835\uDE97\uD835\uDE9D\n" +
                "\n" +
                "8-10 \uD835\uDC2D\uD835\uDC30\uD835\uDC28 \uD835\uDC28\uD835\uDC2B \uD835\uDC26\uD835\uDC28\uD835\uDC2B\uD835\uDC1E \uD835\uDC1D\uD835\uDC1A\uD835\uDC32\uD835\uDC2C \uD835\uDC11\uD835\uDC2C.2000/=\n" +
                "2 \uD835\uDC2D\uD835\uDC30\uD835\uDC28 \uD835\uDC28\uD835\uDC2B \uD835\uDC26\uD835\uDC28\uD835\uDC2B\uD835\uDC1E \uD835\uDC1D\uD835\uDC1A\uD835\uDC32\uD835\uDC2C \uD835\uDC11\uD835\uDC2C.2000/=\n" +
                "\n" +
                "* Tents with rain cover and ground sheet.\n" +
                "* BBQ grill Rs.450\n" +
                "* Gas stove Rs.450\n" +
                "* Lamp. Rs.450\n" +
                "* Hiking bag Rs.350\n" +
                "* Sleeping bag Rs.350\n" +
                "* Sleeping mattress Rs.350\n" +
                "* Hammock Rs.400\n" +
                "* Cooking set Rs.500\n" +
                "* light system Rs.500\n" +
                "* Extra rain cover camping tent Rs.450\n");
    }

    public void NameOfFood1() {
        System.out.println("1. Breakfast\n" +
                "\n" +
                "1. Roast Paan (Roasted Bread)\n" +
                "2. Kiribath (Milk Rice)1\n" +
                "3. Pol Roti (Coconut Flat Bread)\n" +
                "4. Boiled Manioc\n" +
                "5. Kola Kenda (Herbal Porridge)\n" +
                "6. Fruits\n" +
                "7. Ceylon Tea\n" +
                "8. Ceylon Coffee\n" +
                "9. Thambili (King Coconut)\n" +
                "\n" +
                " \t1-Person         = Rs.600.00\n" +
                "\t2-Preson         = Rs.1000.00\n" +
                "\tFamily(5-person) = Rs.2000.00");

    }
    public void NameOfFood2() {
        System.out.println("2. Lunch\n" +
                "\n" +
                "1. Polos Curry (Young Jackfruit Curry)\n" +
                "2. Kir Kos (Matured Jackfruit Curry)\n" +
                "3. Kos Atta Maluwa (Jackfruit Seed Curry)\n" +
                "4. Kalupol Wattaka (Pumpkin Curry)\n" +
                "5. Batu Moju (Eggplant Curry)\n" +
                "6. Parippu (Lentil Curry)\n" +
                "7. Kukulmas Mirisata (Spicy Chicken Curry)\n" +
                "8. Ambul Thiyal (Fish Curry)\n" +
                "9. Prawn Curry\n" +
                "10. Kaju Maluwa (Cashew Curry)\n" +
                "11. Ambarella Curry\n" +
                "12. Pineapple Curry\n" +
                "13. Gotukola Sambola (Leafy Green Salad)\n" +
                "14. Gotukola Mellum (Tempered Leafy Greens)\n" +
                "15. Kesel Muwa Maaluwa (Banana Flower Curry)\n" +
                "16. Nelum Ala Maluwa (Lotus Root Curry)\n" +
                "\n" +
                "17. Watalappan\n" +
                "18. Curd and Kithul Treacle\n" +
                "19. Fruits\n" +
                "\n" +
                " \t1-Person         = Rs.900.00\n" +
                "\t2-Preson         = Rs.1500.00\n" +
                "\tFamily(5-person) = Rs.3000.00");

    }
    public void NameOfFood3() {
        System.out.println("3.Dinner\n" +
                "\n" +
                "1. Indi Appa (String Hoppers)\n" +
                "2. Appa (Hopper)\n" +
                "3. Thosai (Pancake)\n" +
                "4. Watalappan\n" +
                "\n" +
                " \t1-Person         = Rs.750.00\n" +
                "\t2-Preson         = Rs.1250.00\n" +
                "\tFamily(5-person) = Rs.2500.00\n");

    }
}
