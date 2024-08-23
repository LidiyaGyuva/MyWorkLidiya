package HomeWorkLesson9.Part1;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", 20000,5,40);
        Computer otherComputer = new Computer("Lenovo", 35000, 5,40);
        Computer hpComputer = new Computer("HP", 20000, 5, 40);
        System.out.println(computer.equals(hpComputer));
        System.out.println("========");
        System.out.println(computer.equals(otherComputer));
    }
}
