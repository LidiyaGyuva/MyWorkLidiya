package HomeWorkLesson11._Task2;

public class Main {
    public static void main(String[] args) {
        ArrayMain arrayMain = new ArrayMain();
        try{
            double result = arrayMain.processArray();
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e){
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InvalidIndexException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
