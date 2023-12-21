public class Main {
    public static void main(String[] args) {
        programma(1, 2);

    }
    public static void programma(int a, int b) {

        int c = ++a * ++b;
        System.out.println("il risultato del programma è: " + c);
    }
}