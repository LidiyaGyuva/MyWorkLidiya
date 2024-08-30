package HomeWorkLesson11._Task3;



public class Main{
    public static void main(String[] args)  {
        Father father = new Father("Anton", 500);
        try {

            //коректные данные
            father.BasketProduct(Product.APPLE, 3, Product.MILK, 3);
            //запрещенные продукты
            //father.BasketProduct(Product.TOBACCO, 1, Product.BEER, 1);
            //мало продуктов
            //father.BasketProduct(Product.MILK,1, Product.POTATOES, 1);
            //без одного продукта
            father.BasketProduct(Product.POTATOES, 6, null, 0);
            //не хватило денег
            father.BasketProduct(Product.POTATOES, 100, Product.APPLE,1000);
        }
        catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Спасибо, что пришли к нам. Хорошего дня!");
        }

    }
}
