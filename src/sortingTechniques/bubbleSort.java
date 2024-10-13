package sortingTechniques;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {10,20,40,59,20,56,74,33,24,45,5};
        boolean flag = false;

        // outer loop for the iteration through the array
        for(int i =0; i <arr.length -1 ; i++){

            //inner loop is for the compare the adjective element
            for (int j=0; j < arr.length-1 - i; j++){

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }

        }


        for (int l =0; l<=arr.length-1; l++) {
            System.out.println(arr[l]);
        }


    }
}
