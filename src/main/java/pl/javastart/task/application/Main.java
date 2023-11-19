package pl.javastart.task.application;

import pl.javastart.task.data.Person;
import pl.javastart.task.data.Task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Michał", "Kaczmarek");
        Task task1 = new Task("pranie", "wypranie ubran z całego tygodnia", 10, person1);
        System.out.printf("Priorytet zadania %s jest wysoki %b \n", task1.getName(), task1.highPriority());

        Person person2 = new Person("Jan", "Kowalski");
        Task task2 = new Task("sprzątanie", "sprzatnie całego mieszkania", 0, person2);
        System.out.printf("Priorytet zadania %s jest normalny %b \n", task2.getName(), task2.mediumPriority());

        Task task3 = new Task("wyjscie do kina", "wyjscie do kina na film akcji", -10);
        System.out.printf("Priorytet zadania %s jest niski %b \n", task3.getName(), task3.lowPriority());
    }
}
