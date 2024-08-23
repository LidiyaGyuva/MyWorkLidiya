package HomeWorkLesson7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWLesson7Part2 {

    private static void printBoard(char[][] grid) {
        System.out.println("[0, 1, 2, 3, 4, 5]");
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + (i + 1) + ", ");
            for (int j = 0; j < 5; j++) {
                System.out.print(grid[i][j] + ", ");
            }
            System.out.println("]");
        }
    }


    public static void main(String[] args) {

     /*   2) Написати програму “стрільба по цілі”.
        Технічні вимоги:

• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число, і введена лінія
• знаходиться в межах ігрового поля (1-5). У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі. Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
                Приклад виведення в консоль:

[0, 1, 2, 3, 4, 5]
[1, -, *, -, -, -]
[2, -, -, -, -, -]
[3, -, *, -, -, -]
[4, -, -, *, -, -]
[5, -, *, -, -, *]*/


        //new grid
        char grid [][] = new char[5][5];
        for (int i = 0; i < 5; i++){
            for (int b = 0; b < 5; b++){
                grid[i][b] = '-';

            }
        }

        //random target
        Random rand = new Random();
        int target1 = rand.nextInt(5);
        int target2 = rand.nextInt(5);

        System.out.println("All Set. Get ready to rumble!");
//message
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("Введіть лінію для стрільби по осі Х (1-5): ");
            int rowX = scanner.nextInt() - 1;
            while (rowX < 0 || rowX >= 5) {
                System.out.print("Неправильний номер лінії. Введіть ще раз лінію для стрільби по осі Х (1-5): ");
                rowX = scanner.nextInt() - 1;
            }

            System.out.print("Введіть лінію для стрільби по осі Y (1-5): ");
            int rowY = scanner.nextInt() - 1;  // Віднімаємо 1, щоб перевести в індекс масиву (0-4)
            while (rowY < 0 || rowY >= 5) {
                System.out.print("Неправильний номер лінії. Введіть ще раз лінію для стрільби по осі Y (1-5): ");
                rowY = scanner.nextInt() - 1;
            }


            if (rowX == target1 && rowY == target2) {
                grid[rowX][rowY] = 'x';
                System.out.println("You have won!");
                printBoard(grid);
                break;
            } else {
                grid[rowX][rowY] = '*';
                System.out.println("Miss! Спробуйте ще раз.");
                printBoard(grid);
            }
        }

        scanner.close();


    }
}







