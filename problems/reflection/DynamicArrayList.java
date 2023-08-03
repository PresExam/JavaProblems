package problems.reflection;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class DynamicArrayList {
    public static void main(String[] args){
        try{
            Class<?> arrayListClass = Class.forName("java.util.ArrayList");
            // Set the constructor of ArrayList
            Constructor<?> constructor = arrayListClass.getConstructor();

            // Instance of ArrayList
            ArrayList<String> dynamicList = (ArrayList<String>) constructor.newInstance();

            // Add the Strings
            dynamicList.add("Hello");
            dynamicList.add("Sir..");
            System.out.println(dynamicList);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
