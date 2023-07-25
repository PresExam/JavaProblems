package problems.aggregation;

public class Patient {
    String patientName;
    int patientAge;
    String dob;
    String disease;
    Information info;
    Payment payment;
    public Patient(String patientName, int patientAge, String dob, String disease, Information info, Payment payment){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.dob = dob;
        this.disease = disease;
        this.info = info;
        this.payment = payment;
    }
    public void printDetails(){
        System.out.println(this.patientName+" : Details");
        System.out.println("Patient Name : " + this.patientName);
        System.out.println("Patient Age : " + this.patientAge);
        System.out.println("Patient DOB : " + this.dob);
        System.out.println("Patient Disease : " + this.disease);
        System.out.println();
        System.out.println(this.patientName+" : Information");
        System.out.println("Patient's Block No : " + this.info.blockNo);
        System.out.println("Patient's Floor No : " + this.info.floorNo);
        System.out.println("Patient's Room No : " + this.info.roomNo);
        System.out.println("Patient's Bed No : " + this.info.bedNo);
        System.out.println();
        System.out.println(this.patientName+" : Payment Details");
        System.out.println("Patient's Admission Fees : " + this.payment.admFees);
        System.out.println("Patient's Registration Fees : " + this.payment.regFees);
        System.out.println("Patient's Available Balance : " + this.payment.balAmt);
    }
}
