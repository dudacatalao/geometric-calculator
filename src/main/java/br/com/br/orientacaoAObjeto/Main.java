package br.com.br.orientacaoAObjeto;
import java.util.Scanner;
import br.com.br.orientacaoAObjeto.CaulculatorFlat;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        CaulculatorFlat calculatorFlat = new CaulculatorFlat();
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
                    System.out.println("[1] Square");
                    System.out.println("[2] Rectangle");
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
                                    System.out.print("Insert the value of the side: ");
                                    double side = sc.nextDouble();
                                    calculatorFlat.squareArea(side);
                                    break;
                                case 2:
                                    System.out.print("Insert the value of the side: ");
                                    double sideSquare = sc.nextDouble();
                                    calculatorFlat.squarePerimeter(sideSquare);
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
                                    System.out.print("Insert the value of the base: ");
                                    double base = sc.nextDouble();
                                    System.out.print("Insert the value of the height: ");
                                    double height = sc.nextDouble();
                                    calculatorFlat.retangleArea(base,height);
                                    break;
                                case 2:
                                    System.out.print("Insert the value of the base: ");
                                    double baseRetangle = sc.nextDouble();
                                    calculatorFlat.retanglePerimeter(baseRetangle);
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
                                    System.out.print("Insert the value of the base: ");
                                    double base = sc.nextDouble();
                                    calculatorFlat.triangleArea(base);
                                    break;
                                case 2:
                                    System.out.print("Insert the value of the base: ");
                                    double baseTriangle = sc.nextDouble();
                                    System.out.print("Insert the value of the height: ");
                                    double height = sc.nextDouble();
                                    calculatorFlat.trianglePerimeter(baseTriangle, height);
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
                                    System.out.print("Insert the value of the ray: ");
                                    double ray = sc.nextDouble();
                                    calculatorFlat.circleArea(ray);
                                    break;
                                case 2:
                                    System.out.print("Insert the value of the ray: ");
                                    double raySecond = sc.nextDouble();
                                    calculatorFlat.circlePerimeter(raySecond);
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
                                    System.out.print("Insert the value of the side: ");
                                    double side = sc.nextDouble();
                                    calculatorFlat.hexagonArea(side);
                                    break;
                                case 2:
                                    System.out.print("Insert the value of the side: ");
                                    double sideHexagon = sc.nextDouble();
                                    calculatorFlat.hexagonPerimeter(sideHexagon);
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