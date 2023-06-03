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
        phoneBook.add("John Smith", "123-456-7890");
        phoneBook.add("Jane Smith", "111-222-3333");
        phoneBook.add("John Smith", "555-666-7777");

        System.out.println(phoneBook.get("John Smith"));
        System.out.println(phoneBook.get("Jane Smith"));
    }
}
