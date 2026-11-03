package org.example;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioneEccezioni{
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
        }catch(ArithmeticException e){
            System.out.println("Divisione per zero!");
            e.printStackTrace();
            System.err.println("Errore sulla divisione");
        }catch(InputMismatchException i){
            i.printStackTrace();
            System.err.println("Errore input");
        }

        //     FILE
        String p="";

        BufferedReader tastiera = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Inserisci una parola:");
            p = tastiera.readLine();
            System.out.println("Parola: " + p);
        } catch (IOException e) {
            System.err.println("Errore di comuninicazione tra tastiera e ram");
        }

        File f = new File("prova.txt");
        InputStream is = null;
        BufferedReader br;
        String riga;
        try {
            is = new FileInputStream(f); // apertura stream
            br = new BufferedReader(
                    new InputStreamReader(is));
            riga = br.readLine(); // utilizzo dello stream
            System.out.println(riga);
        } catch (FileNotFoundException e) {
            System.err.println("Il file non esiste");
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file");
        }
        finally {
            if(is != null){
                try {
                    is.close(); // chiusura dello stream
                } catch (IOException e) {
                    System.err.println("Errore sulla chiusura del file");
                }
            }
        }
    }
}