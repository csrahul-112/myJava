import java.util.ArrayList;

public class ArrayLIstIntro {
    public static void main(String args[]){
        //ArrayList<Datatype> nameOfArrayList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<String> list02 = new ArrayList<>();



        //---------------------------Operations------------------------------//

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(8);

        System.out.println(list);

        list.set(3, 10);
        System.out.println(list);
        // list.set(11,1);
        // System.out.println(list); error outOfBound

        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(4));

        list.add(1, 3);
        System.out.println(list);
        // list.add(5,14);          error : adding at index outOfBound; Index 5, size 4 ; {{{   we can add at index 4   }}}
        // System.out.println(list); 

        System.out.println(list.size()); //can be used for iterating through ArrayList
        

        
    }
}
