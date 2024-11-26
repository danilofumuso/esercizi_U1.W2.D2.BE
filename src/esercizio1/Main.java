package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quante parole vuoi scrivere?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola");
            String word = scanner.nextLine();
            if (!uniqueWords.add(word)) { //aggiunge word a uniqueWords,
                // se è un duplicato restituisce false e aggiunge word a duplicateWords

                duplicateWords.add(word);
            }

        }

        System.out.println("Parole Uniche");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("Numero di parole uniche: " + uniqueWords.size());

        System.out.println("Parole Duplicate");
        for (String word : duplicateWords) {
            System.out.println(word);
        }
    }

}
