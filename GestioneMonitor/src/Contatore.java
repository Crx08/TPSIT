public class Contatore {

    // attributi
    private int count = 0;  // risorsa condivisa
    private int n = 500;
    private int i = 0;

    synchronized void incrementaContatore(){   //medoto entry
        count++;
    }
    synchronized void decrementaContatore(){    //medoto entry
        count--;
    }
    synchronized int getCount(){    //medoto entry
        return this.count;
    }
}
