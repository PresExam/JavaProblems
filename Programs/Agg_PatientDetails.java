package problems;

public class Agg_PatientDetails {
    public static void main(String[] args) {
        Agg_Information i1 = new Agg_Information("LFL", 1, 03, 28);
        Agg_Payment a1 = new Agg_Payment(15000f, 250000f, 750000f);
        Agg_Patient p1 = new Agg_Patient("Rakesh", 20, "24 July 1999", "Malaria", i1, a1);
        p1.printDetails();
    }
}
