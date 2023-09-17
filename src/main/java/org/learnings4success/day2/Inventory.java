package org.learnings4success.day2;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> productDatabase = new ArrayList<>();

    public void addNewProduct(Product product) {
        productDatabase.add(product);
    }

    public void updateExistingProduct(Product updatedProduct) {
        // get element from db
        // set new values to the element // second delete old product
        // write into table

        var tempProduct = getProductById(updatedProduct.getId());
        deleteProduct(tempProduct.getId());
        addNewProduct(updatedProduct);
    }

    public boolean deleteProduct(int productId) {
        Product tempProduct = null;
        for (Product p : productDatabase) {
            if(p.getId() == productId) {
                tempProduct = p;
            }
        }
        return productDatabase.remove(tempProduct);
    }

    public Product getProductById(int productId) {
        for (Product p : productDatabase) {
            if(p.getId() == productId) {
                return p;
            }
        }
        return null;
    }
}


