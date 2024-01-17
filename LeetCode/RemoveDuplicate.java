public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while(j < n){
            if(nums[i] != nums[j])
                nums[++i] = nums[j];
            j++;
        }
        return ++i;
    }
    public static void main(String[] args){
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);
        System.out.print("{");
        for(int i = 0; i < k; i++){
            System.out.print(" " + nums[i] + ",");
        }
        System.out.println("}");
    }
}
