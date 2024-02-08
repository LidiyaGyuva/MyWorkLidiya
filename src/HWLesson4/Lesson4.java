package HWLesson4;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Lesson4 {

    /*1) У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.

Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить перемнным типа String
 следующие значения: string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
 Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String string1 = myScanner.next();
        String string2 = myScanner.next();
        String string3 = myScanner.next();
        String string4 = myScanner.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4 + "\s" + myScanner.next() + " " + myScanner.next());
        System.out.println("=====================");
        System.out.println("=====================");


        /*2)
Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон
построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).
*/

        Scanner superScanner = new Scanner(System.in);
        System.out.println("Введите число для первой стороны треугольника: ");
        int number1 = superScanner.nextInt();
        System.out.println("Введите число для второй стороны треугольника: ");
        int number2 = superScanner.nextInt();
        System.out.println("Введите число для третьей стороны треугольника: ");
        int number3 = superScanner.nextInt();
        int result1 = number1 + number2;

        System.out.println("Возможно ли построить треугольник? - " + (result1 > number3));


/*3)
При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры, и всегда отнимать от
большего меньшее. Вывести эту разность в консоль.*/

        System.out.println("=====================");
        System.out.println("=====================");

        Scanner ternarScanner = new Scanner(System.in);
        System.out.println("Insert one number:");
        int scannerNumber = ternarScanner.nextInt();
        System.out.println("Insert two number:");
        int scannerNumber2 = ternarScanner.nextInt();
        int positive1 = scannerNumber - scannerNumber2;
        int positive2 = scannerNumber2 - scannerNumber;
        int resultZero = 0;
        int resultOne = scannerNumber > scannerNumber2 ? positive1 : scannerNumber2 > scannerNumber ? positive2 : resultZero;

        System.out.println(resultOne);

        /*4)
(Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа: Если число равно 1, то выводин на консоль
“Понедельник”; Если число равно 2, то выводин на консоль “Вторник”; Если число равно 3, то выводин на консоль “Среда”;
Если число равно 4, то выводин на консоль “Четверг”; Если число равно 5, то выводин на консоль “Пятница”; Если число равно 6,
то выводин на консоль “Суббота”; Если число равно 7, то выводин на консоль “Воскресенье”; В противном случае выводим текст:
“Лучше бы сегодня была пятница”.*/


Scanner ifElseScanner = new Scanner(System.in);
        System.out.println("Insert your number:");
        int myNumbers = ifElseScanner.nextInt();

if (myNumbers == 1) {
    System.out.println("Понедельник");
}

    if (myNumbers == 2) {
        System.out.println("Вторник");
    }

    if (myNumbers == 3) {
        System.out.println("Среда");
    }

    if (myNumbers == 4) {
        System.out.println("Четверг");
    }

    if (myNumbers == 5) {
        System.out.println("Пятница");
}

    if (myNumbers == 6) {
        System.out.println("Суббота");
    }

    if (myNumbers == 7) {
        System.out.println("Воскресенье");
    }

else if (myNumbers<=0) {
        System.out.println("Лучше бы сегодня была пятница.");
    } else if (myNumbers>7) {
        System.out.println("Лучше бы сегодня была пятница.");
    }


    }
}



