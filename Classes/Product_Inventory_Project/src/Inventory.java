import java.util.ArrayList;
import java.util.List;

class Inventory extends Product {
    private List<Product> newInventory;

    Inventory() {
        this.newInventory = new ArrayList<>();
    }

    void append(Product newProduct) {
        for(Product product : this.newInventory) {
            if(product.getId() == newProduct.getId()){
                product.setQuantity(product.getQuantity() + newProduct.getQuantity());
                return;
            }
        }
        this.newInventory.add(newProduct);
    }

    void changePrice(int _id, float _newPrice) throws Exception {
        try {
            priceCheck(_newPrice);
            for (Product product : this.newInventory) {
                if (product.getId() == _id) {
                    product.setPrice(_newPrice);
                    return;
                }
            }
            System.out.println("Id is not found in inventory");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    float inventoryValue() {
        float sum = 0;
        for(Product product : this.newInventory){
            sum += (product.getQuantity() * product.getPrice());
        }
        if(sum == 0){
            System.out.println("Inventory is empty");
            return 0;
        } else {
            System.out.println("Inventory value: " + sum);
            return sum;
        }
    }
}
