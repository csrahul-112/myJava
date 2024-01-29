public class StringCompression {

    //with larger time complexity
    public static String stringCompression(String str){
        String str1 = "";

        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while((i < (str.length()-1)) && (str.charAt(i) == str.charAt(i+1))){
                count++;
                i++;
            }
            str1 += str.charAt(i);
            if(count > 1){
                str1 += count.toString();
            }
        }
        return str1;
    }

    //With smaller time complexity
    public static String stringCompressionOptimal(String str){
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < (str.length()-1) && (str.charAt(i) == str.charAt(i+1))){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args){
        String str = "aaaaabbccdd";

        //System.out.println(stringCompression(str));
        System.out.println(stringCompressionOptimal(str));
    }
}
