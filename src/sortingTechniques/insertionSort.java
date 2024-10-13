package sortingTechniques;

public class insertionSort {

    public static void main(String[] args) {
        //define array
        int arr[] = {10 , 5 , 4 , 1 , 3 , 8};
        //count the array length
        int n = arr.length;

        for(int i = 1; i<n; i++){
            // pull a first element of an unsorted array
            int temp = arr[i];

            //pull a first element of a sorted array
            int j = i-1;

            // j>=0 means compare to the 0th index of the sorted array
            /* arr[j] > temp means the pulled element of
            *  an unsorted array is less than a pulled element of a sorted array
            * */
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for (int element:arr){
            System.out.println(element);
        }


    }
}
