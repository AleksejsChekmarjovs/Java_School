package classWork_13_July;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Задание 1 Дано: Список (List) названий стран каждый элемент которого является списком (List)
// названий городов страны.
// Напишите stream, который c помощью flatMap: -
// Посчитает общее количество городов всех стран списка -
// Вернёт список городов всех стран с неповторяющимися названиями
public class CitiesOfCountry {



    public static void main(String[] args) {
        List<List<String>> countries = Arrays.asList(
               Arrays.asList("Moscow", "St Peterburg", "Novgorod"),
                Arrays.asList("Riga", "Daugavpils"),
                Arrays.asList("New Yok", "St Peterburg"),
                Arrays.asList("Minsk", "Novgorod")
        );
        long count = countries.stream()
                .flatMap(List::stream)
                        .count();
        System.out.println(count);

        Set<String> cities;
        cities = countries.stream()
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        System.out.println(cities);


    }

}
