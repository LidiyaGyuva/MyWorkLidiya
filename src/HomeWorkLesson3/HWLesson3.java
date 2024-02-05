package HomeWorkLesson3;

import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class HWLesson3 {

     /*
    Создать переменную string1 = "This line that i want to cut, cause it is too long".
Создать строку string2 в которой должно быть помещено значение строки string1,
Обрезанное до "This line that i want to cut, cause".
Создать строку string3 на основе string2 которое будет содержать значение
"This line that don't want to cut, cause it is perfect".
Вывести на консоль каждое сообщение и его длину.*/

    public static void main(String[] args) {

        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1 + " " + string1.length());
        String string2 = string1.substring(0, string1.length() - 15);
        System.out.println(string2 + " " + string2.length());

        String string3 = string2.replace("i want to cut, cause", "don't want to cut, cause it is perfect");
        System.out.println(string3 + " " + string3.length());


        System.out.println("=============");
        System.out.println("=============");

        /*Создать строку string = "Testing, is my favourite job".
Вывести на экран отдельно каждое слово и длину этого слова в след виде:
Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
и т.д.
Вывести на консоль true, если первое слово длиннее остальных, в
противном случае вывести false.*/

        String string = "Testing, is my favourite job";

        System.out.println("word1 = " + string.split(" ")[0].replace(",", "") + " = " + string.split(" ")[0].length() + " = " + string.length());//"Testing";
        System.out.println("word2 = " + string.split(" ")[1] + " = " + string.split(" ")[1].length()); //is
        System.out.println("word3 = " + string.split(" ")[2] + " = " + string.split(" ")[2].length()); //my
        System.out.println("word4 = " + string.split(" ")[3] + " = " + string.split(" ")[3].length()); //favourite
        System.out.println("word5 = " + string.split(" ")[4] + " = " + string.split(" ")[4].length()); //job

        System.out.println(string.split(" ")[0].length() > string.split(" ")[1].length());
        System.out.println(string.split(" ")[0].length() > string.split(" ")[2].length());
        System.out.println(string.split(" ")[0].length() > string.split(" ")[3].length());
        System.out.println(string.split(" ")[0].length() > string.split(" ")[4].length());






        /*При применении к массиву строк поля length, можно узнать сколько
элементов находится в массиве.
Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
то при вызове поля length:
int size = arrayOfString.length;
можно получить какое количество символов находится в данном массиве.

Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
символ 'a' встречается в  строке:
        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."

Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.*/


        String myString5 = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs" +
                " there. And we can use the split method and the length method.";
        String[] stringArrays = myString5.split("a");
        System.out.println(stringArrays.length);


    }
}
