public class BreakTest {
    public static void main(String args[]){
        for (int i = 0; i < 5; i++){
            System.out.println("before entering nested for : " + i);
            for(int j = i+1; j < 5; j++){
                System.out.println(i + " inside nested for ");
                break;
            }
            System.out.println("after break statement : "+i);
        }
    }
}
