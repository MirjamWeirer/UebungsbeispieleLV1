public class DistanceDemo {
    public static void main(String[] args) {
        int kilometerValue = 12;
        double miles = kilometerToMiles(kilometerValue);
        System.out.println(kilometerValue + " Kilometer sind " + miles + " Meilen.");
        int kilometerLiezen = 104;
        double milesLiezen = kilometerToMiles(kilometerLiezen);
        System.out.println(kilometerLiezen + " Kilometer nach Liezen sind " + milesLiezen + " Meilen.");
        System.out.println(milesLiezen + " sind umgerechnet " + milesTokilometer(milesLiezen) + " Kilometer nach Liezen.");

    }
    // Methode für Kilometer in Meilen
    public static double kilometerToMiles(int kilometer){
        double result;
        return result = kilometer / 1.609;
    }

    //Methode Meilen in Kilometer
    public static double milesTokilometer (double miles){
        double result;
        return result = miles * 1.609;
    }
}
