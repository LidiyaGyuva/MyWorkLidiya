package HomeworkLesson2;

public class Lesson2 {
    public static void main(String[] args) {

        /*
    ЗАДАЧА: mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
    volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
    opel = mercedes%volvo;
    Необходимо вычислить значения mersedes, volvo и opel.
       */

        int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;
        System.out.println(mercedes); //3
        System.out.println(volvo); //28
        System.out.println(opel); //3

        /*

    ЗАДАЧА2: int x = 3;
    int y = ++x*2;
    x+=-y*3 + ++x + --y;
    y+=(-x++)%3;
    int z = x + y;
   Необходимо вычислить значения x, y и z.
        */

        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;

        System.out.println(x); //-7
        System.out.println(y); //9
        System.out.println(z); //2

        /*
    ЗАДАЧА 3:boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
   boolean b = !a||a&&!a;
   boolean c = false&&!true||!((23%3+14)%3==7);
   Необходимо вычислить значения a, b и c.
*/

        boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
        boolean b = !a||a&&!a;
        boolean c = false&&!true||!((23%3+14)%3==7);

        System.out.println(a); //false
        System.out.println(b); //true
        System.out.println(c); //true


        /*
    ЗАДАЧА 4:Coздать две переменные типа int:
   int a = 7;
   int b = 9;
   Поменять между собой значения переменных a и b.
   Создавать новые переменные нельзя.
   Можно применять только арифметические действия к перемнным a и b.
   Вывести в консоль значения переменных a и b после их переопределения.
*/

        int aa = 7;
        int bb = 9;
        aa = bb-aa; //2
        bb = bb-aa; //7
        aa = aa+bb; //9

        System.out.println(aa); //9
        System.out.println(bb); //7




    }
}
