package sortingTechniques;

public class quickSort {

    public static void main(String[] args) {

        // unsorted array
        int[] arr = {10 , 5 , 4 , 1 , 3 , 8};

        //lower bounty
        int lb = 0;
        //upper bounty
        int ub = arr.length - 1;

        quickSortFun(arr,lb,ub);

        for(int e: arr){
            System.out.println(e + " ");
        }
    }

    static void quickSortFun(int[] arr, int lb, int ub){
        if(lb<ub){
            int pivotIndex = partition(arr,lb,ub);
            quickSortFun(arr,lb,pivotIndex-1);
            quickSortFun(arr,pivotIndex+1,ub);
        }
    }

    static int partition(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while(start<end){
            while(start <= ub && arr[start] <= pivot){
                start++;
            }

            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp1 = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp1;

        return end;
    }
}