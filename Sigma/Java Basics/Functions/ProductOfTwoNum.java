import java.util.Scanner;

public class ProductOfTwoNum {
    public static void productOfNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number : ");
        int a = sc.nextInt();
        System.out.println("Enter your Second number : ");
        int b = sc.nextInt();
        
        sc.close();

        int Product = a * b;

        System.out.println("The Product of Two Given Number is : " + Product);

        return;
    }

    public static int productOfNumbers(int a, int b){
        int product = a * b;
       
        return product;
    }

    public static float productOfNumbers(float a, float b){
        return  a * b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number : ");
        int a = sc.nextInt();
        System.out.println("Enter your Second number : ");
        int b = sc.nextInt();

        sc.close();


        int product = productOfNumbers(a, b);
        System.out.println("The product of two number submitted earlier : " + product);



        System.out.println(productOfNumbers(2.9f, 3.2f));


        

        
    }
}
