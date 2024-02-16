public class ContiguousSubString {

    public static int contiguousSubString(String str,int i,int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }

        int res = contiguousSubString(str, i+1, j, n-1)+
                 contiguousSubString(str, i, j-1, n-1)-
                 contiguousSubString(str, i+1, j, n-2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
        
        
    }

    public static void main(String args[]){
        String str = "aba";
        int n = str.length();
        System.out.println(contiguousSubString(str, 0, n-1, n));
    }
}
