public class EmergencyAssistance {
    public static EmergencyAssistance ForMatale;
    private static String HospitalName;
    private String HospitalAddress;
    private String HospitalContactNumber;
    private String AmbulanceEmergencyNo;
    private String policestationNo;
    private String PolicestationAddress;
    private String ForceHotline;

    public EmergencyAssistance(String HospitalName, String HospitalAddress, String HospitalContactNumber, String AmbulanceEmergencyNo, String policestationNo, String PolicestationAddress, String ForceHotline) {
        this.HospitalName = HospitalName;
        this.HospitalAddress = HospitalAddress;
        this.HospitalContactNumber = HospitalContactNumber;
        this.AmbulanceEmergencyNo = AmbulanceEmergencyNo;
        this.policestationNo = policestationNo;
        this.PolicestationAddress = PolicestationAddress;
        this.ForceHotline = ForceHotline;
    }

    public EmergencyAssistance() {

    }

    public static String getHospitalName() {
        return HospitalName;
    }
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }
    public String getHospitalAddress() {
        return HospitalAddress;
    }
    public void setHospitalAddress(String HospitalAddress) {
        this.HospitalAddress = HospitalAddress;
    }
    public String getHospitalContactNumber() {
        return HospitalContactNumber;
    }
    public void setHospitalContactNumber(String HospitalContactNumber) {
        this.HospitalContactNumber = HospitalContactNumber;
    }
    public String getAmbulanceEmergencyNo() {
        return AmbulanceEmergencyNo;
    }
    public void setAmbulanceEmergencyNo(String AmbulanceEmergencyNo) {
        this.AmbulanceEmergencyNo = AmbulanceEmergencyNo;
    }
    public String getPolicestationNo() {
        return policestationNo;
    }
    public void setPolicestationNo(String policestationNo) {
        this.policestationNo = policestationNo;
    }
    public String getPolicestationAddress() {
        return PolicestationAddress;
    }
    public void setPolicestationAddress(String PolicestationAddress) {
        this.PolicestationAddress = PolicestationAddress;
    }
    public String getForceHotline() {
        return ForceHotline;
    }
    public void setForceHotline(String ForceHotline) {
        this.ForceHotline = ForceHotline;
    }
    public void AssDetails() {
        System.out.println("Hospital Name: " + HospitalName);
        System.out.println("Hospital Address: " + HospitalAddress);
        System.out.println("Hospital Contact Number: " + HospitalContactNumber);
        System.out.println("Ambulance Emergency Number: " + AmbulanceEmergencyNo);
        System.out.println("Police Station Number: " + policestationNo);
        System.out.println("Police Station Address: " + PolicestationAddress);
        System.out.println("Force Hotline: " + ForceHotline);
    }

    public void setHospitalName() {
    }
}
