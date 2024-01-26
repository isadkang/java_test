/*
* yaa if else di java gaada bedanya sama bahasa lain so ya bgini saja
* switch case juga sama saja
* */
public class LogicStatements {
    public static void main(String[] args) {
        int number = 2;

        if (number < 0)
            System.out.println(number + " Negative");
        else if (number > 0)
            System.out.println(number + " Positive");
        else
            System.out.println(number + " is Zero");

        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Unknown");
        }

    }
}
