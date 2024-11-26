package esercizio3;

public class Main {
    public static void main(String[] args) {
        Rubrica.addContact("Danilo", "3513899");
        Rubrica.addContact("Jack", "3398612");

        Rubrica.printContacts();
        System.out.println("Nome da numero");
        Rubrica.getNameByPhone("3398612");
        System.out.println("Numero da nome");
        Rubrica.getPhoneByName("Danilo");
        System.out.println("Rimozione numero");
        Rubrica.removeContact("Jack");
        Rubrica.printContacts();
    }
}
