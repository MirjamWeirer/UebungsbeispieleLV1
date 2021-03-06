public class ZinsDemo {
    public static void main(String[] args) {
        zinsBerechnung(1);
        zinsBerechnung(4);
        zinsBerechnung(8);
    }
    public static void zinsBerechnung (int jahre){
        int kontostand = 1000;
        double zinsen = 2.25;
        double result = kontostand * zinsen / 100 * jahre;
        System.out.println(zinsen + "% von " + kontostand + " = " +result + " für Jahr(e): " + jahre + ".");
    }
}
