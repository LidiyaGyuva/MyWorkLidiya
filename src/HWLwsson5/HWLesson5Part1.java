package HWLwsson5;

import java.util.Scanner;

public class HWLesson5Part1 {
    public static void main(String[] args) {

        /*1)
Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их в одно
предложение до тех пор, пока пользователь не введет с клавитуры слово STOP. Все слова введенные до этого должны
отобразится в консоли одним предложением.*/


Scanner myScanner = new Scanner(System.in);
        System.out.println("Insert world: ");
        String value = myScanner.nextLine();
        String result = String.valueOf(0);
        while (!value.equalsIgnoreCase("STOP")){
            result = (result.replaceFirst(String.valueOf(0), "")) +  " " + value + " ";
            System.out.println("Insert world: ");
            value = myScanner.nextLine();
        }
        System.out.println(result.trim());




/*2)
Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет,
является она полиндромом или нет. И выводит данную информацию на экран.*/

       Scanner scanner2 = new Scanner(System.in);
        System.out.println("Insert number:");
String numberUsers = scanner2.nextLine();
String revertNumbers = "";
for (int i = numberUsers.length() -1; i >=0; i--){
    revertNumbers = revertNumbers + numberUsers.charAt(i);
}

        System.out.println(numberUsers);
        System.out.println(revertNumbers);

        if(numberUsers.equals(revertNumbers)){
            System.out.println("Polindrom");
        } else {
            System.out.println("Not Polindrom");
        }




        /*3)
Написать проограмму, условно для склада приема металла. Представим, что склад может хранить определенный вес металла.
Пользователь вводит с клавиатуры вес, который может хранится на складе. Дальше пользователь вводит с клавиатуры вес,
который условно собирается сдать на склад пользователь. Программа должна после каждой сдачи металла показывать сколько
веса еще может принять склад. Если пользователь хочет сдать металла больше чем осталось места на складе, то программа не дает
ему это сделать и уведомляет пользователя, о невозможности данной операции. Если пользователь сдает металл весом меньше чем 5,
программа тоже предупреждает о невозможности приемки такого малого веса. Программа завершается, когда место на складе закончилось.*/

Scanner metalScanner = new Scanner(System.in);
double countOfMetal = 0;
while (countOfMetal<=1000){
    if (countOfMetal==1000) {
        break;
    }

    System.out.println("Сколько металла вы хотите хранить: ");
    double tempOfMetal = metalScanner.nextInt();

    if (tempOfMetal + countOfMetal > 1000){
        System.out.println("Недостаточно места на складе");
        System.out.println("Вы можете еще отдать на сохранение " + (1000 - countOfMetal));

        continue;
    } else if (tempOfMetal<5) {
        System.out.println("Принимаем от 5 кг.");

        break;

    }

    countOfMetal = countOfMetal + tempOfMetal;
    System.out.println("Вы можете еще отдать на сохранение " + (1000 - countOfMetal));

    }

        System.out.println("Final.");

}

    }

