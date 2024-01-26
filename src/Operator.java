public class Operator {
    public static void main(String[] args) {
        // operator aritmatika
        System.out.println("Operator Aritmatika: ");
        int a = 5, b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // asignment operator
        System.out.println("Asignment Operator");
        int number = 2;
        int var;

        var = number;
        System.out.println("= " + var);

        var += number;
        System.out.println("+= " + var);

        var *= number;
        System.out.println("*= " + var);

        // relational operator
        System.out.println("Relational Operator");
        int number1 = 5, number2 = 3;
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 != number2);

        // logic operator
        // && || !!
        // unary operator
        // ++ -- !
    }
}
