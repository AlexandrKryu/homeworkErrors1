package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/**
 * Создаем 4 разных массива, один из них будет null.
 */
        int[] arr1 = new Random().ints(10, 20, 30).toArray();
        int[] arr2 = new Random().ints(10, 1, 10).toArray();
        int[] arr4 = null;
        int[] arr5 = new int[5];
/**
Пример 1 когда нас все устраивает и делаем с ними нужные нам действия.
 */
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        compareArrays(arr1, arr2);
        System.out.println("****** ******\n");
/**
 Пример 2 где один из аргументов null.
 */
        compareArrays(arr1, arr4);
        System.out.println("****** ******\n");
/**
 Пример 3 где разные длины массивов..
 */
        compareArrays(arr1,arr5);
    }

    static void compareArrays(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            System.out.println("Один из аргументов null");
        }
        else if (a1.length == a2.length) {
            int[] a3;
            a3 = new int[a1.length];
            for (int i = 0; i < a1.length; i++) {
                a3[i] = a1[i] - a2[i];
            }
            System.out.println(Arrays.toString(a3));

        } else System.out.println("Неравные длины");
    }

}
