package HWLesson_10;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
      /* Опишіть у класі Pet такі поля:
 • вид тварини (species), рядок (собака, кіт тощо)
 • кличка (nickname)
 • вік (age)
 • Рівень хитрості (trickLevel) (ціле число від 0 до 100)
• звички (habits) (масив рядків)
 • Опишіть у класі Pet та реалізуйте такі методи:
 • поїсти (eat) (метод виводить на екран повідомлення Я ї'м!)
 • відгукнутися (respond) (метод виводить на екран повідомлення Привіт, хазяїн. Я - [ім'я тварини]. Я скучив!)
• зробити домашню гидоту (foul) (метод виводить на екран повідомлення Потрібно добре замести сліди...)*/


    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    /*
 У класі Pet створіть конструктори:
конструктор, що описує вид тварини та її прізвисько
конструктор, що описує всі поля тварини
Порожній конструктор*/

    // Конструктори
    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Методи
    public void eat() {
        System.out.println("Я їм!");
    }

    public void respond() {
        System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
    }

    public void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }

    // Гетери та сетери
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    /*Клас Pet повинен виводити повідомлення наступного виду: dog{nickname='Rock', age=5, trickLevel=75,
   habits=[eat, drink, sleep]}, де dog - вид тварини;*/
    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age +
                ", trickLevel=" + trickLevel + ", habits=" + String.join(", ", habits) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return species.equals(pet.species) && nickname.equals(pet.nickname);
    }

    @Override
    public int hashCode() {
        return species.hashCode() + nickname.hashCode();
    }

}
