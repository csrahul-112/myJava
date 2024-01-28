public class StringsEquality {
    public static void main(String[]args){
        String s1 = "Ton";
        String s2 = "Ton";
        String s3 = new String("Ton");

        if(s1 == s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1 == s3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(s1.equals(s3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
