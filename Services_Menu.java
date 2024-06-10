import java.util.Scanner;

public class Services_Menu extends Transport {
    public Services_Menu(String NameOfVehicle, String VehicleDetails) {
        super(NameOfVehicle,VehicleDetails);
    }
    public static void Menu() {
        int responce;
        try {
            do{
                System.out.println("                     <Our Services> ");
                System.out.println("(1)Places");
                System.out.println("(2)Transport");
                System.out.println("(3)Food & Camping Equipment");
                System.out.println("(4)Acamadation");
                System.out.println("(5)Emergency Assistance");
                responce = new Scanner(System.in).nextInt();
                Scanner input = new Scanner(System.in);
                switch (responce) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }
            }while (true);

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
