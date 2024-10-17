package sortingTechniques;

public class mergedSort {

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            // Recursively sort the first half
            mergeSort(arr, low, mid);
            // Recursively sort the second half
            mergeSort(arr, mid + 1, high);
            // Merge the two halves
            merge(arr, low, high, mid);
        }
    }

    public static void merge(int[] arr, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] b = new int[high - low + 1]; // Temporary array for merging

        // Merging the two sorted halves
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the first half
        while (i <= mid) {
            b[k++] = arr[i++];
        }

        // Copy the remaining elements from the second half
        while (j <= high) {
            b[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for (k = 0; k < b.length; k++) {
            arr[low + k] = b[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 60, 10, 70, 30, 40};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform merge sort
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*// Online Java Compiler
// Use this editor to write, compile and run your Java code online



    merge_sort(arr,low,high)
    {
        if(low == high)
            return element;
        else
            merge_sort(arr,low.mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }
    merge(arr,low,high,mid){
        i=low;
        j=mid+1;
        int[10] b;
        int k=0;
        while(i<=mid && j<=high){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
            b[k++] = a[i++];
        while(j<=mid)
            b[k++] = a[j++];

    }

*/