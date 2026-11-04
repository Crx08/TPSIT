package org.example;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioneEccezioni{
    public static void main(String[] args) {

        //     FILE
        /*
        Paradigma di utilizzo degli stream
            1)Apertura
            2)Utilizzo
            3)Chiusura
         */
        String p="";

        BufferedReader tastiera = new BufferedReader( //classe di wrapping (InputStreamReader)
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
            if(is != null){ // Prevenire eccezzione non controllata (NullPointerExeption)
                try {
                    is.close(); // chiusura dello stream
                } catch (IOException e) {
                    System.err.println("Errore sulla chiusura del file");
                }
            }
        }

        // Esempio di utilizzo dei BufferedWriter

        BufferedWriter bw = null;
        try{
            // 1) Apro il file
            bw = new BufferedWriter(new FileWriter("prova.txt"));
            // 2) Scrivo nel buffer
            bw.write("Ciao questa è una prova");
            bw.write("\n\r");
            // 3) svuoto il buffer e salvo nel file i dati
            bw.flush();
        }catch (IOException e){
            System.err.println("Errore nell'utilizzo del file");
        }
        finally {
            if(bw != null){
                try{
                    // 4) chiusura del file
                    bw.close();
                }catch (IOException e){
                    System.err.println("Errore sulla chiusura del file");
                }
            }
        }
    }
}