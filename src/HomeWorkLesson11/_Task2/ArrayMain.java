package HomeWorkLesson11._Task2;

import java.util.Random;
import java.util.Scanner;

class ArithmeticException extends Exception{
    public ArithmeticException(String message){
        super(message);
    }
}

class ArrayIndexOutOfBoundsException extends Exception{
    public ArrayIndexOutOfBoundsException(String message){
        super(message);
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}

class InvalidIndexException extends Exception{
    public InvalidIndexException(String message){
        super(message);
    }
}

 public class ArrayMain {
     public double processArray() throws DivisionByZeroException, InvalidIndexException {
         Random random = new Random();
         Scanner scanner = new Scanner(System.in);

         // Создаем массив случайного размера от 1 до 30
         int size = random.nextInt(30) + 1;
         int[] array = new int[size];

         // Заполняем массив случайными значениями от 0 до 30
         for (int i = 0; i < size; i++) {
             array[i] = random.nextInt(31);
         }

         // Вывод массива на консоль для проверки
         System.out.println("Сгенерированный массив: ");
         for (int value : array) {
             System.out.print(value + " ");
         }
         System.out.println();

         // Запрашиваем у пользователя индекс
         System.out.print("Введите индекс элемента массива: ");
         int index = scanner.nextInt();

         // Проверка корректности индекса
         if (index < 0 || index >= array.length) {
             throw new InvalidIndexException("Некорректный индекс: " + index);
         }

         // Проверка деления на ноль
         if (array[0] == 0) {
             throw new DivisionByZeroException("Деление на ноль! Первый элемент массива равен 0.");
         }

         // Возвращаем результат деления
         return (double) array[index] / array[0];
     }
     }





