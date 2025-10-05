import java.util.Scanner;

public class switchcase {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the choice");

        int choice = Sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("FRiday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            case 8:
                System.out.println("Default");
                break;

        }
    }
}

/* switch case calculator program */
class calculator {
    public static void main(String args[]) {

        System.out.println("Simple calculator");
        System.out.println("1. addition ");
        System.out.println("2. Substraction");
        System.out.println("3. division");
        System.out.println("4.Modulus");

        System.out.println("enter your choice 1-4");
        int choice = sc.nextInt();
        System.out.println("enter a first no");
        double num1 = sc.nextdouble();
        System.out.println("enter a second no");
        double num2 = sc.nextdouble();

        switch (choice) {
            case 1:
                System.out.println("result:" + (num1 + num2));
                break;
            case 2:
                System.out.println("result:" + (num1 - num2));
                break;
            case 3:
                System.out.println("result:" + (num1 / num2));
                break;
            case 4:
                System.out.println("result:" + (num1 % num2));
                break;
                System.out.println("invalid choice");
                sc.close();

        }
    }
}
