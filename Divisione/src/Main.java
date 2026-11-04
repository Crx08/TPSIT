import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //      DIVISIONE
        Scanner s = new Scanner(System.in);
        int a = 10;
        int b;
        try {
            System.out.println("inserisci un numero intero");
            b = s.nextInt();
            int c = a / b;
            System.out.println("Risultato: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Divisione per zero!");
            e.printStackTrace();
            System.err.println("Errore sulla divisione");
        } catch (InputMismatchException i) {
            i.printStackTrace();
            System.err.println("Errore input");
        }
    }
}