package HomeWorkLesson9.Part_4;

import java.util.Scanner;

public class Calculator {
/*    Создать класс калькулятор. В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.
    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.
    Калькулятор должен принимать только следующие типы действий:
    2+4;    - пример синтаксиса сложения;
    5-6;    - пример синтаксиса вычитания;
    25*3;   - пример синтаксиса умножения;
    34/3;   - пример синтаксиса деления;
    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.
    В случае ввода другого синтаксисана консоль возвращается сообщение: "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.
    Программа закрывается после ввода команды Stop. Перед закрытием на консоль должно выводится сообщение:
            "Калькулятор закрыт".*/

    public void sum(double x, double y) {
        double result = x + y;
        System.out.println("Sum result: " + result);
    }

    public void minus(double x, double y) {
        double result = x - y;
        System.out.println("Result minus: " + result);
    }

    public void multiply(double x, double y) {
        double result = x * y;
        System.out.println("Multiply result: " + result);
    }

    public void division(double x, double y) {
        if (y != 0) {
            double result = x / y;
            System.out.println("Division result: " + result);
        } else {
            System.out.println("Ошибка: Деление на ноль.");
        }
    }


    //find index operator

    int findIndexOperator (String scanInput){       //этот метод мы написали чтобы потом присвоить значение
        for (int i = 0; i < scanInput.length(); i++){
            char scanChar = scanInput.charAt(i);
            if (scanChar=='+' || scanChar=='-' || scanChar == '/' || scanChar == '*'){
                return i;
            }
        }
        return -1;   //или то что ниже допустимого индекса, а индексация у нас с 0
    }


//create start method

    public void start() {   // метод ничего не принимает и ничего не возращает он только запускает сканер калькулятор
        Scanner scann = new Scanner(System.in);
        System.out.println("Калькулятор запущен. Введите действие:");

        while (true){
            String word = scann.nextLine();
            if (word.equalsIgnoreCase("stop")){
                System.out.println("Калькулятор закрыт.");
                break;
            }
           word = word.replace(" ", "");  // убираем все пробелы, а вдруг

            int operatorIndex = findIndexOperator(word);
             if (operatorIndex ==-1){
                 System.out.println("Введите корректное действие.");
             } else {
                 char operator = word.charAt(operatorIndex);
                 double a = Double.parseDouble(word.substring(0, operatorIndex));
                 double b = Double.parseDouble(word.substring(operatorIndex + 1));

                 switch (operator) {
                     case '+':
                         sum(a, b);
                         break;
                     case '-':
                         minus(a, b);
                         break;
                     case '*':
                         multiply(a, b);
                         break;
                     case '/':
                         division(a, b);
                         break;
                     default:
                         System.out.println("Введите корректное действие.");
                         break;
            }

             }

            System.out.println("Введите выражение:");

        }

    }
    }








