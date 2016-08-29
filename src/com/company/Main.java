/**
 *Created by Raman Kryvasheyeu
 *Homework #2 on GB_Java_1 29.08.2016
 */
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Task #1
        Создать массив, состоящий из элементов 0 и 1
         */
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0};
        printArray(arr, "Initial");
        /*
        Task #2
        В массиве из Task #1 с помощью цикла заменить 0 на 1, 1 на 0;
         */
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 0){
               arr[i] = 1;
           } else {
               arr[i] = 0;
           }
        }
        printArray(arr, "Reversed");
        /*
        Task #3
        Создать массив из 8 целых чисел.
        С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
         */
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++){
            int a = 1+i*3;
            arr2[i] = a;
        }
        printArray(arr2, "Task #3");
        /*
        Task #4
        Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
         */
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < mas.length; i++){
            if(mas[i] < 6){
                mas[i] *= 2;
            }
        }
        printArray(mas, "Task #4");
        /*
        Task #5
        Задать одномерный массив и найти в нем минимальный и максимальный элементы;
         */
        int[] arrT5 = new int[9];
        for (int i = 0; i < arrT5.length; i++) {
            arrT5[i] = ((int)(Math.random() * 100));
        }
        printArray(arrT5, "Task #5");
        System.out.println("MinValue = "+getMinValue(arrT5)
                            +"  MaxValue = "+getMaxValue(arrT5));
        /*
    Task #6
    Написать простой консольный калькулятор.
    Пользователь вводит два числа и операцию, которую хочет выполнить,
    программа вычисляет результат и выводит в консоль;
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Your number X2 = "+a);

    }




    public static void printArray(int[] array, String order){
        String arrInitial = Arrays.toString(array);
        System.out.println(order+" array "+arrInitial);
    }

    public static int getMinValue(int[] array){
        int min = 100;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int getMaxValue(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

}
