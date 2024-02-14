public class internString {
    public static void main(String args[]){
        String str1 = new String("Anna").intern();
        String str2 = new String("Anna").intern();

        System.out.println(str1 == str2);
    }
}
