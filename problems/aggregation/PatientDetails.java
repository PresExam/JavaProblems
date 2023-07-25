package problems.aggregation;

public class PatientDetails {
    public static void main(String[] args) {
        Information i1 = new Information("LFL", 1, 03, 28);
        Payment a1 = new Payment(15000f, 250000f, 750000f);
        Patient p1 = new Patient("Rakesh", 20, "24 July 1999", "Malaria", i1, a1);
        p1.printDetails();
    }
}
