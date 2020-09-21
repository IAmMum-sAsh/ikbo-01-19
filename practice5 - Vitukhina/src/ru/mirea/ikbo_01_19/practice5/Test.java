package ru.mirea.ikbo_01_19.practice5;

import java.util.Scanner;

public class Test {




    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // упражнение 3
        System.out.print("Упражнение 3\nВведите числа А и В [каждое в отдельной строке]\nПодпрограмма выводит числа от А до В включительно\nA = ");
        int A = scan.nextInt(); System.out.print("B = ");
        int B = scan.nextInt();
        new ex_3(A, B);

        // упражнение 4
        System.out.print("\n\nУпражнение 4\nВведите k - количество цифр числа и s - сумму цифр числа\nПодпрограмма выводит, сколько существует k-значных натуральных чисел, сумма цифр которых равна s\nk = ");
        int k = scan.nextInt(); System.out.print("s = ");
        int s = scan.nextInt();
        new ex_4(k, s);

        // упражнение 5
        System.out.print("\n\nУпражнение 5\nВведите число N\nПодпрограмма выводит сумму цифр числа\nN = ");
        int N = scan.nextInt();
        new ex_5(N);

    }
}
