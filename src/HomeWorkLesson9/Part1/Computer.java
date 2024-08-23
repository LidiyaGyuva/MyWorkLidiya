package HomeWorkLesson9.Part1;

import java.util.Objects;

public class Computer {

    /*Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int. Все поля класса Computer должны быть приватными.*/
    private String marka;
    private int price;
    private int memoryRAM;
    private int videoCard;

    public Computer(String marka, int price, int memory, int videoCard) {
        this.marka = marka;
        this.price = price;
        this.memoryRAM = memory;
        this.videoCard = videoCard;
    }


   /* Переопределить метод toString для вывода объекта класса в след. виде:
            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты.
    ОЗУ = Объем оперативной памяти."
*/

    @Override
    public String toString() {
        return "Создан PC." +
                "Имя ='" + marka + '\'' +
                ", Цена =" + price +
                ", ОЗУ=" + memoryRAM +
                ", Видеокарта =" + videoCard +
                '.';
    }

    /*Также создайте публичные методы для получения информации о полях класса Computer.
    А также методы для изменения его полей.
    */

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemory(int memoryRAM) {
        memoryRAM = memoryRAM;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    /*Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.
    равны значения полей марка, оперативная память и видеокарта.
    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return memoryRAM == computer.memoryRAM && videoCard == computer.videoCard && Objects.equals(marka, computer.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, price, memoryRAM, videoCard);
    }


}
