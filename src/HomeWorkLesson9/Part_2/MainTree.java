package HomeWorkLesson9.Part_2;

public class MainTree {
    /*Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.*/
    public static void main(String[] args) {
        Tree oneTree = new Tree();
        oneTree.getInfo();

        Tree twoTree = new Tree("Ялинка", 200);
        twoTree.getInfo();

        Tree threeTree = new Tree(300,50,"Зелений");
        threeTree.getInfo();

        Tree fourTree = new Tree("Дуб", 150);
        fourTree.getInfo();




    }


}
