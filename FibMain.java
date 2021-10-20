package be.technofuturtic.programmation_en_java.fibonacci;

public class FibMain {

    public static void main(String[] args) {

        FibIF laSuite = () -> {

            int a = 0;
            int b = 1;
            while (b < 100) {

                int resultat = a + b;
                System.out.print(resultat + " | ");
                a = b;
                b = resultat;
            }
        };
        laSuite.suite();

        System.out.println();

        FibIF autre = FibMain::staticMethod;
        autre.suite();

        System.out.println();

        FibMain instance = new FibMain();
        FibIF third = instance::instanceMethod;
        third.suite();
    }

    public static void staticMethod() {

        int a = 0;
        int b = 1;
        while (b < 100) {

            int resultat = a + b;
            System.out.print(resultat + " | ");
            a = b;
            b = resultat;
        }
    }

    public void instanceMethod() {

        int a = 0;
        int b = 1;
        while (b < 100) {

            int resultat = a + b;
            System.out.print(resultat + " | ");
            a = b;
            b = resultat;
        }
    }
}
