public class RechteckDemo {
    public static void main(String[] args) {
        //Rechteck: Variablen für Länge und breite; Variablen ausgeben
        int breite = 4, laenge = 7;
        System.out.println("Die Länge des Rechecks beträgt: " + laenge + " cm und die Breite beträgt: " + breite + " cm.");
        //Umfang berechnen
        int umfang;
        umfang = (laenge + breite) * 2;
        System.out.println("Der Umfang des Recktecks beträgt: " + umfang + " cm");
        //Fläche berechnen
        int flaeche = laenge * breite;
        System.out.println("Die Fläche beträgt: " + flaeche + " cm²");
    }
}
