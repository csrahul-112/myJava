public class BinarySearch {
    public static int binarySearch1(int[] arr, int key){
        int si = 0;
        int ei = arr.length-1;

        
        while(si <= ei){
            int mid = si + ((ei-si)/2);
            if(key == arr[mid]){
                return mid;
            }else if(key > arr[mid]){
                si = mid+1;
            }else if (key < arr[mid]){
                ei = mid-1;
            }
            
        }

        return -1;
    }
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        int mid = ((end + start) / 2);

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] < key) {
                start = mid + 1;
                mid = ((start + end) / 2); 
            }else if(arr[mid] > key){
                end = mid -1;
                mid = ((start + end) / 2);
            }else{
                return -1;
            }
        }
       
        return -1;
    }

    public static int binarySearchShradha(int arr[], int key){
            int start = 0;
            int end = arr.length - 1;


            while (start <= end) {
                int mid = ((start + end) / 2);
                if (arr[mid] == key) {
                    return mid;
                }else if (arr[mid] < key) {
                    start = mid + 1; 
                }else if(arr[mid] > key){
                    end = mid -1;
                }else{
                    return -1;
                }
            }

            return -1;
    }

    public static void main(String args[]){
        int marks[] = {12, 14, 16, 17, 18, 28, 40};
        int key = 40;
        int key1 = 16;
        int key2 = 17;
        int key3 = 18;

        // System.out.println(binarySearch(marks, key));
        // System.out.println(binarySearch(marks, key1));
        // System.out.println(binarySearch(marks, key2));
        // System.out.println(binarySearch(marks, key3));
        System.out.println(binarySearchShradha(marks, key3));
        System.out.println(binarySearch1(marks, key3));

    }
}
