public class User implements Runnable {

    private int i;
    private int n;
    Contatore contatore;

    public User(Contatore contatore) {
        this.i = 0;
        this.n = 10;
        this.contatore = contatore;
    }

    @Override
    public void run() {
        while (i < n) {
            i++;

            try {
                Thread.currentThread().sleep(1000);

                contatore.incrementaContatore();

                System.out.println(Thread.currentThread().getName()
                        + " - i: " + i
                        + " contatore " + contatore.getCount());

            } catch (InterruptedException e) {
                System.err.println("Errore");
            }
        }
    }
}