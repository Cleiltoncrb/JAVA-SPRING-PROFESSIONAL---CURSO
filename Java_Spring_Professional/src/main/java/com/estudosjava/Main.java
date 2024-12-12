package com.estudosjava;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Solução - Rápida \n\n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();
        double netSalary = grossSalary * 0.7;
        System.out.printf("Salario liquido = %.2f%n", netSalary);
        sc.close();
    }
}