public class TemperatureDemo {
    public static void main(String[] args) {
        //Umrechnung Celsius und Fahrenheit + Ausgaben
        double celsiusGraz = 6;
        double celsiusLiezen = 5;
        double fahrenMiami = 72;
        double fahrenSydney = 68;

        System.out.println("Die " + celsiusGraz + " Grad Celsius in Graz sind " + celsiusToFahrenheit(celsiusGraz) + " Grad in Fahrenheit.");
        System.out.println("Die " + celsiusLiezen + " Grad Celsius in Liezen sind " + celsiusToFahrenheit(celsiusLiezen) + " Grad in Fahrenheit.");
        System.out.println("Die " + fahrenMiami + " Grad Fahrenheit in Miami sind " + fahrenheitToCelsius(fahrenMiami) + " Grad Celsius");
        System.out.println("Die " + fahrenSydney + " Grad Fahrenheit in Miami sind " + fahrenheitToCelsius(fahrenSydney) + " Grad Celsius");
    }
    //Wichtig: Celsius in Fahrenheit Celsius*1.8 +32
    public static double celsiusToFahrenheit (double celsius){
        double result;
        result = celsius * 1.8 + 32;
        return result;
    }
    //Wichtig Fahrenheit (Fahrenheit-32) /1.8
    public static double fahrenheitToCelsius (double fahrenheit){
        double result;
        return result = (fahrenheit - 32) /1.8;
    }
}
