package br.com.br.orientacaoAObjeto;
import java.util.Scanner;
import br.com.br.orientacaoAObjeto.Flat.CalculatorFlat; // Correção aqui
import br.com.br.orientacaoAObjeto.Spaciais.CalculatingSpaciais; // Correção aqui

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" +
                "█▀▀ █▀▀ █▀█ █▀▄▀█ █▀▀ ▀█▀ █▀█ █ █▀▀   █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█\n" +
                "█▄█ ██▄ █▄█ █░▀░█ ██▄ ░█░ █▀▄ █ █▄▄   █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄");
        System.out.println("                                   Flat and Spatial");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("introdução e talala");
        System.out.println("What do you wanna do?");
        System.out.println("[1] Flat");
        System.out.println("[2] Spaciais");
        int option = sc.nextInt();
        System.out.println("Loading...");
        Thread.sleep(2000);

        try {
            switch (option) {
                case 1:
                    CalculatorFlat flat = new CalculatorFlat();
                    break;
                case 2:
                    CalculatingSpaciais spaciais = new CalculatingSpaciais();
                    break;
                default:
                    System.out.println("Invalid data, try again.");
            }
        }catch (Exception e){
            System.out.print("Pensar no que por aqui");
        }

    }
}
