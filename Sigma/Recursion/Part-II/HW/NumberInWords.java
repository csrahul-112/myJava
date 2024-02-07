public class NumberInWords {
    static String[] digits = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void numberInWords(int n){
        if(n == 0){
            return;
        }

        int lastDigit = n % 10;
        numberInWords(n/10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args){
        int n = 12304;
        numberInWords(n);
    }
}
