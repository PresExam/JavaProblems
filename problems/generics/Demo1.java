package problems.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1<o> {
    public static void main(String[] args) {
        int value = 54;
        List values = new ArrayList();
        values.add(7);
        values.add("Deepak");

        List<Integer> valuess = new ArrayList<Integer>();
        valuess.add(7);

        int i = Integer.parseInt(values.get(0).toString());
        System.out.println(i);
    }
}
