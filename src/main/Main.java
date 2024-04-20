package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, bigger;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        in.close();

        bigger = a;

        if (b > bigger && b > c) {
            bigger = b;
        } else if (c > bigger) {
            bigger = c;
        }

        System.out.println("bigger: " + bigger);
    }
}
