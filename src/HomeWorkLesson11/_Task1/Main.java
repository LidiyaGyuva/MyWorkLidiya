package HomeWorkLesson11._Task1;

public class Main {
    public static void main(String[] args) {


        Buyer buyer1 = new Buyer("Avak", 30, true);
        Buyer buyer2 = new Buyer("Max", 16, false);
        Seller seller1 = new Seller("Carl", true);
       Seller seller2 = new Seller("Rick", false);
        Product product1 = new Product("Vodka", 120, true);
        Product product2 = new Product("Halva", 50, false);


Shop shop = new Shop("Babak", buyer1,seller1,product1);
shop.returnCost();
        System.out.println();
Shop shop2 = new Shop("New Products", buyer2,seller2,product2);
shop2.returnCost();
        System.out.println();
Shop shop3 = new Shop("Aveny", buyer2,seller1,product1);
shop3.returnCost();
        System.out.println();
Shop shop4 = new Shop("BooShop", buyer2,seller2,product1);
shop4.returnCost();






    }

}
