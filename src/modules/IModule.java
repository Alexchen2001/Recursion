package modules;

public class IModule {

    public static int binarySearch(int[] list, int target) {
        int min = 0;
        int max = list.length -1;
        int mid ;

        while(min <= max){
            mid = (min + max) /2;

            if (list[mid] == target){
                return mid;
            } else if (list[mid] < target){
                min = mid + 1;
            } else{
                max = mid -1;
            }
        }

        return -1;
    }

    public static  void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if(list[j] < list[j - 1]){
                    swap(list,j,j-1);
                }
                
            }
        }
    }

    public static boolean contains(int[] list, int target) {

        return indexOf(list,target) != -1;
    }

    public static int indexOf(int[] list, int target) {

        for (int i = 0; i < list.length; i++) {
            if(list[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void insertionSort(int[] list) {
        int current;
        int j;
        for(int i = 1; i < list.length; i++){
            current = list[i];
            for(j = i; j > 0 && current < list[j-1]; j--){
                list[j] = list[j -1];
            }
            list[j] = current;
        }

    }

    private static void merge(int[] list, int[] left, int[] right) {
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if (left[leftIndex] < right[rightIndex]){
                list[index++] = left[leftIndex++];
            }else{
                list[index++] = right[rightIndex++];
            }
        }
        while(leftIndex < left.length){
            list[index++] = left[leftIndex++];
        }
        while(rightIndex < right.length){
            list[index++] = right[rightIndex++];
        }
    }

    public static void mergeSort(int[] list) {
        if (list.length > 1){
            int[] left = splitFirstHalf(list);
            int[] right = splitSecondHalf(list);
            mergeSort(left);
            mergeSort(right);
            merge(list, left, right);
        }

    }

    private static int partition(int[] list, int low, int high) {
        int midpoint= (low + high) / 2;
        int pivot = list[midpoint];
        boolean done = false;

        while(!done){
            while(list[low] < pivot){
                ++low;
            }
            while (pivot < list[high]){
                --high;
            }
            if (low >= high){
                done = true;
            } else{
                swap(list, low, high);
                ++low;
                --high;
            }
        }
        return high;
    }

    public static void quickSort(int[] list) {

        quickSort(list, 0,list.length-1);
    }

    private static void quickSort(int[] list, int low, int high) {
        int mid;
        if (low >= high){
            return;
        }
        mid = partition(list, low, high);
        quickSort(list, low, mid);
        quickSort(list, mid+1, high);
    }

    public static void selectionSort(int[] list) {
        int minIndex;
        for (int i = 0; i < list.length - 1; i++) {
            minIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(list, i, minIndex);
            }
        }
    }

    private static int[] splitFirstHalf(int[] list) {
        int half = (list.length) /2;
        int[] halfList = new int[half];
        for (int i = 0; i < half; i++) {
            halfList[i] = list[i];

        }
        return halfList;
    }

    private static int[] splitSecondHalf(int[] list) {
        int half = (list.length) /2;
        int[] halfList = new int[list.length - half];
        for (int i = half; i < list.length; i++) {
            halfList[i - half] = list[i];

        }
        return halfList;
    }

    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

}
