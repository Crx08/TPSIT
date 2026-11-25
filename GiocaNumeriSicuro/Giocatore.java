import java.util.Scanner;

public class Giocatore extends Thread {
    private Scanner s = new Scanner(System.in);

    private String nome;
    private String parola = "";
    private int numero = 0;
    private int punteggio;

    public Giocatore() {
    }

    public String getNome() {
        return nome;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getNumero() {
        return numero;
    }

    public void gioca() {
        // Sincronizza su System.in per evitare che due thread scrivano e leggano insieme
        synchronized (System.in) {
            System.out.println("Scegli il nome del tuo giocatore: ");
            this.nome = s.nextLine();

            System.out.println("Scegli la parola da giocare: ");
            this.parola = s.nextLine();

            System.out.println("Scegli il numero da giocare: ");
            this.numero = s.nextInt();

            int numeroLettere = this.parola.length();

            if (numeroLettere > 0) {
                this.punteggio = this.numero / numeroLettere;
            } else {
                this.punteggio = 0;
            }

            System.out.println(this.nome + " ha totalizzato " + this.punteggio + " punti.\n");
        }
    }

    @Override
    public void run() {
        gioca();
    }
}