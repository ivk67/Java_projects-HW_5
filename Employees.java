/* Задача_2: Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
  Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, 
  Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
  которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
  Для сортировки использовать TreeMap. */
package HW_5;

import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class Employees {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
        "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
        "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
        "Иван Мечников", "Петр Петин", "Иван Ежов");

        Map<String, Integer> nameCounts = new HashMap<>();

                for (String employee : employees) {
            String[] fullName = employee.split(" ");
            String name = fullName[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

                Map<String, Integer> sortedCounts = new TreeMap<>(Comparator.<String>comparingInt(nameCounts::get).thenComparing(Comparator.naturalOrder()).reversed());
        sortedCounts.putAll(nameCounts);

        
        System.out.println("Повторяющиеся имена:");
        for (String name : sortedCounts.keySet()) {
            int count = sortedCounts.get(name);
            if (count > 1) {
                System.out.println(name + ": " + count);
            }
        }
    }
}

