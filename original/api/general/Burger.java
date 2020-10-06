package original.api.general;

import java.util.List;

import static java.lang.Math.round;

public class Burger implements Product {

    String name;
    List<Product> items;

    public Burger(String name, List<Product> items) {
        this.name = name;
        this.items = items;
    }



    @Override
    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double Calories() {
        return items.stream().map(Foodproduct::Calories).reduce(0.0, Double::sum);
    }




    @Override
    public double Calories_per_100g() {
        return round((Calories()*100)/weight());
    }


    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(DELIM);
        buffer.append(String.format("Calories:         %.2f\n", Calories()));
        buffer.append(String.format("Calories/100g:         %.2f\n", Calories_per_100g()));
        buffer.append(DELIM);


        return buffer.toString();
    }
}
