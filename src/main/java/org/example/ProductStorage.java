package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage {
    private static List<ProductDescription> productDescriptions = new ArrayList<>();

    static {

        productDescriptions.add(new ProductDescription("54150", "MALBEC DES COL ICON 75ml"));
        productDescriptions.add(new ProductDescription("73613", "COFFE DES COL DUO WOMAN 100ml"));
    }

    public static String getProductDescription(String code) {
        for (ProductDescription product : productDescriptions) {
            if (product.getCode().equals(code)) {
                return product.getDescription();
            }
        }
        return null;
    }
}

