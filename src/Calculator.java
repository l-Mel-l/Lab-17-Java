import java.util.Scanner;
import java.util.Scanner;

interface Operationale <T>{
    T calculate(T x,T y);}
public class Calculator implements Operationale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше выражение: ");
        String input = sc.nextLine();
        String[] splitInput = input.split("[+\\-*/]");
        if (!splitInput[0].matches("\\d*\\.\\d*|\\d*") || !splitInput[1].matches("\\d*\\.\\d*|\\d*")) {
            System.out.println("ВВедено неверное выражение"); return;}
        Double znach1 = Double.parseDouble(splitInput[0]);
        Double znach2 = Double.parseDouble(splitInput[1]);
        Operationale <Double> math = (x,y)-> {
            if (input.contains("+")){return x+y;}if (input.contains("-")){return x-y;}if (input.contains("*")){return x*y;}if (input.contains("/")){if (y == 0){System.out.println("На ноль делить нельзя");return null;}return x/y;}return null;};System.out.println(math.calculate(znach1,znach2));}

    @Override
    public Object calculate(Object x, Object y) {
        return null;
    }
}