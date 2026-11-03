/*
 * Applicazione multithreading e diagramma degli stati
 */

/*
 * @see UdA n. 1: Esercitazione n. 1 - Giocanumeri
 * @author cesare sonaglia
 */
public class GiocaNumeri {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Benevenuto");

        Giocatore g1 = new Giocatore("monica");
        Giocatore g2 = new Giocatore("paolo");
        g1.start();
        try{
            Thread.currentThread().sleep(5000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        g2.start();
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Thread.currentThread().sleep();
        System.out.println("Fine gioco");
    }
}