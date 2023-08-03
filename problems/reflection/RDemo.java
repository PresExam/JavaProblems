package problems.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RDemo {
    public static void main(String[] args) {
        Class<?> stringClass = String.class;

        System.out.println("Class Name : "+stringClass.getName());
        System.out.println("---------------------------------");
        System.out.println("Declaration fields : ");
        System.out.println("---------------------");
        Field[] fields = stringClass.getDeclaredFields();
        for(Field field : fields)
            System.out.println("Field : "+field.getName()+", Type : "+field.getType().getName());
        System.out.println("----------------------------------");
        System.out.println("Declared methods: ");
        System.out.println("------------------");
        Method[] methods = stringClass.getDeclaredMethods();
        for(Method method : methods)
            System.out.println("Method : "+method.getName()+", Return Type : "+method.getReturnType().getName());
    }
}
