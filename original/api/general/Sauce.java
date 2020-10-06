package original.api.general;

public class Sauce implements Product {

    public static enum SauceType {
        BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g
        public double calories() {

            double cal;
            switch (this) {
                case BURGER:
                    cal = 240;
                    break;
                case BARBECUE:
                    cal=130;
                    break;
                case BEARNAISE:
                default:
                    cal = 550;
            }
            return cal;
        }
    }

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public double calories() {
        double cal=0;
        if (type == SauceType.BARBECUE) {
            cal = (130 * weight) / 100;
            return cal;
        }
        else if (type == SauceType.BURGER) {
            cal = (240 * weight) / 100;;
            return cal;
        }

        else if (type == SauceType.BEARNAISE) {
            cal = (550 * weight) / 100;;
            return cal;
        }
        return cal; }


    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double Calories() {
        return calories();
    }

    @Override
    public double Calories_per_100g() {
        return (calories()*100)/weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price(), Calories(),Calories_per_100g());
    }
}
