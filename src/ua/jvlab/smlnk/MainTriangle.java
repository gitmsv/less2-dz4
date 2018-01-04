/*
 * This class defines the existence of a triangle
 * Parties are user-defined
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
* @author Sergey Melnyk
 * @date 04.01.2018
 * @version 1.0.0
 */
public class MainTriangle {

    int a;
    int b;
    int c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника:");
        int a = sc.nextInt();
        System.out.println("Введите вторую сторону треугольника:");
        int b = sc.nextInt();
        System.out.println("Введите третью сторону треугольника:");
        int c = sc.nextInt();

        if ((b + c) > a & (a + c) > b & (a + b) > c) {
            System.out.println("Такой треугольник существует)");
        } else {
            // a=5, b=7, c=14, (5+7<14)
            System.out.println("Треугольник не существует(");
        }

    }

}
