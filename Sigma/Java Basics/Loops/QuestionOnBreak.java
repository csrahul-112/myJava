import java.util.*;

public class QuestionOnBreak {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a no:");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }else{
                System.out.println(num);
            }
        }

        sc.close();
    }
}
