package problems.overriding;

class ReserveBankOfIndia{
    int rateOfInterest(){ return 5; }
}
class HDFC extends ReserveBankOfIndia{
    int rateOfInterest(){ return 6; }
}
class AXIS extends ReserveBankOfIndia{
    int rateOfInterest(){ return 7; }
}

class SBI extends ReserveBankOfIndia{
    int rateOfInterest(){ return 8; }
}
public class Bank {
    public static void main(String[] args) {
        ReserveBankOfIndia rbi = new ReserveBankOfIndia();
        HDFC hdfc = new HDFC();
        AXIS axis = new AXIS();
        SBI sbi = new SBI();

        System.out.println("RBI : "+rbi.rateOfInterest());
        System.out.println("HDFC : "+hdfc.rateOfInterest());
        System.out.println("AXIS : "+axis.rateOfInterest());
        System.out.println("SBI : "+sbi.rateOfInterest());
    }
}
