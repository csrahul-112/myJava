public class FindSubstringSB {
    public static void findSubsetsSB(String str, StringBuilder ans, int i){
        //BaseCase
        if(i >= str.length()){
            System.out.println(ans);
            return ;
        }

        //Recursion
        //yes by element
        findSubsetsSB(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt((ans.length()-1));
        //no by element
        findSubsetsSB(str, ans, i+1);
        
    }
    public static void main(String args[]){
        String str = "abc";
        StringBuilder ans = new StringBuilder("");

        findSubsetsSB(str, ans, 0);
    }
}
