package homeWork_27_June;

import java.util.HashMap;
import java.util.Map;

//Найти маршрут из заданного списка билетов
//Учитывая список билетов, найти маршрут по порядку, используя данный список.
//Вход:
//«Berlin» -> «London»
//«Tokyo» -> «Seoul»
//«Mumbai» -> «Berlin»
//«Seoul» -> «Mumbai»
//Выход:
//Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon
public class Route {
    static Map<String, String> tickets = new HashMap<>();

    public static void main(String[] args) {


        tickets.put("Berlin", "London");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        String startingCity = findStartingCity(tickets);

            String route = buildRoute(startingCity, tickets);
            System.out.println("Route : " + route);

    }

    private static String findStartingCity(Map<String, String> tickets) {
        for (String city : tickets.keySet()) {
            if (!tickets.containsValue(city)) {
                return city;
            }
        }
        return null;
    }

    private static String buildRoute(String startingCity, Map<String, String> tickets) {
        StringBuilder route = new StringBuilder();
        String currentCity = startingCity;

        while (currentCity != null) {
            String nextCity = tickets.get(currentCity);
            if (nextCity != null) {
                route.append(currentCity).append(" -> ").append(nextCity).append(", ");
                currentCity = nextCity;
            } else {
                break;
            }
        }


        return route.toString();


    }

}
