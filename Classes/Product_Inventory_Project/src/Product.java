import java.lang.Exception;

public class Product extends MyExceptions {
    private float price;
    private int quantity;
    private int id;
    private static int amountProducts = 0;

    Product() {
        super();
    }

    float getPrice() {
        return price;
    }

    void setPrice(float price) {
        this.price = price;
    }

    int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product(float price, int quantity) throws Exception {
        try {
            priceCheck(price);
            quantityCheck(quantity);

            amountProducts++;
            this.price = price;
            this.quantity = quantity;
            this.id = amountProducts;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}