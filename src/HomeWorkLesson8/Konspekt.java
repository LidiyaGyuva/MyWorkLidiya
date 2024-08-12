package HomeWorkLesson8;

public class Konspekt {

     /* 3)Создать класс Конспект. Класс должен содержать следующие поля:
ФИО студента;
Название предмета;
Количество страниц;
Год выпуска;
Цвет обложки.
Название заведения, где учится студент;*/


public String fullNameStudent;
public String nameLesson;
public int countOfPage;
public int yearOfIssue;
public String colorCover;
public String nameOfStudy;


public void getInfo(){
    System.out.println("Конспект\n" +"ФИО студента: " + fullNameStudent + "\nНазвание предмета: " + nameLesson+"\nКоличество страниц: "+ countOfPage+
            "\nГод выпуска: " + yearOfIssue+"\nЦвет обложки: "+ colorCover+ "\nНазвание заведения: " + nameOfStudy);
}


    public static void main(String[] args) {
        Konspekt konspekt = new Konspekt();
        konspekt.fullNameStudent = "Тукаленко Л.В.";
        konspekt.nameLesson = "Java for QA";
        konspekt.countOfPage = 68;
        konspekt.yearOfIssue = 2024;
        konspekt.colorCover = "Red";
        konspekt.nameOfStudy = "DAN IT";

        konspekt.getInfo();
    }


}
