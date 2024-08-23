package HomeWorkLesson7;

import java.util.Random;
import java.util.Scanner;

public class HWLesson7Part1 {
    public static void main(String[] args) {
       /* 1) Пользователь задает размерность двумерного массива с клавиатуры.
                Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.*/

//просим ввести размерность массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Arrays:");
        int userNum = scanner.nextInt();

        // просим ввести количество элементов в массиве
        System.out.println("Enter number for elements:");
        int userElement = scanner.nextInt();

        //создаем массив, у которого размерность и количество элементов зависит от юзера
        int [][] arrayInt = new int [userNum][userElement];
        Random random = new Random();

//заполняем двумерный массив рандомными числами
        for (int i = 0; i < arrayInt.length; i++){
            for (int b = 0; b < arrayInt[i].length; b++){
                arrayInt [i] [b]= random.nextInt(0, 1000);

            }

        }
       // System.out.println("Наш двумерный массив:");
       // System.out.println(Arrays.deepToString(arrayInt));
        System.out.println("");



        //считаем макс значения в массивах

        for (int w = 0; w < arrayInt.length; w++) {
            for (int j = 0; j < arrayInt[0].length; j++) {
                System.out.print(arrayInt[w][j] + " ");
            }
            System.out.println();
        }

        System.out.println("New Array:");
        for (int w = 0; w < arrayInt.length; w++) {

            int max = arrayInt[w][0];
            for (int j = 0; j < arrayInt[0].length; j++) {

                if (max < arrayInt[w][j]) {
                    max = arrayInt[w][j];

                }
            }
//создаем одномерный массив с макс значениями
            int newArray [] = {max};
            for (int r = 0; r < newArray.length; r++){
                System.out.print(newArray[r] + " ");
            }


        }














    }
}
