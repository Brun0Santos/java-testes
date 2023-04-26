package org.example.collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionMap {
    public static void main(String[] args) {
        List<ProductMap> list = new ArrayList<>();

        list.add(new ProductMap("Tv", 200.0));
        list.add(new ProductMap("Geladeira", 2100.0));
        list.add(new ProductMap("Mouse", 100.0));
        list.add(new ProductMap("Telhado de virdo", 180.0));
        list.add(new ProductMap("Livro sobre BDD", 1910.0));
        list.add(new ProductMap("Livro sobre ATDD", 11910.0));

        double sum = filterResultValue(list, p -> p.getName().charAt(0) == 'T');

        System.out.println(sum);

        list.sort((p1, p2) -> p1.getValue().compareTo(p2.getValue()));

        //list.removeIf(p -> p.getValue() > 500);
//        list.forEach(ProductMap::alterValue);
//        list.forEach(System.out::println);

        //list.stream().filter(product -> product.getValue() > 500).forEach(System.out::println);

        //List<String> names = list.stream().map(t -> t.getName().toUpperCase()).collect(Collectors.toList());
        //List<String> collect = list.stream().map(ProductMap::toUpperName).collect(Collectors.toList());
        //System.out.println(names);
//        System.out.println(collect);


    }

    public static double filterResultValue(List<ProductMap> productMaps, Predicate<ProductMap> p) {
        double valueFinal = 0;
        for (ProductMap x : productMaps) {
            if (p.test(x)) {
                valueFinal += x.getValue();
            }
        }
        return valueFinal;
    }
}
