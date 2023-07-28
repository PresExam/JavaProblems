package problems.generics;

import java.util.ArrayList;

class Container<T extends Number>{                                     //Generic Class
    T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public void show(){
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<? super T> obj){

    }
}

public class Demo4 {
    public static void main(String[] args) {
//        Container obj = new Container();              // Raw Type
        Container<Integer> obj1 = new Container<>();
        Container<Double> obj2 = new Container<>();

        obj1.value = 9;
        obj1.show();

        obj2.value = 7.0;
        obj2.show();
    }
}