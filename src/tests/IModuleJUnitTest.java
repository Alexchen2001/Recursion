package tests;

import modules.IModule;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static modules.IModule.binarySearch;
import static modules.IModule.bubbleSort;
import static modules.IModule.insertionSort;
import static modules.IModule.mergeSort;
import static modules.IModule.quickSort;
import static modules.IModule.selectionSort;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IModuleJUnitTest {

    static int[] makeList() {
        Random random = new Random();
        int 	bound  = 1000;				//upper bound of values
        int[] 	list   = new int[bound / 2];
        int 	num;

        for(int i = 0; i < list.length; i++) {
            num = random.nextInt(bound);
            if (!(IModule.contains(list, num))) {
                list[i] = num;
            }else {
                i--;
            }
        }
        return list;
    }

    @Test
    void testBinarySearch() {

        int[] list = makeList();
        IModule.quickSort(list);			//list must be sorted

        System.out.println();
        System.out.println(" \t Binary Search \t ");
        int  lValue		= list.length / 4;
        int  hValue 	= 3 * list.length / 4;
        int  low  		= list[lValue];
        int  high  		= list[hValue];
        int  location 	= IModule.binarySearch(list, low);


        assertEquals(lValue, location);
        assertEquals(low , list[location]);
        System.out.println("---------------------------------");
        System.out.println("low value location : " + lValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("low value          : " + low);
        System.out.println("bSearch value      : " + list[location]);


        location 	= IModule.binarySearch(list, high);
        assertEquals(hValue, location);
        assertEquals(high , list[location]);
        System.out.println("---------------------------------");
        System.out.println("high value location: " + hValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("high value         : " + high);
        System.out.println("bSearch value      : " + list[location]);

        System.out.println("---------------------------------");

    }

    @Test
    void testBubbleSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t  Bubble Sort \t  ");
        System.out.println("------------------------------------------");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        IModule.bubbleSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }

    @Test
    void testInsertionSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t  Insertion Sort \t ");
        System.out.println("------------------------------------------");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        IModule.insertionSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }

    @Test
    void testMergeSort() {

        int[] list = makeList();

        System.err.println();
        System.out.println(" \t \t  Merge Sort \t  ");
        System.out.println("------------------------------------------");
        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        IModule.mergeSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }

    @Test
    void testQuickSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t Quick Sort \t ");
        System.out.println("------------------------------------------");

        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        IModule.quickSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }

    @Test
    void testSelectionSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t Selection Sort \t ");
        System.out.println("------------------------------------------");

        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        IModule.selectionSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
}
