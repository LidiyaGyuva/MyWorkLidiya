package HWLwsson5;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkPart2 {
    public static void main(String[] args) {
         /*5)
Есть одномерный массив из 10 элементов, заполнен- ный случайными числами. Пользователь вводит с клавиатуры число.
Программа показывает есть ли такое число в созданном до этого массиве.*/


        int[] arrayInt = new int[10];
        Random random = new Random();
        for (int i = 0; i<arrayInt.length; i++){
            arrayInt [i] = random.nextInt(0,20);
        }
        System.out.println("Insert numder, please:");
        Scanner scanner = new Scanner(System.in);
        int numberUser = scanner.nextInt();
        System.out.println("All array:");
        for (int i = 0; i<arrayInt.length; i++) {

            System.out.print(arrayInt[i] + " ");


        }

        for (int arrayElement:arrayInt){
            if (arrayElement == numberUser){

                System.out.print("\nВаш номер есть в массиве:" + " " + arrayElement);
            }

        }


    /*6)
Заполнить массив на 45 элементов случайными числами от -50 до +50. Найти минимальный элемент и вывести его на консоль.
Найти максимальный элемент и вывести его на консоль.*/

       /* Random randomNumber = new Random();
        int [] arrayRandom = new int[45];
        System.out.println("Весь массив:");
        for (int i = 0; i < arrayRandom.length; i++){
            arrayRandom [i] = randomNumber.nextInt(-50,50);
            System.out.print(arrayRandom[i] + " ");
        }
        int min = arrayRandom[0];
        for (int i = 0; i < arrayRandom.length; i++){
            if (min > arrayRandom[i]){
                min = arrayRandom[i];
            }
        }
        System.out.println();
        System.out.println("Minimum = " + min);


        int max = arrayRandom[0];
        for (int maxnumber : arrayRandom){
            if (max < maxnumber){
                max = maxnumber;
            }

        }
        System.out.println();
        System.out.println("Maximum = " + max);/*



        */

    }
    }
