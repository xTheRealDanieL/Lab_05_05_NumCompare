import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        int num_1;
        int num_2;
        num_1 = 1;
        num_2 = 1;

        System.out.println("first number is " + num_1);
        System.out.println("second number is " + num_2);

        if (num_1 == num_2)
            System.out.println("both the numbers are equal");

        else if (num_1 > num_2)
            System.out.println("first number is greater than second number");

        else if (num_2 > num_1)
            System.out.println("second number is greater than first number");

        else
            System.out.println("you must enter a number");




    }
}