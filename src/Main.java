import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  ваше выражение:");
        String input = scanner.nextLine();
        input = input.replaceAll(",",".");
        String[] znach = input.split("[+\\-*/]");
        if (znach.length != 2 || znach[0] != "\\d" || znach[1] != "\\d") {
            System.out.println("ВВедено неверное выражение");
            return;
        }
        double num1 = Double.parseDouble(znach[0]);
        double num2 = Double.parseDouble(znach[1]);

        double result = 0;
        if (input.contains("+")){
            result = num1 + num2;}
        else if (input.contains("-")) {
            result = num1 - num2;}
        else if (input.contains("*")) {
            result = num1 * num2;}
        else if (input.contains("/")) {
            if (num2 == 0.0) {
                System.out.println("На ноль делить нельзя");
                return;}
            result = num1 / num2;
        } else {
            System.out.println("Введён неправильный оператор");
            return;
        }
        String Otvet = NumberFormat.getInstance().format(result);
        System.out.println("Ответ:" + Otvet);
    }
}