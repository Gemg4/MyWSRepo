package program6;

import java.util.ArrayList;
import java.util.List;

public class ManageProducts {
    List<Product> products;
    List<Product> expensiveProducts;
    public ManageProducts(){
        this.products = new ArrayList<>();
    }
    public void addProduct(String name, double price){
        this.products.add(new Product(name, price));
    }

    public void getProductGreaterThan(double price){
        this.expensiveProducts = this.products.stream().filter(product -> product.price >= price).toList();
        IO.println("Products greater than price: "+ price);
        for(Product product: this.expensiveProducts) {
            IO.println("Name: " + product.name + "\nPrice: " + product.price + "\n");
        }
    }

    public void getTotalExpensiveProduct() {
        if(this.expensiveProducts == null || this.expensiveProducts.isEmpty()) {
            IO.println("Use getProductGreaterThan first to get total expensive products");
            return;
        }
         IO.println("Total expensive product: " + this.expensiveProducts.stream().count());
    }
}
