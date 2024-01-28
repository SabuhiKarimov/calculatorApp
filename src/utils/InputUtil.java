package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public static List input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double num1= sc.nextDouble();
        System.out.println("enter second number");
        double num2 = sc.nextDouble();
        System.out.println("enter operation");
        char operations = sc.next().charAt(0);
        List list = new ArrayList<>();

        list.add(num1);
        list.add(num2);
        list.add(operations);

        return list;
    }
}
