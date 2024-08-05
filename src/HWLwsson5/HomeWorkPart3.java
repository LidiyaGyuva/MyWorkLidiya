package HWLwsson5;

import java.util.Scanner;

public class HomeWorkPart3 {


    /*4)
Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”.
Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения: “школу”, “магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.
Пользователь вводит три числа с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1: На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”
Пример2. после ввода 1,2,3: На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”*/

    public static void main(String[] args) {
        //создали массивы
        String[] namesArray = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] timesArray = {10, 12, 14, 16, 18, 20};
        String[] placeArray = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        // просим пользователя ввести число
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number(0-6):");
        int userIndex = scanner.nextInt();
        System.out.println("Insert number (0-5):");
        int userIndex2 = scanner.nextInt();
        System.out.println("Insert number (0-5):");
        int userIndex3 = scanner.nextInt();


        // тут должен быть алгоритм что номер пользователя соответствует индексу массива

        // Names
        for (int a = 0; a < namesArray.length; a++) {

            if (a == userIndex) {
                System.out.print(namesArray[a] + " будет идти в ");

            }
        }

        // place
        for (int b = 0; b < placeArray.length; b++) {

            if (b == userIndex2) {
                System.out.print(placeArray[b] + " в ");
            }
        }


        //time
        for (int i = 0; i < timesArray.length; i++) {
            if (i == userIndex3) {
                //userNumbers = timesArray[i];
                System.out.println(timesArray[i] + ":00.");
            }
        }





    }



}








