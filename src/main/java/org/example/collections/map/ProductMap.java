package org.example.collections.map;

import java.util.Objects;

public class ProductMap {
    private String name;
    private Double value;

    public ProductMap(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductMap that = (ProductMap) o;
        return Objects.equals(name, that.name) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "ProductMap{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public static boolean printArray(ProductMap products) {
        return products.getValue() > 500;
    }

    public boolean nonPrintArray() {
        return this.value > 500;
    }

    public void alterValue() {
        this.value = this.getValue() * 1.1;
    }

    public static String toUpperName(ProductMap product) {
        return product.getName().toUpperCase();
    }
}
