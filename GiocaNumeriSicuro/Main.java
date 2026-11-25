import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        System.out.println("Benevenuto");

        Giocatore g = new Giocatore("g");
        g1.start();
        try{
            Thread.currentThread().sleep(5000);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Thread.currentThread().sleep();
        System.out.println("Fine gioco");
    }
}