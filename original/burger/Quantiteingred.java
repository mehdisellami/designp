package original.burger;

import original.api.general.Burger;

public class Quantiteingred {


    public String IngredMenu(TailleMenu M) {
        if (M == TailleMenu.SMALL) {
            return "viande/poisson petit = 100g\n" +
                    "◎ sauces 20g\n" +
                    "◎ oignons 20g\n" +
                    "◎ tomates 10g\n" +
                    "◎ fromage 30g";
        }
        else if (M == TailleMenu.MEDIUM) {
            return "viande/poisson Moyen = 200g\n" +
                    "◎ sauces 20g\n" +
                    "◎ oignons 20g\n" +
                    "◎ tomates 10g\n" +
                    "◎ fromage 30g";
        } else if (M == TailleMenu.BIG) {
                return "viande/poisson Grand = 400g\n" +
                    "◎ sauces 20g\n" +
                    "◎ oignons 20g\n" +
                    "◎ tomates 10g\n" +
                    "◎ fromage 30g";
        }

        else return null;
    }

}
