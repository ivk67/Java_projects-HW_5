/* Задача_1: Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
             что 1 человек может иметь несколько телефонов. */
package HW_5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private Map<String, String> book;

    public Main() {
        book = new HashMap<String, String>();
    }

    public void add(String name, String phoneNumber) {
        if (book.containsKey(name)) {
            String existingNumber = book.get(name);
            book.put(name, existingNumber + ", " + phoneNumber);
        } else {
            book.put(name, phoneNumber);
        }
    }

    public String get(String name) {
        return book.get(name);
    }

    public static void main(String[] args) {
        Main phoneBook = new Main();
        phoneBook.add("Иван Петров", "923-456-7890");
        phoneBook.add("Надежда Петрова", "911-222-3333");
        phoneBook.add("Иван Петров", "955-666-7777");
        phoneBook.add("Иван Петров", "913-032-5789");

        System.out.println("Иван Петров: "+ phoneBook.get("Иван Петров"));
        System.out.println("Надежда Петрова: " + phoneBook.get("Надежда Петрова"));
    }
}
