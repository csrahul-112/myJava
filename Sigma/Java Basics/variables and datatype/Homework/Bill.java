import java.util.*;

public class Bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost of Pencil:");
        float PencilCost = sc.nextFloat();
        System.out.println("Enter the cost of pen:");
        float PenCost = sc.nextFloat();
        System.out.println("Enter the cost of Eraser:");
        float EraserCost = sc.nextFloat();
        
        sc.close();

        float ItemTotal = (PencilCost + PenCost + EraserCost);
        float GrandTotal = ItemTotal + (ItemTotal * 0.18f);

        System.out.println("Your Total Bill including gst is:\n" + GrandTotal);

    }
}
