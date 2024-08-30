package HomeWorkLesson11._Task1;

public class Shop implements OperationPrice{
    private Shop shop;
    private String nameShop;
    private Buyer buyer;
    private Seller seller;
    private Product product;



    public Shop(String nameShop, Buyer buyer, Seller seller, Product product) {
        this.nameShop = nameShop;
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getNameShop() {
        return nameShop;
    }

    @Override
    public void operationClass() {
        double finalPrice = product.getPrice();
        if (product.getIsItAlcohol() && seller.isHonest() && buyer.getAge() < 21) {
            System.out.println("Уважаемый " + buyer.getNameBuyer() + ", продавец " + seller.getNameSeller() + " нашего магазина “" + getNameShop() + "”, не продаст вам этот товар " + product.getNameProduct() + ", так как в нем содержится алкогольная продукция, а ваш возраст " + buyer.getAge() + ".");
            return;

        }
        if (buyer.hasDiscountCard()){
            finalPrice =finalPrice * 0.9;
        }
        System.out.println("Уважаемый " + buyer.getNameBuyer() + ", продавец " + seller.getNameSeller() + " нашего магазина “" + getNameShop() + "”, продаст вам этот товар " + product.getNameProduct() + ". Ваш возраст " + buyer.getAge() + ". Стоимость вашей покупки составляет " + finalPrice + " грн.");
    };

    public void returnCost(){
        operationClass();
    }
    }





