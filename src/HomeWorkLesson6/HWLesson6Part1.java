package HomeWorkLesson6;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWLesson6Part1 {
    /*Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.

Технічні вимоги:
За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100] та пропонує гравцеві через консоль ввести своє ім’я,
яке зберігається в змінній name.
Перед початком на екран виводиться текст: Let the game begin!
Сам процес гри обробляється у нескінченному циклі.
Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач.
Якщо введене число менше загаданого, програма виводить на екран текст:
Your number is too small. Please, try again..
Якщо введене число більше за загадане, то програма виводить на екран текст:
Your number is too big. Please, try again..
Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!
Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).*/

    public static void main(String[] args) {

//просимо ввести своє ім'я
        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //створили масив і заповнили його рандомним числом
        int[] masInt = new int[1];
        Random random = new Random();
        for (int i = 0; i < masInt.length; i++) {
            masInt[i] = random.nextInt(0, 10); //написала 10, чтобы была быстрее проверка.
            int winNum = masInt[i];

        //починаємо гру
        System.out.println("Let the game begin!");

while (true){
    System.out.println("Insert your number:");
    int userNumber = scanner.nextInt();
    if (userNumber < 0 || userNumber > 100) {
        System.out.println("Please enter a number between 0 and 100.");
        continue;
    } if (userNumber == winNum) {
            System.out.println("Congratulations, " + name + "! You guessed the number.");
            break; // Гравець вгадав число, виходимо з циклу
        } else if (userNumber < winNum) {
            System.out.println("Your guess is too low. Try again.");
        } else {
            System.out.println("Your guess is too high. Try again.");
        }
    }

    scanner.close();
}

        System.out.println("True number:");
        System.out.println(Arrays.toString(masInt)); // вивести в консоль рандомне число

}
}













