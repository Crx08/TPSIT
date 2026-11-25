package ContatoreNonSincronizzato;

public class User implements Runnable{
    Counter c;
    public User(Counter c) {
        this.c=c;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5000; i++){
            // Invocare il metodi implement della classse counter
            c.increment();
        }
    }
}
