package br.com.br.orientacaoAObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        try {
            switch (option) {
                case 1:
                    System.out.println("[1] Square");
                    System.out.println("[2] Retangulo");
                    System.out.println("[3] Triangulo Equilatero");
                    System.out.println("[4] Circulo");
                    System.out.println("[5] Hexagono Regular");
                    int secondOption = sc.nextInt();

                    switch (secondOption) {
                        case 1: //square
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int thirdOption = sc.nextInt();

                            switch (thirdOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 2: //retangulo
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int fourthOption = sc.nextInt();

                            switch (fourthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 3: //triangulo equilatero
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int fifthOption = sc.nextInt();

                            switch (fifthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 4: //circulo
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int sixthOption = sc.nextInt();

                            switch (sixthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 5: //hexagono regular
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int seventhOption = sc.nextInt();

                            switch (seventhOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid data, try again");

                    }
                    break;
                case 2:
                    System.out.println("[1] Cubo");
                    System.out.println("[2] Paralelepipido");
                    System.out.println("[3] Esfera");
                    System.out.println("[4] Piramide de base quadrada");
                    System.out.println("[5] Cilindro");
                    System.out.println("[6] Cone");
                    int spacialOption = sc.nextInt();

                    switch (spacialOption) {
                        case 1: //Cubo
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] volume");
                            System.out.println("[2] area superficial");
                            int thirdOption = sc.nextInt();

                            switch (thirdOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 2: //Paralelepipido
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int fourthOption = sc.nextInt();

                            switch (fourthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 3: //Esfera
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int fifthOption = sc.nextInt();

                            switch (fifthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 4: //Piramide de base quadrada
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int sixthOption = sc.nextInt();

                            switch (sixthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 5: //Cilindro
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int seventhOption = sc.nextInt();

                            switch (seventhOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        case 6: //Cilindro
                            System.out.println("Do you want to calculate:");
                            System.out.println("[1] area");
                            System.out.println("[2] perimetro");
                            int eighthOption = sc.nextInt();

                            switch (eighthOption) {
                                case 1:
                                    // função aqui
                                    break;
                                case 2:
                                    // função aqui
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid data, try again");

                    }
                    break;


            }
        }catch (Exception e){
            System.out.printf("Pensar no que por aqui");
        }

    }
}