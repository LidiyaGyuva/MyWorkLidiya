package HomeWorkLesson11._Task3;

public enum Product {
    APPLE("Apple", 20), POTATOES("Potatoes", 15), MILK("Milk", 40),
    BEER("Beer", 50), TOBACCO("Tobacco", 100);

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



        }

