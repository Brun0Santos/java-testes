package org.example.streams.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputFilesStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.00));
        products.add(new Product("HD Case", 80.90));
        products.add(new Product("Computer", 850.00));
        products.add(new Product("Monitor", 290.00));

        Double result = calculateAverage(products);

        products.sort((x, y) -> x.getValue().compareTo(y.getValue()));

        List<Product> productStream = products.stream().filter(p -> p.getValue() < result).collect(Collectors.toList());

        productStream.sort((x, y) -> x.getName().compareTo(y.getName()));

        productStream.forEach(System.out::println);

    }

    public static Double calculateAverage(List<Product> products) {
        Double result = 0.0;
        for (Product x : products) {
            result += x.getValue();
        }
        return result / products.size();
    }

}
