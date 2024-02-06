public class RemoveDuplicatesInString {
    public static void removeDuplicatesInString(String str, boolean[] map,StringBuilder newStr, int idx){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //Getting the new String
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicatesInString(str, map, newStr, idx+1);
        }else{
            map[currChar-'a'] = true;
            newStr.append(currChar);
            removeDuplicatesInString(str, map, newStr, idx+1);
        }
        
    }
    public static void main(String[] args){
        String str = "appnnacollege";
        boolean[] map = new boolean[26];

        removeDuplicatesInString(str, map, new StringBuilder(""), 0);
    }
}
