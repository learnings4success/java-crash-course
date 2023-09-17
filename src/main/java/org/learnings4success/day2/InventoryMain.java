package org.learnings4success.day2;

import java.util.UUID;

public class InventoryMain {

    static Inventory inventory = new Inventory();
    public static void main(String[] args) {

        var product = new Product(1, "Pen", 5, 50, UUID.randomUUID());

        System.out.println("Before Add : " + inventory.getProductById(1));
        inventory.addNewProduct(product);
        System.out.println("After Add: " + inventory.getProductById(1));
//        inventory.deleteProduct(1);
        System.out.println(" Get element Before update : " + inventory.getProductById(1));

        product.setPrice(10);
        product.setQuantity(40);
        inventory.updateExistingProduct(product);

        System.out.println(" Get element After update : " + inventory.getProductById(1));
    }
}
