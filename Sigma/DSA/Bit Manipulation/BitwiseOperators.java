public class BitwiseOperators {
    public static void main(String[] args){

        //Bitwise Operators
        System.out.println(2 & 3);
        System.out.println(2 | 3);
        System.out.println(2 ^ 3);

        //Binary 1's complement
        System.out.println(~5);
            //Explanation : in this when we take complement of 5 the MSB which was 0 makes it 1 and the comlement turns out to be a huge number so we take its 1's comp again and then add 1 to it and return the negative val.
    }
}
