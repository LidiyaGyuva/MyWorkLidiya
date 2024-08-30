package HomeWorkLesson11._Task3;

public class Father {
    private String name;
    private double money;

    public Father(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void BasketProduct (Product product1, int howMuch, Product product2, int howMuch2) throws Exception {
        double totalCost = (product1.getPrice() *howMuch) + (product2 != null ? product2.getPrice() * howMuch2 : 0);

        if (totalCost > money) {
            throw new Exception("Недостаточно денег у " + name + " для совершения покупки.");
        }

        if (product1 == Product.BEER || product1 == Product.TOBACCO || (product2 != null && (product2 == Product.BEER || product2 == Product.TOBACCO))) {
            throw new Exception(name + " не может приносить домой пиво или табак.");
        }

        if (howMuch % 3 != 0 || (product2 != null && howMuch2 % 3 != 0)) {
            throw new Exception("Количество купленных товаров должно делиться на три, чтобы " + name + " мог разделить их поровну.");
        }

        System.out.println(name + " успешно купил " + howMuch + " " + product1.name() + (product2 != null ? " и " + howMuch2 + " " + product2.name() : "") + ".");
    }

}
