package p2;

public class P2_main {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 0;
    
    // Add a method to contain the logic
    public void processValues() {
        if (a == b) {
            d += 1;
        } 
        if (a == c || a == b) {
            d += 1;
        } 
        if (a + b >= c) {
            d += 1;
        }
        if (a + b + c > 100) {
            d += 1;
        }
        // Print the final value of d
        System.out.println(d);
    }

    // Add main method to run the program
    public static void main(String[] args) {
        P2_main program = new P2_main();
        program.processValues();
    }
}
