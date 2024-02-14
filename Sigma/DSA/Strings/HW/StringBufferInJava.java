public class StringBufferInJava {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();// capacity 16
        System.out.println(sb.capacity());
        StringBuffer strb1 = new StringBuffer("Hello ");// capacity 22 -> 16 + 6 
        System.out.println(strb1.capacity());
        strb1.append("1234567890");
        strb1.append(" ");
        strb1.append("World");//till here 22 as it's not exceeding 22 which was it's capacity at creation

        System.out.println(strb1.capacity());//22 as 6 of ("Hello ") + 16 existing

        // strb1.append("1"); // the moment 1 more is added it's capacity will increase as existing * 2 + 2 -> (22*2 + 2) = 46
        // System.out.println(strb1.capacity());

        strb1.append("1234567890123456789012345");
        // strb1.append("1");
        System.out.println(strb1.capacity());//this is 47 till here;
        strb1.append(1);
        System.out.println(strb1.capacity());

        sb.append("1234567890123456789012345678901234");
        System.out.println(sb.capacity());
        sb.append("12345678901234567890123456789012345678");
        System.out.println(sb.capacity());

        /*
         * So whenever a SB's length is equal to capacity on next append we can add any no of chars in at even exceeding the next will only increase the capacity by no. of char added
         */


        

        String msg = strb1.toString();

        System.out.println(strb1);
        System.out.println(msg);
    }
}
