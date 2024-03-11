import java.util.*;

public class ArrayLIstImplementation {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //WhenEver we create an arraylist a array of some size is created in the memory but as soon as it gets full a new array of larger size(Depend on version of java maybe double 1.5 etc) is created in the memory and out current array is copied into it and now that array is our arraylist.

        list.add(1);
        System.out.println(list);
    }
}
