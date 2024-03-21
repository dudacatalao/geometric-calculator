package br.com.br.orientacaoAObjeto.Flat;
import java.util.Scanner;

public class CaulculatorFlat {
    Scanner sc = new Scanner(System.in);
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
                System.out.println("[1] Area");
                System.out.println("[2] Perimeter");
                int squareOption = sc.nextInt();

                switch (squareOption) {
                    case 1:
                        System.out.print("Insert the value of the side: ");
                        double side = sc.nextDouble();

                        Square square = new Square(side);
                        System.out.println(square.squareArea());

                        break;

                    case 2:
                        System.out.print("Insert the value of the side: ");
                        double sideSquare = sc.nextDouble();
                        Square square2 = new Square(sideSquare);
                        System.out.println(square2.squarePerimeter());

                        break;
                }
                break;

            case 2: //retangulo
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Area");
                System.out.println("[2] Perimeter");
                int rectangleOption = sc.nextInt();

                switch (rectangleOption) {
                    case 1:
                        System.out.print("Insert the values of the base: ");
                        double base = sc.nextDouble();
                        System.out.print("Insert the values of the height: ");
                        double height = sc.nextDouble();
                        System.out.print("Insert the values of the side: ");
                        double side = sc.nextDouble();

                        Rectangle rectangle = new Rectangle(base,height,side);
                        System.out.println(rectangle.retangleArea());

                        break;

                    case 2:
                        System.out.print("Insert the values of the base: ");
                        double base2 = sc.nextDouble();
                        System.out.print("Insert the values of the height: ");
                        double height2 = sc.nextDouble();
                        System.out.print("Insert the values of the side: ");
                        double side2 = sc.nextDouble();

                        Rectangle rectangle2 = new Rectangle(base2,height2,side2);
                        System.out.println(rectangle2.retanglePerimeter());

                        break;
                }
                break;

            case 3: //triangulo equilatero
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Area");
                System.out.println("[2] Perimeter");
                int triangleOption = sc.nextInt();

                switch (triangleOption) {
                    case 1:
                        System.out.print("Insert the value of the base: ");
                        double base = sc.nextDouble();
                        System.out.print("Insert the value of the side: ");
                        double side = sc.nextDouble();
                        System.out.print("Insert the value of the height: ");
                        double height = sc.nextDouble();

                        Triangle triangle = new Triangle(side, base, height);
                        System.out.println(triangle.triangleArea());

                        break;

                    case 2:
                        System.out.print("Insert the value of the base: ");
                        double base2 = sc.nextDouble();
                        System.out.print("Insert the value of the side: ");
                        double side2 = sc.nextDouble();
                        System.out.print("Insert the value of the height: ");
                        double height2 = sc.nextDouble();

                        Triangle triangle2 = new Triangle(side2, base2, height2);
                        System.out.println(triangle2.trianglePerimeter());

                        break;

                }
                break;

            case 4: //circulo
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Area");
                System.out.println("[2] Perimeter");
                int circleOption = sc.nextInt();

                switch (circleOption) {
                    case 1:
                        System.out.print("Insert the value of the ray: ");
                        double ray = sc.nextDouble();

                        Circle circle = new Circle(ray);
                        System.out.println(circle.circleArea());

                        break;

                    case 2:
                        System.out.print("Insert the value of the ray: ");
                        double raySecond = sc.nextDouble();

                        Circle circle2 = new Circle(raySecond);
                        System.out.println(circle2.circlePerimeter());

                        break;
                }
                break;

            case 5: //hexagono regular
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Area");
                System.out.println("[2] Perimeter");
                int hexagonOption = sc.nextInt();

                switch (hexagonOption) {
                    case 1:
                        System.out.print("Insert the value of the side: ");
                        double side = sc.nextDouble();

                        Hexagon hexagon = new Hexagon(side);
                        System.out.println(hexagon.hexagonArea());
                        break;

                    case 2:
                        System.out.print("Insert the value of the side: ");
                        double sideHexagon = sc.nextDouble();

                        Hexagon hexagon2 = new Hexagon(sideHexagon);
                        System.out.println(hexagon2.hexagonPerimeter());

                        break;
                }
                break;
            default:
                System.out.println("Invalid data, try again");
        }
        return null;
    }
}