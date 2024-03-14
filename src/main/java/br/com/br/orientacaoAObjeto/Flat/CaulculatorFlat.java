package br.com.br.orientacaoAObjeto.Flat;
import java.util.Scanner;
import br.com.br.orientacaoAObjeto.Flat.CaulculatorFlat;
import br.com.br.orientacaoAObjeto.Flat.Circle;
import br.com.br.orientacaoAObjeto.Flat.Hexagon;
import br.com.br.orientacaoAObjeto.Flat.Rectangle;
import br.com.br.orientacaoAObjeto.Flat.Square;
import br.com.br.orientacaoAObjeto.Flat.Triangle;

public class CaulculatorFlat {
    Scanner sc = new Scanner(System.in);
    Circle circle = new Circle();
    Hexagon hexagon = new Hexagon();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Triangle triangle = new Triangle();

    String menu() {
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
                        circle.circleArea();
                        break;
                    case 2:
                        System.out.print("Insert the value of the side: ");
                        double sideSquare = sc.nextDouble();
                        circle.circlePerimeter();
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
                        rectangle.retangleArea();
                        break;
                    case 2:
                        System.out.print("Insert the value of the base: ");
                        double baseRetangle = sc.nextDouble();
                        rectangle.retanglePerimeter();
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
                        triangle.triangleArea();
                        break;
                    case 2:
                        System.out.print("Insert the value of the base: ");
                        double baseTriangle = sc.nextDouble();
                        System.out.print("Insert the value of the height: ");
                        double height = sc.nextDouble();
                        triangle.trianglePerimeter();
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
                        circle.circleArea();
                        break;
                    case 2:
                        System.out.print("Insert the value of the ray: ");
                        double raySecond = sc.nextDouble();
                        circle.circlePerimeter();
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
                        hexagon.hexagonArea();
                        break;
                    case 2:
                        System.out.print("Insert the value of the side: ");
                        double sideHexagon = sc.nextDouble();
                        hexagon.hexagonPerimeter();
                        break;
                }
                break;
            default:
                System.out.println("Invalid data, try again");
        }
        return null;
    }
}