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
    }

    private static void merge(int[] list, int[] left, int[] right) {
    }

    public static void mergeSort(int[] list) {
    }

    private static int partition(int[] list, int low, int high) {
        return 0;
    }

    public static void quickSort(int[] list) {
    }

    private static void quickSort(int[] list, int low, int high) {
    }

    public static void selectionSort(int[] list) {
    }

    private static int[] splitFirstHalf(int[] list) {
        return null;
    }

    private static int[] splitSecondHalf(int[] list) {
        return null;
    }

    public static void swap(int[] list, int a, int b) {
    }

}
