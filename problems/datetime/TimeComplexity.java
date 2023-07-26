package problems.datetime;

public class TimeComplexity {
    public static void main(String[] args) {
        long stime;

        //Buffer Start
        stime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Presidency");
        for(int i = 1; i < 100000; i++) {
            buffer.append(" University");
        }
        System.out.println("Buffer Time : " + (System.currentTimeMillis()-stime)+"ms");

        //Builder Starts\
        stime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Presidency");
        for(int i = 1; i < 1000; i++){
            buffer.append(" University");
        }
        System.out.println("Builder Time : " + (System.currentTimeMillis()-stime)+"ms");
    }
}
