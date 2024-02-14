public class SwapWithoutTemp {
    public static void main(String[] args){
        int a = 12;
        int b = 13;

        a = a^b;
        System.out.println(a);
        b = a^b;
        a = a^b;

        System.out.println("After Swaping");
        System.out.println(a + " " + b);
    }
}
