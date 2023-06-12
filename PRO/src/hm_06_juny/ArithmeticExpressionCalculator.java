package hm_06_juny;

//Разработайте программу, вычисляющую арифметическое выражение произвольной длины.
// Пользователь последовательно вводит с клавиатуры операнд (число),
// затем знак арифметической операции (+,-,*,:),
// затем снова операнд и знак арифметической операции и так до тех пор, пока не введёт символ равенства =.
//Введённые данные, по мере их ввода, сохраняются в структуре данных List.
//После ввода символа = программа выводит на экран арифметическое выражение и  последовательно вычисляет его значение.
//Каждый логический шаг алгоритма оформите в виде отдельного метода.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticExpressionCalculator {
    public static void main(String[] args) {
        List<String> expression = readExpression();
        System.out.println("Expression: " + expression);
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static List<String> readExpression() {
        List<String> expression = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your expression (for ending enter =): ");

        while (true) {
            String scan = scanner.next();
            if (scan.equals("=")) {
                break;
            }
            expression.add(scan);
        }

        return expression;
    }

    public static double evaluateExpression(List<String> expression) {
        double result = Double.parseDouble(expression.get(0));

        for (int i = 1; i < expression.size(); i += 2) {
            String operator = expression.get(i);
            double operand = Double.parseDouble(expression.get(i + 1));

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
                default:
                    System.out.println("Invalid operand: " + operator);
            }
        }

        return result;
    }
}
