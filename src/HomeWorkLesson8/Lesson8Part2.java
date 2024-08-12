package HomeWorkLesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson8Part2 {
    /*2) Написать перегруженный метод, который может:

Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа: "Ваше сообщение - "%%%%%%%%",
ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
    */

public void overloadMet (){
    System.out.println("Я пустой.");
}

public void overloadMet (String someWords){
    System.out.println(someWords);
}

public void overloadMet (String [] arrayString){
    for (String arrayWords : arrayString){
        System.out.print(arrayWords + " ");
    }

}

public void overloadMet (int [] myArray) {
    System.out.println("Sum for arrays: ");
    int sum = 0;
    for (int x = 0; x < myArray.length; x++) {
        sum = sum + myArray[x];
    }
    System.out.println(sum);
}

public void overloadMet (String yourString, int yourInt){
    System.out.println("Ваше сообщение - " + yourString);
    System.out.println("Ваше число - " + yourInt);
}

    public static void main(String[] args) {
        Lesson8Part2 overMet = new Lesson8Part2();
        overMet.overloadMet();
        overMet.overloadMet("It is my some text.");
        overMet.overloadMet("Hello world.", 2024);
        overMet.overloadMet(new int[]{3, 5, 7, 12});
        overMet.overloadMet(new String[]{"Hello", "It", "is", "Arrays", "Strings"});




    }


}
