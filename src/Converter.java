import java.util.Objects;

public class Converter {
    String uah;
    String currency;
    int amount;

    public Converter(String uah, String currency, int amount) {
        this.uah = uah;
        this.currency = currency;
        this.amount = amount;
    }



    int convertToUEP() {
        int total = 0;
        if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "usd"))) {
            total = amount * 37;
        } else if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "eur"))) {
            total = amount * 36;
        } else if ((Objects.equals(uah, "uah")) && (Objects.equals(currency, "gbp"))) {
            total = amount * 41;
        }
        
        return total;
    }


}
