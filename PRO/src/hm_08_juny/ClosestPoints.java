package hm_08_juny;

//Дан список точек на плоскости, каждая точка описана координатами (x,y). Верните N точек наиболее близких к началу координат (0,0).
//Точку реализуйте в виде класса Point(X,Y). Список точек реализуйте в виде коллекции List.
//Пример:
//На входе: (0,1), (2,2), (5,5); N=2
//На выходе: (0,1), (2,2)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClosestPoints {
    public static List<Point> findClosestPoints(List<Point> points, int N) {
        // sort points from start
        points.sort(Comparator.comparingDouble(p -> Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY())));

        // return closest points
        return points.subList(0, Math.min(N, points.size()));
    }

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 1));
        points.add(new Point(2, 2));
        points.add(new Point(5, 5));

        int N = 1;

        List<Point> closestPoints = findClosestPoints(points, N);

        System.out.println("closest points: ");
        for (Point point : closestPoints) {
            System.out.println(point);
        }
    }
}