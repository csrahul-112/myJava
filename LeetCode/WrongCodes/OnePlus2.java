public class OnePlus2 {
    
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int m = digits.length;
        int count = 0;int countFW = 0;int countFW1 = 0;
        boolean flag = false;

        for(int i = 0; i < digits.length; i++){
            System.out.print(digits[i] + " ");
        }  

        for(int i = 0; i < digits.length; i++){
            if(digits[i] != 9){
                break;
            }
            else{
                    count++;
                }
            }
            
        if(count == digits.length){
            n = n + 1;
            flag = true;
        }
    
        System.out.println("consolelog");
    while(m > 0 && flag == false && digits[n - 1] == 9 && digits[n - 2] != 9){
            digits[n - 1] = 0;
            digits[n - 2] += 1;

        countFW++;
        m--;
    }
    System.out.println("Console log");
    while(m > 0 && countFW == 0 && flag == false){
            int i = m-1;
            while(i > 0 && digits[i] == 9){
                digits[i] = 0;
                i--;
            }
                digits[i] += 1;
            countFW1++;
            m--;
    }
        while(flag == true){
            int arr[] = new int[m];
            arr[0] = 1;
            for(int i = m-1; i > 0; i-- ){
                arr[i] = 0;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }  
            return arr;  
        }

        if(countFW == 0 && countFW1 == 0){
            digits[m-1] = digits[m-1] + 1;
        }
    
    for(int i = 0; i < digits.length; i++){
        System.out.print(digits[i] + " ");
    }  

    return digits;
}

    public static void main(String args[]){
        int[] digits = {1, 2, 3};
        plusOne(digits);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }        
    }
    
    
}
