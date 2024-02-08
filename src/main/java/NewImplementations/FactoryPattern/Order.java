package NewImplementations.FactoryPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is the Order class.
 * This class is responsible for creation of orders, contains a boolean(is the order still going or ur done)and list of products(what u got in there)
 */
public class Order {
    private List<Product> products;
    private boolean isFinalized;

    public Order() {
        this.products = new ArrayList<>();
        this.isFinalized = false;
    }

    //addProduct to the order
    public void addProduct(Product product) {
        if (!isFinalized) {
            products.add(product);
        } else {
            System.out.println("no can do");
        }
    }

    //finalizing order
    public void finalizeOrder() {
        if (!products.isEmpty() && !isFinalized) {
            isFinalized = true;
            System.out.println("order is finalized with:");
            for (Product product : products) {
                System.out.println(product.getName() + " at $" + product.getPrice());
            }
        } else {
            System.out.println("failed.");
        }
    }

    public String toString(){
        return products.toString();
    }

    public boolean isFinalizedtoString(){
        return isFinalized;
    }
}

