package h2;

public class H2_main {
    int jahr = 2024;
    boolean schalt = false;

    public static void main(String[] args) {
        H2_main app = new H2_main();
        app.schalt = (app.jahr % 4 == 0 && app.jahr % 100 != 0) || (app.jahr % 400 == 0);
    }
}

