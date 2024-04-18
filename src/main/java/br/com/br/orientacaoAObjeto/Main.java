package br.com.br.orientacaoAObjeto;
import java.util.Scanner;
import br.com.br.orientacaoAObjeto.Spacias.CaulculatingSpaciais;
import br.com.br.orientacaoAObjeto.Flat.CaulculatorFlat;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "█▀▀ █▀▀ █▀█ █▀▄▀█ █▀▀ ▀█▀ █▀█ █ █▀▀   █▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ ▀█▀ █▀█ █▀█\n" +
                "█▄█ ██▄ █▄█ █░▀░█ ██▄ ░█░ █▀▄ █ █▄▄   █▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ ░█░ █▄█ █▀▄");
        System.out.println("                                   Flat and Spatial");
        try {
            System.out.print("Insert your name or surname: ");
            String nameUser = sc.next();
            System.out.println("Name User: " + nameUser);
        }catch (Exception e){
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("What do you wanna do?");
        System.out.println("[1] Flat");
        System.out.println("[2] Spaciais");
        int option = sc.nextInt();
        System.out.println("Loading...");
        Thread.sleep(2000);

        try {
            switch (option) {
                case 1:
                    CaulculatorFlat(nameUser);
                    break;
                case 2:
                    CaulculatingSpaciais(nameUser);
                    break;
                default:
                    System.out.println("Invalid data, try again.");
            }
        } catch (Exception e) {
            System.out.print("Pensar no que por aqui");
        }
    }
}
