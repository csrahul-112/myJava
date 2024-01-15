public class TypePromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        short c =(short)(a + b + 100);
        int e = a + b;
        float d = b-a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
