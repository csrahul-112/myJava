public class UppercaseToLowercase {
    public static char upperCase(char ch){
        return (char)(ch | ' ');
    }
    public static StringBuilder uppercaseToLowercase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            sb.append(upperCase(str.charAt(i)));
        }
        return sb;
    }
    public static void main(String args[]){
        System.out.println(uppercaseToLowercase("ABCD"));
    }
}
