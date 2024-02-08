package HWLesson4;

import java.util.Scanner;


public class Lesson4Part2 {
    public static void main(String[] args) {
        /*5)
Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и
символ – или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1:");
        double number1 = scanner.nextDouble();
        System.out.println("Insert number2:");
        double number2 = scanner.nextDouble();
        System.out.println("Insert char:");
        String symbol = scanner.next();
        double resultTernar = symbol.equals("–") ? number1 - number2 : symbol.equals("+") ? number1 + number2 : symbol.equals("%") ? number1 % number2 : symbol.equals("/") ? number1 / number2 : symbol.equals("*") ? number1 * number2 : 0;
        System.out.println(resultTernar);











/*6)
Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует выводит сообщение в консоль,
о том что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том что
такой ОС не существует.*/

        Scanner superScanner = new Scanner(System.in);
        System.out.println("Which program are you interested in?");
        String program = superScanner.nextLine();

        switch (program.toLowerCase()) {
            case ("intellij idea"):
                System.out.println("Select your OC:");
                String result = superScanner.nextLine();
                switch (result.toLowerCase()) {
                    case ("linux"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=linux");
                        break;
                    case ("macos"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                        break;
                }
                break;
        }
            switch (program.toLowerCase()) {
                case ("git"):
                    System.out.println("Select your OC:");
                    String resultGit = superScanner.nextLine();
                    switch (resultGit.toLowerCase()) {
                        case ("linux"):
                            System.out.println("https://git-scm.com/download/linux");
                            break;
                        case ("macos"):
                            System.out.println("https://git-scm.com/download/mac");
                            break;
                        case ("windows"):
                            System.out.println("https://git-scm.com/download/win");
                            break;
                    }
                    break;
            }

        switch (program.toLowerCase()) {
            case ("java"):
                System.out.println("Select your OC:");
                String resultJava = superScanner.nextLine();
                switch (resultJava.toLowerCase()) {
                    case ("linux"):
                        System.out.println("https://www.java.com/ru/download/");
                        break;
                    case ("macos"):
                        System.out.println("https://www.java.com/ru/download/");
                        break;
                    case ("windows"):
                        System.out.println("https://www.java.com/ru/download/");
                        break;
                }
                break;
            default:
                System.out.println("Sorry, trie again(((");

        }

        }
    }


