package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void evenOddElements(List<Integer> list, boolean printEven) {
        for (int i = 0; i < list.size(); i++) {
            if ((printEven && i % 2 == 0) || (!printEven && i % 2 != 0)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire?");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci un numero tra 0 e 100");
            int element = scanner.nextInt();
            if (element >= 0 && element <= 100) {
                elements.add(element);
            } else {
                System.out.println("il numero " + element + " non compreso tra 0 e 100, non verrà aggiunto alla lista!");
            }
        }
        scanner.nextLine();

        System.out.println("Lista");
        for (int element : elements) {
            System.out.println(element);
        }

        List<Integer> reversedElements = new ArrayList<>(elements);
        Collections.reverse(reversedElements);

        // Lista in ordine inverso
        System.out.println("Lista in ordine inverso");
        for (int element : reversedElements) {
            System.out.println(element);
        }

        // Stampa gli elementi in posizione pari o dispari

        System.out.println("Stampa elementi in posizione pari:");
        evenOddElements(elements, true);


        System.out.println("Stampa elementi in posizione dispari:");
        evenOddElements(elements, false);
    }
}
