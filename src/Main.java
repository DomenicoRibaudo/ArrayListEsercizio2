//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con 12 elementi e stamparlo in console.
//        Mettere in ordine la collezione e stampare il risultato

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        // Aggiungi 12 studenti all'ArrayList
        list.add(new Student("Sofia", 18));
        list.add(new Student("Luca", 20));
        list.add(new Student("Alessia", 19));
        list.add(new Student("Matteo", 15));
        list.add(new Student("Giorgia", 14));
        list.add(new Student("Marco", 16));
        list.add(new Student("Chiara", 14));
        list.add(new Student("Andrea", 16));
        list.add(new Student("Federica", 12));
        list.add(new Student("Giovanni", 16));
        list.add(new Student("Valentina", 17));
        list.add(new Student("Francesco", 14));

        // Stampa l'ArrayList prima dell'ordinamento
        System.out.println("ArrayList prima dell'ordinamento: ");
        for (Student student : list) {
            System.out.println(student);
        }

        // Ordina l'ArrayList in base all'età
        list.sort(Comparator.comparing(Student::getAge));

        // Stampa l'ArrayList dopo l'ordinamento
        System.out.println("\nArrayList dopo l'ordinamento per età:");
        for (Student student : list) {
            System.out.println(student);
        }

    }

}
