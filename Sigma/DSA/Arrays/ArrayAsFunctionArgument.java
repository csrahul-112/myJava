public class ArrayAsFunctionArgument {

    public static void updateArray(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97, 98, 99};

        //Printing element of the array by using loops
        for(int i = 0; i < marks.length; i++){
            System.out.println("marks at index " + i + " is : " + marks[i]);
        }
        System.out.println();

        //calling update function to update the values int the array
        updateArray(marks);

        //marks after updating it by function because arrays arguments are passed by reference
        for(int i = 0; i < marks.length; i++){
            System.out.println("marks at index " + i + " is : " + marks[i]);
        }
        System.out.println();
    }
}
