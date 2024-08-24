package HWLesson_10;

import java.util.Objects;

public class Human {

/*    Опишіть у класу Human такі поля:
• Ім'я (name)
• Прізвище (surname)
• Рік народження (year), число
• Рівень IQ (iq) (ціле число від 0 до 100)
• Домашній улюбленець (pet) (об'єкт типу Pet)
• Мама (mother) (об'єкт типу Human)
• Тато (father) (об'єкт типу Human)*/

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    private String surname;
    private int year;
    private int iq;
    private Human mother;
    private Human father;
    private Pet pet;

    /*Перевизначте методи equals() та hashCode() у всіх класах проєкту.
    Зробіть поля всіх класів приватними.
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }


    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String surname, int year, Human mother, Human father) {
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }


    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.family = family;
    }

    public Human() {
    }

/*    Опишіть у класу Human та реалізуйте такі методи:
• привітати свого улюбленця (greetPet)("Привіт, [ім'я тварини]")
• описати свого улюбленця (describePet): (вивести на екран всю інформацію про свого вихованця:
"У мене є [вид тварини], їй [вік тварини] років, він [дуже хитрий]/[майже не хитрий]". описи хитрості повинна залежати
від рівня хитрості вихованця, якщо понад 50 -[дуже хитрий], якщо менше або дорівнює 50 -[майже не хитрий])

    */

    public void greetPet() {
        if (pet != null) {
            System.out.println("Привіт, " + pet.getNickname());
        } else {
            System.out.println("У вас немає домашнього улюбленця.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.getTrickLevel() > 50 ? "дуже хитрий" : "майже не хитрий";
            System.out.println("У мене є " + pet.getSpecies() + ", їй " + pet.getAge() + " років, він " + slyness + ".");
        } else {
            System.out.println("У вас немає домашнього улюбленця.");

        }
    }

    /*Клас Human повинен виводити повідомлення наступного виду: Human{name='Michael', surname='Karleone',
    year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname=' Rock', age=5, trickLevel=75,
    habits=[eat, drink, sleep]}}
    */

    @Override
    public String toString() {
            return "Human {name= '" + name + "', surname= '" + surname + "', year= " + year +
                    ", iq= " + iq + ", mother= " + (mother != null ? mother.getName() : "null") +
                    ", father=" + (father != null ? father.getName() : "null") +
                    ", pet=" + (pet != null ? pet.toString() : "null") + "}";
        }
    }
