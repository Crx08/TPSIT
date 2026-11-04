package org.example;
import java.io.*;

public class GestioneEccezioni{
    public static void main(String[] args) {

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