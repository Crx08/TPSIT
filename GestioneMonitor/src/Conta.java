public class Conta {
    public static void main(String[] args) {

        Contatore contatore = new Contatore();

        User user1 = new User(contatore);
        Thread threadUser1 = new Thread(user1);
        threadUser1.start();

        User user2 = new User(contatore);
        Thread threadUser2 = new Thread(user2);
        threadUser2.start();
    }
}