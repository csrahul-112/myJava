public class BinaryStringProblem {
    public static void binaryStringProblem(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        binaryStringProblem(n-1, 0, str+"0");
        if(lastPlace == 0){
            binaryStringProblem(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        binaryStringProblem(3, 0, new String(""));

    }
}
