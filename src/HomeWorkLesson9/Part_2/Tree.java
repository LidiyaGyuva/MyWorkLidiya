package HomeWorkLesson9.Part_2;

public class Tree {

   /* Создать класс Tree с перегруженными конструкторами.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    В классе есть Tree есть поля:
    String type; int height, int coutOfsticks, String colour;*/


    String type;
    int height;
    int coutOfsticks;
    String colour;



   /* Конструктор1 принимающий в параметры String type; int height
    и присваивающий значение полям coutOfsticks значение 13,
    colour "Зеленый".*/

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зеленый";
    }

  /*  Конструктор2 принимающий в параметры int height, int coutOfsticks,
    String colour и присваивающий значение полю type "пихта".
    */

public Tree( int height, int coutOfsticks, String colour){
        this.coutOfsticks = coutOfsticks;
        this.height = height;
        this.colour = colour;
        this.type = "Піхта";
}

   /* Констуктор по умолчанию 3, который присваивает height = 350, coutOfsticks = 29,
    сolour = "Желтый".*/
public Tree (){
    this.height = 350;
    this.coutOfsticks = 29;
    this.colour = "Жовтий";
}

   /* Конструктор4 который принимает в параметры String type,
    и вызывает внутри себя конструктор 3.*/

public Tree (String type){
        this();
        this.type = type;
}

    public void getInfo() {
        System.out.println("Тип: " + type + ", Висота: " + height + " см, Кількість гілок: " + coutOfsticks + ", Колір: " + colour);
    }

}



