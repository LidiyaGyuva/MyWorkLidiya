package HomeWorkLesson11._Task1;

public class Product {
    private String nameProduct;
    private double price;
    private boolean isItAlcohol;

    public Product(String nameProduct, double price, boolean isItAlcohol) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.isItAlcohol = isItAlcohol;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public boolean getIsItAlcohol (){
        return isItAlcohol;
    }

    public double getPrice() {
        return price;
    }
}
