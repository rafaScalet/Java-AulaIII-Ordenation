package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, aux;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        in.close();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println("Result: " + a + ", " + b + ", " + c);
    }
}
