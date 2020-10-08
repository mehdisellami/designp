package original.api.general;

public class Tomato implements Foodproduct {

    private double weight;
    private double BASE_PRICE = 0.5;
    private double cal = 15;

    public Tomato(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public double Calories() {
        return (cal*weight)/100;
    }


    public double Calories_per_100g() {
        return (Calories()*100)/weight;
    }



    @Override
    public String toString() {
        return String.format("tomato, qty: %.0f -- %.2f", weight(), price(),Calories(),Calories_per_100g());
    }
}
