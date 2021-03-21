package exercises;

import modules.RModule;
import modules.IModule;

import static modules.IModule.binarySearch;
import static modules.IModule.bubbleSort;
import static modules.IModule.contains;
import static modules.IModule.indexOf;
import static modules.IModule.insertionSort;
import static modules.IModule.mergeSort;
import static modules.IModule.quickSort;
import static modules.IModule.selectionSort;


public class AlgoTestProgram {

    public static void testLinearSearch(){
        int[] list = {2, 3, 1, 5, 8, 6};
        System.out.println("----------- indexOf --------------");
        System.out.println("location of 3: " + indexOf(list, 3));
        System.out.println("location of 7: " + indexOf(list, 7));
        System.out.println("location of 8: " + indexOf(list, 8));
        System.out.println();
        System.out.println("-------------- contains -------------");
        System.out.println("location of 3: " + contains(list, 3));
        System.out.println("location of 7: " + contains(list, 7));
        System.out.println("location of 8: " + contains(list, 8));
        System.out.println("-----------------------------------------");

    }

    public static void testBinarySearch(){
        int[] list = {1, 3, 5, 7, 8, 9};
        System.out.println("---------------- binarySearch ------------------");
        System.out.println("location of 2: " + binarySearch(list, 2));
        System.out.println("location of 5: " + binarySearch(list, 5));
        System.out.println("location of 9: " + binarySearch(list, 9));
        System.out.println();
        System.out.println("-----------------------------------------------");
    }

    public static void testBubbleSort(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Bubble sort");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        bubbleSort(list);
        print(list);
        System.out.println();
    }

    public static void testSelectionSort(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Selection sort");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        selectionSort(list);
        print(list);
        System.out.println();
    }

    public static void testInsertionSort(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Insertion sort");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        insertionSort(list);
        print(list);
        System.out.println();
    }

    public static void testMergeSort(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Merge sort");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        mergeSort(list);
        print(list);
        System.out.println();
    }

    public static void testQuickSort(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Quick sort");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        quickSort(list);
        print(list);
        System.out.println();
    }


    public static void testRecursiveBinarySear(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println(" Recursive Binary Search");
        System.out.println("---------------------------");
        print(list);
        System.out.println("List after sorting");
        System.out.println("------------------------");
        RModule.selectionSort(list);
        print(list);
        System.out.println("Location of 8 : " + RModule.binarySearch(list, 8));
        System.out.println();
    }



    public static void main(String[] args) {
        testBinarySearch();
        testRecursiveBinarySear();
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
        testMergeSort();




    }

    public static void print(int[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

        //use a for-each loop to print out list
        for(int item : list) {
            System.out.print(" " + item + " ");
        }
        System.out.println();
        System.out.println();
    }
}
