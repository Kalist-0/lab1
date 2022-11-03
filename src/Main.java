public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_PURPLE = "\u001B[35m";


        Converter con = new Converter("uah", "usd", 25);
        CryptoConvert cc = new CryptoConvert("btc", "eth", 15);
        CalcInvest ci = new CalcInvest(10, 12, 150000);

        System.out.println(con.convertToUEP() + " гривень");

        System.out.println("\n");

        System.out.println(cc.convertToCrypto() + ANSI_PURPLE + " Ether" + ANSI_RESET);

        System.out.println("\n");

        System.out.println("В кінцевому результаті ви отримаєте - " + ci.calcIncome());


    }
}