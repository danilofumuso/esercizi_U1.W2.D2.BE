package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

    private static Map<String, String> contacts = new HashMap<>();

    public static void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public static void removeContact(String name) {
        contacts.remove(name);
    }

    public static void getNameByPhone(String phone) {
        for (String name : contacts.keySet()) {
            if (contacts.get(name).equals(phone)) {
                System.out.println(name + ", " + contacts.get(name));
            }
        }
    }

    public static void getPhoneByName(String name) {
        System.out.println(name + ", " + contacts.get(name));
    }

    public static void printContacts() {
        System.out.println("Contatti in Rubrica");
        for (String name : contacts.keySet()) {
            System.out.println(name + ", " + contacts.get(name));
        }
    }
}
