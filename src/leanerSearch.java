public class leanerSearch {
    public static void main(String[] args) {
        // array creation and print the array
        int[] arr = {10 ,20,40,59,20,56,74,33,24,45,5};
        int target = 2;
        boolean flag = false;

        /* to print array
        for(int i =0; i <= arr.length-1; i++){
            System.out.println(arr[i]);
        }
        */

        // leaner search

        for(int i =0; i <= arr.length-1; i++){
            if(target == arr[i]){
                System.out.println("value "+ arr[i] + " found at "  + i + "th position");
                flag = true;
            }
        }

        if(!flag){
            System.out.println("target not found!!");
        }

    }
}