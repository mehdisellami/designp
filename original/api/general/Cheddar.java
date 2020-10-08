package original.api.general;

public class Cheddar implements Foodproduct {
    // 400 kcal / 100g

    private double weight;
    private double BASE_PRICE = 4;
    private double cal_100=400;

    public Cheddar(double weight) {
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
        return (cal_100*weight)/100;
    }


    public double Calories_per_100g() {
        return (Calories()*100)/weight;
    }

    @Override
    public String toString() {
        return String.format("cheddar (%.0fg) -- %.2f€ ", weight(), price(), Calories(),Calories_per_100g());
    }
}
