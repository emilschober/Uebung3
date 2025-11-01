package h1;

public class H1_main {  
    double guthaben = -100;  
    double monEingang = 200; 
    int rating = -2;         
    boolean warnhinweis = false;
    boolean negativ = false;
    
    public void processAccount() {
        // Prüfe ob Guthaben negativ ist
        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }
        
        // Prüfe positives Guthaben
        if (guthaben > 0) {
            rating += 3;
        }
        
        // Prüfe Guthaben gleich 0
        if (guthaben == 0) {
            rating += 2;
        }
        
        // Prüfe negatives Guthaben und monEingang
        if (guthaben < 0) {
            if (Math.abs(monEingang) >= Math.abs(guthaben)) {
                rating += 1;
            } else {
                rating -= 1;
            }
        }
        
        // Setze Warnhinweis
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }
    }
    
    public static void main(String[] args) {
        H1_main bank = new H1_main();
        bank.processAccount();
        
        // Ausgabe der Ergebnisse
        System.out.println("Guthaben: " + bank.guthaben);
        System.out.println("Monatlicher Eingang: " + bank.monEingang);
        System.out.println("Rating: " + bank.rating);
        System.out.println("Negativ: " + bank.negativ);
        System.out.println("Warnhinweis: " + bank.warnhinweis);
    }
}
