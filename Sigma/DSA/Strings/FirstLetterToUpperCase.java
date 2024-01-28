public class FirstLetterToUpperCase {
    public static String firstLetterToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if((str.charAt(i) == ' ') && (i < (str.length()-1))){
                sb.append(str.charAt(i));
                i++;
            ch = Character.toUpperCase(str.charAt(i));
            sb.append(ch);
            }else{
            ch = str.charAt(i);
            sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        String str = "hello, are you okay?";

        System.out.println(firstLetterToUpperCase(str));
    }
}
