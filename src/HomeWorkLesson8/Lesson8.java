package HomeWorkLesson8;

import java.util.Arrays;
import java.util.Random;

public class Lesson8 {

   /* 1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
    a также нечетные числа списком.
    */

    public static void arrayEvenAndOddNumber (int [] arrayNumber){
        System.out.println("Even number: ");
        for (int number : arrayNumber){
            if (number%2==0){
                System.out.print(number + " ");
            }
            }
        System.out.println();
        System.out.println("Odd number: ");
        for (int oddNumber : arrayNumber){
            if (oddNumber%2==1){
                System.out.print(oddNumber + " ");
            }

        }

    }

    public static void main(String[] args) {
        Random random = new Random();
        int [] arrayInt = new int [20];
        System.out.println("Arrays:");
        for (int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = random.nextInt(0,20);
        }


        System.out.println(Arrays.toString(arrayInt));

        arrayEvenAndOddNumber(arrayInt);

    }

}
