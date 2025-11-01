package h3;

public class H3_main {
    int max = 100;
    int fix = 50;
    int wartend = 0;
    boolean istVoll = false;
    public void programm() {
        if (fix < max && wartend > 0) {
            int freie = max - fix;
            int zuweisen = Math.min(freie, wartend);
            fix += zuweisen;
            wartend -= zuweisen;
        }
        istVoll = fix >= max;
    }
    public static void main(String[] args) {
        H3_main app = new H3_main();
        app.programm();
        System.out.printf("fix=%d, wartend=%d, istVoll=%b%n", app.fix, app.wartend, app.istVoll);
    }
}