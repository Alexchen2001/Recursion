package exercises;

import modules.RModule;
import modules.IModule;

import static modules.IModule.binarySearch;
import static modules.IModule.contains;
import static modules.IModule.indexOf;


public class AlgoTestProgram {

    public static void testLinearSearch(){
        int[] list = {2, 3, 1, 5, 8, 6};
        System.out.println("----------- indexOf --------------");
        System.out.println("location of 3: " + indexOf(list, 3));
        System.out.println("location of 7: " + indexOf(list, 7));
        System.out.println("location of 8: " + indexOf(list, 8));
        System.out.println();
        System.out.println("location of 3: " + contains(list, 3));
        System.out.println("location of 7: " + contains(list, 7));
        System.out.println("location of 8: " + contains(list, 8));

    }

    public static void testBinarySearch(){
        int[] list = {1, 3, 5, 7, 8, 9};
        System.out.println("---------- binarySearch -------------");
        System.out.println("location of 2: " + binarySearch(list, 2));
        System.out.println("location of 5: " + binarySearch(list, 5));
        System.out.println("location of 9: " + binarySearch(list, 9));
        System.out.println();
    }

    public static void testRecursiveBinarySear(){
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        print(list);
        RModule.selectionSort(list);
        print(list);
        System.out.println("Location of 8 : " + RModule.binarySearch(list, 8));
    }

    public static void main(String[] args) {
       /* int[] list = {2, 9, 5, 4, 8, 1, 6};
        print(list);
        RModule.selectionSort(list);
        print(list); */



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
