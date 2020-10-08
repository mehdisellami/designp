package original.api.general;

public class Meat implements Foodproduct {

    public enum MeatType {
        BEEF, WHITEFISH;
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

        public double price() {
            double rtr;
            switch (this) {
                case WHITEFISH:
                    rtr = 6;
                    break;
                case BEEF:
                default:
                    rtr = 4;
            }
            return rtr;
        }

    }

    private MeatType type;
    private double weight;



    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }


    public double calories() {
        double cal=0;
        if (type == MeatType.WHITEFISH) {
            cal = (170 * weight) / 100;
            return cal;
        }
        else if (type == MeatType.BEEF) {
            cal = (200* weight) / 100;
            return cal;
        }
        return cal; }



    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }


    @Override
    public double Calories() {
        return calories();
    }


    public double Calories_per_100g() {
        return (Calories()*100)/weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price(), Calories(),Calories_per_100g());
    }
}
