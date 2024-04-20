package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e, aux;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();

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
        if (a > d) {
            aux = a;
            a = d;
            d = aux;
        }
        if (a > e) {
            aux = e;
            a = e;
            e = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (b > d) {
            aux = b;
            b = d;
            d = aux;
        }
        if (b > e) {
            aux = b;
            b = e;
            e = aux;
        }
        if (c > d) {
            aux = c;
            c = d;
            d = aux;
        }
        if (c > e) {
            aux = c;
            c = e;
            e = aux;
        }
        if (d > e) {
            aux = d;
            d = e;
            e = aux;
        }

        System.out.println("Result: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }
}
