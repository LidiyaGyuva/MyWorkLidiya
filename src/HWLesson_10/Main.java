package HWLesson_10;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("cat","Barsik", 5, 55, new String[]{"eat", "sleep", "play"});
        Pet cat2 = new Pet("cat female", "Murka", 2, 75, new String[]{"jump", "catch", "eat bird"});

        Human linda = new Human("Linda", "Surname", 1999);
        Human alex = new Human("Alex", "Surname", 1990);
        Human bob = new Human("Kakadu", 2022,linda, alex);


        Human child1 = new Human("Masha", "Surname",2023);
        Human child2 = new Human("Agata","Surname", 2024);


        System.out.println("==============");
        System.out.println(linda.toString());
        System.out.println(alex.toString());
        System.out.println(cat.toString());
        System.out.println( cat2.toString());
        System.out.println(bob.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println("==============");



        Family family = new Family(linda, alex);
        Human childPets = new Human("Vanda","Avakanda",2018,120, linda, alex, cat,family);
        System.out.println(childPets.toString());

        family.addChild(child1);
        family.addChild(child2);
        family.addChild(childPets);

        System.out.println();
        System.out.println(family);
        System.out.println(childPets.toString());
        childPets.greetPet();
        childPets.describePet();
        System.out.println("==============================");
        System.out.println();

        // Виклик методів у дитини
       child1.greetPet();
        child1.describePet();
        System.out.println("Кількість осіб у сім'ї: " + family.countFamily());
        // Видалення дитини
        family.deleteChild(0);
        family.deleteChild(1);
        System.out.println(family);

        // Кількість членів сім'ї
        System.out.println("Кількість осіб у сім'ї: " + family.countFamily());




    }
}
