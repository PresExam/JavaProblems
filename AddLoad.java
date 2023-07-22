package problems;

class OverLoading{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(int a, float b){
        return a+b;
    }
    float add(float a, int b){
        return a+b;
    }
}
public class AddLoad {
    public static void main(String[] args) {
        OverLoading add = new OverLoading();
        int a, b;
        float c, d;
        a = add.add(5, 6);
        b = add.add(5, 6, 9);
        c = add.add(5, 6.8f);
        d=  add.add(4.8f, 6);
        System.out.println();
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
