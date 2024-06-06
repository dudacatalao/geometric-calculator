package br.com.br.orientacaoAObjeto;

import java.util.Scanner;
import br.com.br.orientacaoAObjeto.Spacias.CaulculatingSpaciais;
import br.com.br.orientacaoAObjeto.Flat.CaulculatorFlat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "█▀▀ █▀▀ █▀█ █▀▄▀█ █▀▀ ▀█▀ █▀█ █ █▀▀   █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█\n" +
                "█▄█ ██▄ █▄█ █░▀░█ ██▄ ░█░ █▀▄ █ █▄▄   █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄");
        System.out.println("                                   Flat and Spatial");

        System.out.println("------------------------------------------------------------------------------------------");

        int option;
        do {
            System.out.println("What do you want to do?");
            System.out.println("[1] Flat");
            System.out.println("[2] Spaciais");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Insert your name or surname: ");
                    String nameUser = sc.next();
                    System.out.println("Name User: " + nameUser);
                    CaulculatorFlat calculator = new CaulculatorFlat();
                    calculator.menu();

                    break;
                case 2:
                    System.out.print("Insert your name or surname: ");
                    String nameUser2 = sc.next();
                    CaulculatingSpaciais calculatorSpacias = new CaulculatingSpaciais();
                    calculatorSpacias.menu();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (option != 1 && option != 2);
    }
}
