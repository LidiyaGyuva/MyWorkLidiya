package HomeWorkLesson11._Task1;

public class Buyer {
    private String nameBuyer;
    private int age;
    private boolean hasDiscountCard;

    public Buyer(String nameBuyer, int age, boolean hasDiscountCard) {
        this.nameBuyer = nameBuyer;
        this.age = age;
        this.hasDiscountCard = hasDiscountCard;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public int getAge() {
        return age;
    }

    public boolean hasDiscountCard() {
        return hasDiscountCard;
    }
}

class Seller {
    private String nameSeller;
    private boolean isHonest;

    public Seller(String nameSeller, boolean isHonest) {
        this.nameSeller = nameSeller;
        this.isHonest = isHonest;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public boolean isHonest() {
        return isHonest;
    }
}
