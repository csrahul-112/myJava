class OnePlus {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int m = digits.length;
        int count = 0;
        boolean flag = false;

        for(int i = 0; i < digits.length; i++){
            if(digits[i] != 9){
                break;
            }
            else{
                    count++;
                }
            }
            System.out.println(count);
            
        if(count == digits.length){
            n = n + 1;
            flag = true;
        }
    
        System.out.println(flag);
    while(m>0){

        if (flag == false && digits[n - 1] == 9 && digits[n - 2] != 9) {
            digits[n - 1] = 0;
            digits[n - 2] += 1;

        }else if(flag = true){
            int arr[] = new int[n];
            arr[0] = 1;
            for(int i = n-1; i > 0; i-- ){
                arr[i] = 0;
            }
            return arr;
            
        }else{
            digits[n - 1] = digits[n-1] + 1;
            n--;
        }
        m--;

    }
    for(int i = 0; i < digits.length; i++){
        System.out.print(digits[i] + " ");
    }

    return digits;
}
public static void main(String args[]){
    int[] digits = {1, 2, 3};

    plusOne(digits);

    for(int i = 0; i < digits.length; i++){
        System.out.print(digits[i] + " ");
    }
}

}