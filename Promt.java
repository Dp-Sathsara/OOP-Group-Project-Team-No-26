import java.lang.*;
import java.util.*;

public class Promt{
    public Promt(String name, String idNumber, String phoneNumber, String Password,String UserName) {

    }

    public static void main(String[] args) {
        EmergencyAssistance.ForMatale.setHospitalName();
        Transport Car = new Transport("Car", "Model");
        Transport Van = new Transport("Van", "Model");
        Transport ThreeWeeler = new Transport("ThreeWeeler", "Model");
        Car.NameOfVehicle="Toyota Allion (Car)";
        //Car.VehicleDetails1();
        Van.NameOfVehicle="Toyota KDH (Van)";
        ThreeWeeler.NameOfVehicle="Bajaj RE SP (Three Wheel)";

        FoodCampingEquiment Package1 = new FoodCampingEquiment();
        FoodCampingEquiment Package2 = new FoodCampingEquiment();
        FoodCampingEquiment Package3 = new FoodCampingEquiment();
        //Package1.NameOfPackage="Portion 1(For 2 Persons)";
        //Package1.EquipmentPackageprice=100;
        Package1.setNameOfEquipmentPackage("Portion 1(For 2 Persons)");
        Package1.setEquipmentPackageprice(100);
        Package1.setQuantity(2);
        Package1.setNameOfFood("Breakfast");
        Package1.getNameOfFood();
        Package1.getTypeOfFood();

        Package2.setNameOfEquipmentPackage("Portion 2(For 4 Persons)");
        Package2.setEquipmentPackageprice(200);
        Package2.setQuantity(4);
        Package2.setNameOfFood("Lunch");
        Package2.getNameOfFood();
        Package2.getTypeOfFood();

        Package3.setNameOfEquipmentPackage("Portion 3(For 6 Persons)");
        Package3.setEquipmentPackageprice(300);
        Package3.setQuantity(6);
        Package3.setNameOfFood("Dinner");
        Package3.getNameOfFood();
        Package3.getTypeOfFood();

        Acamadation RestHouse1 = new Acamadation();
        Acamadation RestHouse2 = new Acamadation();
        Acamadation RestHouse3 = new Acamadation();
        Acamadation RestHouse4 = new Acamadation();
        RestHouse1.setTimeperiod(2);
        RestHouse2.setTimeperiod(3);
        RestHouse3.setTimeperiod(4);
        RestHouse4.setTimeperiod(3);

        EmergencyAssistance ForMatale = new EmergencyAssistance();
        EmergencyAssistance ForJaffna = new EmergencyAssistance();
        EmergencyAssistance ForNuwaraEliya = new EmergencyAssistance();
        EmergencyAssistance ForKandy = new EmergencyAssistance();
        ForMatale.setHospitalName("District General Hospital Matale");
        ForMatale.setHospitalAddress("FJ6F+CVP, Matale ");
        ForMatale.setHospitalContactNumber("0662 222 261 ");
        ForMatale.setAmbulanceEmergencyNo("0662 222 261");
        ForMatale.setPolicestationAddress("FJ7G+4F8, Kandy - Jaffna Hwy, Matale 21000");
        ForMatale.setPolicestationNo("0662 222 222");
        ForMatale.setForceHotline("0123456789");

        ForJaffna.setHospitalName("Teaching Hospital Jaffna");
        ForJaffna.setHospitalAddress("M288+968, Hospital St, Jaffna 40000 ");
        ForJaffna.setHospitalContactNumber("0212 223 348 ");
        ForJaffna.setAmbulanceEmergencyNo("076 328 3783");
        ForJaffna.setPolicestationAddress("M256+X8H, AB21, Jaffna");
        ForJaffna.setPolicestationNo("0213 211 258 ");
        ForMatale.setForceHotline(" +94 212222112");

        ForNuwaraEliya.setHospitalName("District General Hospital Nuwara Eliya");
        ForNuwaraEliya.setHospitalAddress("Nuwara Eliya-Uda Pussellawa Rd, Nuwara Eliya 22200 ");
        ForNuwaraEliya.setHospitalContactNumber("0522 222 261");
        ForNuwaraEliya.setAmbulanceEmergencyNo("0522 222 261");
        ForNuwaraEliya.setPolicestationAddress("XQF9+M32, Sir Jayathilake Mawatha, Nuwara Eliya 22200");
        ForNuwaraEliya.setPolicestationNo("0522 222 222");
        ForNuwaraEliya.setForceHotline("0522 222 750");

        ForKandy.setHospitalName("Teaching Hospital Kandy");
        ForKandy.setHospitalAddress("Teaching Hospital Kandy,Kandy,20000,Sri Lanka ");
        ForKandy.setHospitalContactNumber("0812 22 22 61");
        ForKandy.setAmbulanceEmergencyNo("0812 22 22 61");
        ForKandy.setPolicestationAddress("7JVM+5FC, Peradeniya Rd, Kandy 20000");
        ForKandy.setPolicestationNo("0812 22 22 22");
        ForKandy.setForceHotline("0123466789");



        //FoodCampingEquiment foodCampingEquiment1 = new FoodCampingEquiment();
        Foreigner.getPassword();

        ArrayList<Foreigner> Foreigner = new ArrayList();
        ArrayList<Domestic> Domestic = new ArrayList();
        int Foreignercount = 0;
        int Domesticcount = 0;
        Scanner input = new Scanner(System.in);
        int response ;
        try {
            lable1:
           do{
               Places place1 = new Places();
               Places place2 = new Places();
               Places place3 = new Places();
               Places place4 = new Places();

               place1.NameOfplace="Matale";
               place2.NameOfplace="Jaffna";
               place3.NameOfplace="Nuwara Eliya";
               place4.NameOfplace="Kandy";

               place1.Location="https://www.google.com/maps/place/%E0%B6%B8%E0%B7%8F%E0%B6%AD%E0%B6%BD%E0%B7%9A/@7.4583784,80.6080625,14z/data=!3m1!4b1!4m6!3m5!1s0x3ae344d7d465445d:0xd6f70562e8850dbc!8m2!3d7.467465!4d80.6234161!16zL20vMDZyZGQ4?authuser=0&entry=ttu";
               place2.Location="https://www.google.com/maps/place/%E0%B6%BA%E0%B7%8F%E0%B6%B4%E0%B6%B1%E0%B6%BA/@9.6699992,80.0077842,14z/data=!3m1!4b1!4m6!3m5!1s0x3afe53fd7be66aa5:0xc7da0d9203baf512!8m2!3d9.6614981!4d80.0255465!16s%2Fm%2F0266536?authuser=0&entry=ttu";
               place3.Location="https://www.google.com/maps/place/%E0%B6%B1%E0%B7%94%E0%B7%80%E0%B6%BB%E0%B6%91%E0%B7%85%E0%B7%92%E0%B6%BA/@6.9514084,80.7603045,14z/data=!3m1!4b1!4m6!3m5!1s0x3ae380434e1554c7:0x291608404c937d9c!8m2!3d6.9497166!4d80.7891068!16zL20vMDJoZzcw?authuser=0&entry=ttu";
               place4.Location="https://www.google.com/maps/place/%E0%B6%B8%E0%B7%84%E0%B6%B1%E0%B7%94%E0%B7%80%E0%B6%BB/@7.2945874,80.605139,14z/data=!3m1!4b1!4m6!3m5!1s0x3ae366266498acd3:0x411a3818a1e03c35!8m2!3d7.2905715!4d80.6337262!16zL20vMDFzZzRf?authuser=0&entry=ttu";
               place1.InformationOfguide="Matale\n" +
                       "\n" +
                       "Guide ID:\t\tLK22345\n" +
                       "Guide Name:\t\tPrasanna Lal\n" +
                       "Experience:\t\tSince 2011\n" +
                       "Gender:\t\t\tMale\n" +
                       "Private Tour Guide In:\tMatale\n" +
                       "Other Guiding Areas:\tMatale, Colombo\n" +
                       "Languages:\t\tEnglish\n" +
                       "Contact Number:\t\t071568290\n";
               place2.InformationOfguide="Jaffna\n" +
                       "\n" +
                       "Guide ID:\t\tLK51790\n" +
                       "Guide Name:\t\tAnthony Prageeth\n" +
                       "Experience:\t\tSince 2007\n" +
                       "Gender:\t\t\tMale\n" +
                       "Private Tour Guide In:\tJaffna\n" +
                       "Other Guiding Areas:\tKandy, Colombo, Jaffna\n" +
                       "Languages:\t\tEnglish\n" +
                       "Contact Number:\t\t0781568294";
               place3.InformationOfguide="Nuwara Eliya\n" +
                       "\n" +
                       "Guide ID:\t\tLK57799\n" +
                       "Guide Name:\t\tThushara Atthanayake\n" +
                       "Experience:\t\tSince 2010\n" +
                       "Gender:\t\t\tMale\n" +
                       "Private Tour Guide In:\tNuwara Eliya\n" +
                       "Other Guiding Areas:\tKandy, Colombo, Matale\n" +
                       "Languages:\t\tEnglish\n" +
                       "Contact Number:\t\t0781568294\n";
               place4.InformationOfguide="Kandy\n" +
                       "\n" +
                       "Guide ID:\t\tLK59745\n" +
                       "Guide Name:\t\tBandu Jayarathne\n" +
                       "Experience:\t\tSince 2004\n" +
                       "Gender:\t\t\tMale\n" +
                       "Private Tour Guide In:  Kandy\n" +
                       "Other Guiding Areas:\tKandy, Colombo\n" +
                       "Languages:\t\tEnglish\n" +
                       "Contact Number:\t\t0721568290";

               //place1.Matale1();




               System.out.println("================================================================== ");
               System.out.println("             Welcome To Vacation Management System App             ");
               System.out.println("================================================================== ");
               System.out.println("                         <MAIN MENU>                                               ");
               System.out.println("(1) Visitor Registration\n(2) Visitor Signin/Login \n(3) App Information\n(0) Exit");
               System.out.println("**First of all, See Registration by selecting 1");
               System.out.print("Select Your Option(1-3) : ");
               System.out.println("Select 0 to Exit");
               response = input.nextInt();
               int i;
               switch (response) {
                   case 1:
                       System.out.println("(1)Foreign Visitor\n(2)Domestic Visitor\n");
                       System.out.print("Select Your Option(1-2) : ");
                       i = input.nextInt();
                       input.nextLine();
                       String name;
                       String idNumber;
                       String phoneNumber;
                       String UserName;
                       String Password;
                       int visitorNumber;
                       if (i == 1) {
                           System.out.print("Enter Your Name : ");
                           name = input.nextLine();
                           System.out.print("Enter Your IdNumber : ");
                           idNumber = input.nextLine();
                           System.out.print("Enter Your PhoneNumber : ");
                           phoneNumber = input.nextLine();
                           System.out.print("Enter Your Username : ");
                           UserName = input.nextLine();
                           System.out.print("Enter Your Password : ");
                           Password = input.nextLine();
                           Foreigner Foregner1 = new Foreigner(name, idNumber, phoneNumber, UserName, Password);
                           Foreigner.add(Foregner1);
                           ++Foreignercount;
                           System.out.println("Registration Successful......");
                           System.out.println("Your Username is : " + Foregner1.getUserName());
                           System.out.println("You are Registed as Forign Visitor");
                           input.nextLine();
                           String NUsername;
                           String NPassword;
                           System.out.print("Enter your Username: ");
                           NUsername = input.nextLine();
                           System.out.print("Enter your Password: ");
                           NPassword = input.nextLine();
                           Logging_Page.Compare_username(NUsername, NPassword,UserName,Password);
                           //**********
                           do {

                               System.out.println("                     <Our Services> ");
                               System.out.println("(1)Places");
                               System.out.println("(2)Transport");
                               System.out.println("(3)Food & Camping Equipment");
                               System.out.println("(4)Acamadation");
                               System.out.println("(5)Emergency Assistance");
                               response = input.nextInt();
                               //input.nextInt();
                               int j;
                               switch (response) {
                                   case 1:
                                       System.out.println("            <Available Places>");
                                       System.out.println("(1)"+place1.NameOfplace);
                                       System.out.println("(2)"+place2.NameOfplace);
                                       System.out.println("(3)"+place3.NameOfplace);
                                       System.out.println("(4)"+place4.NameOfplace);
                                       System.out.println("Select Your Interest Place(1-4) : ");
                                       j=input.nextInt();
                                       if(j==1) {
                                           System.out.println("Name of place : "+place1.NameOfplace);
                                           System.out.println("Location : "+place1.Location);
                                           place1.Matale1();
                                           place1.Matale2();
                                           place1.Matale3();
                                           place1.Matale4();
                                           System.out.println("Information of guide : "+place1.InformationOfguide);
                                       }
                                       if(j==2) {
                                           System.out.println("Name of place : "+place2.NameOfplace);
                                           System.out.println("Location : "+place2.Location);
                                           place2.Jaffna1();
                                           place2.Jaffna2();
                                           place2.Jaffna3();
                                           System.out.println("Information of guide : "+place2.InformationOfguide);
                                       }
                                       if(j==3) {
                                           System.out.println("Name of place : "+place3.NameOfplace);
                                           System.out.println("Location : "+place3.Location);
                                           place3.NuwaraEliya1();
                                           place3.NuwaraEliya2();
                                           place3.NuwaraEliya3();
                                           System.out.println("Information of guide : "+place3.InformationOfguide);
                                       }
                                       if(j==4) {
                                           System.out.println("Name of place : "+place4.NameOfplace);
                                           System.out.println("Location : "+place4.Location);
                                           place4.Nuwara1();
                                           System.out.println("Information of guide : "+place4.InformationOfguide);
                                       }
                                       break;
                                   case 2:
                                       System.out.println("            <Available Transport Method>");
                                       System.out.println("(1)"+Car.NameOfVehicle);
                                       System.out.println("(2)"+Van.NameOfVehicle);
                                       System.out.println("(3)"+ThreeWeeler.NameOfVehicle);
                                       System.out.println("Select Your Interest Vehicle(1-3) : ");
                                       j=input.nextInt();
                                       if (j==1){
                                           Car.NameOfVehicle();
                                           Car.VehicleDetails1();
                                       }
                                       if(j==2){
                                           Van.NameOfVehicle();
                                           Van.VehicleDetails2();
                                       }
                                       if(j==3)
                                       {
                                           ThreeWeeler.NameOfVehicle();
                                           ThreeWeeler.VehicleDetails2();
                                       }
                                       break;
                                   case 3:
                                       System.out.println("            <Available Food & Equipment Package>");
                                       System.out.println("(1)"+Package1.getNameOfEquipmentPackage());
                                       System.out.println("(2)"+Package2.getNameOfEquipmentPackage());
                                       System.out.println("(3)"+Package3.getNameOfEquipmentPackage());

                                       System.out.println("(4)Breakfast"+Package1.getNameOfFood());
                                       System.out.println("(5)Lunch"+Package2.getNameOfFood());
                                       System.out.println("(6)Dinner"+Package3.getNameOfFood());

                                       System.out.println("Select Your Interest Vehicle(1-6) : ");
                                       j=input.nextInt();
                                       if(j==1){
                                           Package1.NameOfEquipmentPackage();
                                           Package1.Details();
                                       }
                                       if(j==2){
                                           Package2.NameOfEquipmentPackage();
                                           Package2.Details();
                                       }
                                       if(j==3){
                                           Package3.NameOfEquipmentPackage();
                                           Package3.Details();
                                       }
                                       if(j==4){
                                           Package1.NameOfFood1();
                                           Package1.Details();
                                       }
                                       if(j==5){
                                           Package2.NameOfFood2();
                                           Package2.Details();
                                       }
                                       if(j==6){
                                           Package3.NameOfFood3();
                                           Package3.Details();
                                       }
                                       break;
                                   case 4:
                                       System.out.println("            <Available Acamadation>");
                                       System.out.println("(1)Near The Matale.");
                                       System.out.println("(2)Near The Jaffna.");
                                       System.out.println("(3)Near The Nuwara Eliya.");
                                       System.out.println("(4)Near The Kandy.");

                                       System.out.print("Select Your Interest RestHouse.(1-4) : ");
                                       j=input.nextInt();
                                       if(j==1) {
                                           Acamadation.Details1();
                                       }
                                       if (j==2){
                                           Acamadation.Details2();
                                       }
                                       if(j==3){
                                           Acamadation.Details3();
                                       }
                                       if(j==4){
                                           Acamadation.Details4();
                                       }
                                       break;
                                   case 5:
                                       System.out.println("            <Emergency Assistance>");
                                       System.out.println("(1)Matale.");
                                       System.out.println("(2)Jaffna.");
                                       System.out.println("(3)Nuwara Eliya.");
                                       System.out.println("(4)Kandy.");
                                       System.out.print("Select Your Interest RestHouse.(1-4) : ");
                                       j=input.nextInt();
                                       if(j==1) {
                                           ForMatale.setHospitalName();
                                       }
                                       if (j==2){
                                          // EmergencyAssistance.getHospitalName();
                                       }
                                       if(j==3){
                                          // Emergency.Details3();
                                       }
                                       if(j==4){
                                           //Emergency.Details4();
                                       }

                                       break;
                               }
                           }while (true);

                           //**********

                           //System.out.println(Foreigner);

                       }
                       if(i==2) {
                           System.out.print("Enter Your Name : ");
                           name = input.nextLine();
                           System.out.print("Enter Your IdNumber : ");
                           idNumber = input.nextLine();
                           System.out.print("Enter Your PhoneNumber : ");
                           phoneNumber = input.nextLine();
                           System.out.print("Enter Your Username : ");
                           UserName = input.nextLine();
                           System.out.print("Enter Your Password : ");
                           Password = input.nextLine();
                           Domestic Domestic1 = new Domestic(name, idNumber, phoneNumber, UserName, Password);
                           Domestic.add(Domestic1);
                           ++Domesticcount;
                           System.out.println("Registration Successful......");
                           System.out.println("Your Username is : " + Domestic1.getUserName());
                           System.out.println("You are Registed as Domestic Visitor");
                           input.nextLine();
                           String NUsername;
                           String NPassword;
                           System.out.print("Enter your Username: ");
                           NUsername = input.nextLine();
                           System.out.print("Enter your Password: ");
                           NPassword = input.nextLine();
                           Logging_Page.Compare_username(NUsername, NPassword,UserName,Password);
                       }
                       break;
                   case 2:

                       input.nextLine();
                       String NUsername;
                       String NPassword;
                       System.out.print("Enter your Username: ");
                       NUsername = input.nextLine();
                       System.out.print("Enter your Password: ");
                       NPassword = input.nextLine();
                       Logging_Page.Compare_username(NUsername, NPassword);
                       //System.out.println("First of all, See Registration by selecting 1");
                       break;
                   case 3:

                       //System.out.println("First of all, See Registration by selecting 1");
                       break;

                   default:
                       //System.out.println("ff");
                       break;}

               }while (response!=0);
        }catch (Exception e){
            System.out.println("Error");
        }


    }
}
