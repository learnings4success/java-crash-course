package org.learnings4success.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class InventoryTest {

    @Test
    public void productInsertionAndGetByIdTest() {
        var inventory = new Inventory();
        var product = new Product(1, "Mobile", 30000, 3, UUID.randomUUID());

        var result1 = inventory.getProductById(1);

        Assertions.assertNull(result1);

        inventory.addNewProduct(product);

        Assertions.assertNull(result1);

        var result2 = inventory.getProductById(1);

        Assertions.assertEquals(product, result2);
    }
}
