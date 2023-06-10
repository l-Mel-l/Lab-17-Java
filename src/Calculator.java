import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше выражение: ");
        String input = sc.nextLine();
        String[] splitInput = input.split("[+\\-*/]");
        if (input.contains("/")){
            Double num1 = Double.parseDouble(splitInput[0]);
            Double num2 = Double.parseDouble(splitInput[1]);
            calc <Double> math1 = new calc<Double>(num1,num2);
            System.out.println(math1.getDel());
        }
        else{
            Integer num1 = Integer.parseInt(splitInput[0]);
            Integer num2 = Integer.parseInt(splitInput[1]);
            calc <Integer> math2 = new calc<Integer>(num1,num2);
            if (input.contains("+")){
                System.out.println(math2.getPlus());
            } else if (input.contains("-")) {
                System.out.println(math2.getMinus());
            } else if (input.contains("*")) {
                System.out.println(math2.getUmn());
            }
        }
    }
}
class calc <T extends Number>{
    private T znach1;
    private T znach2;

    calc(T znach1,T znach2){
        this.znach1 = znach1;
        this.znach2 = znach2;}

    public int getPlus(){return (int)znach1 + (int)znach2;}
    public int getMinus(){return (int)znach1 - (int)znach2;}
    public int getUmn(){return (int)znach1 * (int)znach2;}
    public double getDel(){return (double)znach1 / (double)znach2;}
}
