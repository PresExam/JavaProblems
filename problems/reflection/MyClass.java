package problems.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    public void printMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args){
        try{
            Class<?> myClass = Class.forName("problems.reflection.MyClass");
            Method printMessageMethod = myClass.getMethod("printMessage", String.class);

            Object myClassinstance = myClass.getDeclaredConstructor().newInstance();

            printMessageMethod.invoke(myClassinstance, "Presidency University");
        }
        catch(ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
