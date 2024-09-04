public class binarySearch {
    public static void main(String[] args) {
        // array creation and print the array

        // array must be sorted in binary search technique
        int[] arr = {5,10,20,24,33,40,45,56,59,74};
        int right = arr.length;
        int left = 0;
        int target = 56;
        boolean flag = false;

        while (left<=right){
            int mid = (right + left) / 2;
            if(target == arr[mid]){
                System.out.println("data found at " + mid);
                flag = true;
                return; // must required return/break statement else loop will execute infinite number of time
            }else if(target < arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(!flag){
            System.out.println("target not found");
        }
    }
}
