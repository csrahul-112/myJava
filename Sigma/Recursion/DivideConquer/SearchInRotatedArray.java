public class SearchInRotatedArray {
    public static int searchInRotatedArray(int[] arr, int target, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + ((ei - si) / 2);
        if (arr[mid] == target) {
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if ((arr[si] <= target) && (target <= arr[mid])) {
                return searchInRotatedArray(arr, target, si, mid-1);
            }else{
                return searchInRotatedArray(arr, target, mid+1, ei);
            }
        }

        else{
            if((arr[mid] <= target) && (target <= arr[ei])){
                return searchInRotatedArray(arr, target, mid+1, ei);
            }else{
                return searchInRotatedArray(arr, target, si, mid-1);
            }
        }
        
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7,0, 1, 3};
        int target = 19;
        System.out.println(searchInRotatedArray(arr, target, 0, arr.length-1));
    }
}
