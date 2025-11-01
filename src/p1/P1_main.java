package p1;

public class P1_main {
    public static void main(String[] args) {
        int wuerfel = 2; 

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("Gewonnen! wHOOP wHOOP");
        } else if (wuerfel == 2) {
            System.out.println("Verloren!");
        } else if (wuerfel == 5) {
            System.out.println("Unentschieden!");
        } else {
            System.out.println("Die Lage ist unklar!");
        }
    }
}
