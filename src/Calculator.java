import java.util.Scanner;

public class Calculator<T extends Number> {
    private T znach1;
    private T znach2;

    public Calculator(T znach1, T znach2) {
        this.znach1 = znach1;
        this.znach2 = znach2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше выражение: ");
        String input = sc.nextLine();
        String[] splitInput = input.split("[+\\-*/]");
        double znach1 = Double.parseDouble(splitInput[0]);
        double znach2 = Double.parseDouble(splitInput[1]);

        Calculator<Double> calculator = new Calculator<>(znach1, znach2);
        double result = 0;
        if (input.contains("+")){
            result = znach1 + znach2;}
        else if (input.contains("-")) {
            result = znach1 - znach2;}
        else if (input.contains("*")) {
            result =znach1 * znach2;}
        else if (input.contains("/")) {
            if (znach2 == 0.0) {
                System.out.println("На ноль делить нельзя");
                return;}
            result = znach1 / znach2;
        } else {
            System.out.println("Введён неправильный оператор");
            return;
        }
        System.out.println("Ответ:"+result);
    }
}