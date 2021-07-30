package corejava;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
    public class CollectorsCheck {
        public static void main(String[] args) {
            Double price=Stream.of(new Product(1,"Dell",40000),new Product(2,"Aplle",60000)).collect(Collectors.summingDouble(x->x.price));
            System.out.println(price);
        }
}
