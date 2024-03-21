package br.com.br.orientacaoAObjeto.Spacias;
import br.com.br.orientacaoAObjeto.Spacias.CaulculatingSpaciais;
import br.com.br.orientacaoAObjeto.Spacias.Cube;
import br.com.br.orientacaoAObjeto.Spacias.Cone;
import br.com.br.orientacaoAObjeto.Spacias.Cylinder;
import br.com.br.orientacaoAObjeto.Spacias.Parallelepipid;
import br.com.br.orientacaoAObjeto.Spacias.Pyramid;
import br.com.br.orientacaoAObjeto.Spacias.Sphere;
import java.util.Scanner;

public class CaulculatingSpaciais{
    Scanner sc = new Scanner(System.in);


    String menu(){
        System.out.println("Which spatial shape do you want to calculate, %s?",);
        System.out.println("[1] Cubo");
        System.out.println("[2] Paralelepipido");
        System.out.println("[3] Esfera");
        System.out.println("[4] Piramide de base quadrada");
        System.out.println("[5] Cilindro");
        System.out.println("[6] Cone");
        int spacialOption = sc.nextInt();

        /*
         * %d - tipos inteiros -  byte, short, int, long
         * %f - tipos reais - float and double
         * %c - tipo caractere - char
         * %b - tipo lógico - boolean
         * %s - tipo string
         * %.2f - duas casas após a virgula
         * %.3f - tres casas após a virgula
         * %.0f - nenhuma casa após a virgula
         * */

        switch (spacialOption) {
            case 1: //cubo
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int thirdOption = sc.nextInt();

                switch (thirdOption) {
                    case 1:
                        System.out.println("Insert the value of the side:");
                        double side = sc.nextDouble();
                        Cube cube = new Cube(side);
                        System.out.printf("Volume of Cube: %.2f", cube.cubeVolume());
                        break;
                    case 2:
                        System.out.println("Insert the value of the side:");
                        double side2 = sc.nextDouble();
                        Cube cube2 = new Cube(side2);
                        System.out.printf("Surface Area of Cube: %.2f",cube2.cubeSurfaceArea());
                        break;
                }
                break;
            case 2: //paralelepipido
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int fourthOption = sc.nextInt();

                switch (fourthOption) {
                    case 1:
                        System.out.println("Insert the size of the length:");
                        double length = sc.nextDouble();
                        System.out.println("Insert the size of the width:");
                        double width = sc.nextDouble();
                        System.out.println("Insert the size of the heigth:");
                        double heigth = sc.nextDouble();
                        Parallelepipid parallelepipid = new Parallelepipid(length,heigth,width);
                        System.out.printf("Volume of parallelepipid: %.2f", parallelepipid.parallelepipidVolume());
                        break;
                    case 2:
                        System.out.println("Insert the size of the length:");
                        double length2 = sc.nextDouble();
                        System.out.println("Insert the size of the width:");
                        double width2 = sc.nextDouble();
                        System.out.println("Insert the size of the heigth:");
                        double heigth2 = sc.nextDouble();
                        Parallelepipid parallelepipid2 = new Parallelepipid(length2,heigth2,width2);
                        System.out.printf("Surface Area of parallelepipid: %.2f",parallelepipid2.parallelepipidSurfaceArea());
                        break;
                }
                break;
            case 3: //esfera
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int fifthOption = sc.nextInt();

                switch (fifthOption) {
                    case 1:
                        System.out.println("Insert the value of the ray: ");
                        double ray = sc.nextDouble();
                        Sphere sphere = new Sphere(ray);
                        System.out.println(sphere.sphereVolume());
                        break;
                    case 2:
                        System.out.println("Insert the value of the ray: ");
                        double ray2 = sc.nextDouble();
                        Sphere sphere2 = new Sphere(ray2);
                        System.out.println(sphere2.sphereSurfaceArea());
                        break;
                }
                break;
            case 4: //piramide de base quadrada
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int sixthOption = sc.nextInt();

                switch (sixthOption) {
                    case 1:
                        System.out.println("Insert the value of the side");
                        double side = sc.nextDouble();
                        System.out.println("Insert the value of the width");
                        double width = sc.nextDouble();
                        System.out.println("Insert the value of the baseEdge");
                        double baseEdge = sc.nextDouble();
                        System.out.println("Insert the value of the apothem");
                        double apothem = sc.nextDouble();
                        System.out.println("Insert the value of the areaBase");
                        double areaBase = sc.nextDouble();
                        Pyramid pyramid = new Pyramid(side, width,baseEdge,apothem,areaBase);
                        System.out.println(pyramid.pyramidVolume());
                        break;
                    case 2:
                        System.out.println("Insert the value of the side");
                        double side2 = sc.nextDouble();
                        System.out.println("Insert the value of the width");
                        double width2 = sc.nextDouble();
                        System.out.println("Insert the value of the baseEdge");
                        double baseEdge2 = sc.nextDouble();
                        System.out.println("Insert the value of the apothem");
                        double apothem2 = sc.nextDouble();
                        System.out.println("Insert the value of the areaBase");
                        double areaBase2 = sc.nextDouble();
                        Pyramid pyramid2 = new Pyramid(side2, width2,baseEdge2,apothem2,areaBase2);
                        System.out.println(pyramid2.pyramidSurfaceArea());
                        break;
                }
                break;
            case 5: //cilindro
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int seventhOption = sc.nextInt();

                switch (seventhOption) {
                    case 1:
                        System.out.println("Insert the value of the width:");
                        double width = sc.nextDouble();
                        System.out.println("Insert the value of the ray:");
                        double ray = sc.nextDouble();
                        Cylinder cylinder = new Cylinder(width, ray);
                        System.out.println(cylinder.cylinderVolume());
                        break;
                    case 2:
                        System.out.println("Insert the value of the width:");
                        double width2 = sc.nextDouble();
                        System.out.println("Insert the value of the ray:");
                        double ray2 = sc.nextDouble();
                        Cylinder cylinder2 = new Cylinder(width2, ray2);
                        System.out.println(cylinder2.cylinderSurfaceArea());
                        break;
                }
                break;
            case 6: //cone
                System.out.println("Do you want to calculate:");
                System.out.println("[1] Volume");
                System.out.println("[2] Surface Area");
                int eighthOption = sc.nextInt();

                switch (eighthOption) {
                    case 1:
                        System.out.println("Insert the value of the ray:");
                        double ray = sc.nextDouble();
                        System.out.println("Insert the value of the width:");
                        double width = sc.nextDouble();
                        Cone cone = new Cone(ray,width);
                        System.out.println(cone.coneVolume());
                        break;
                    case 2:
                        System.out.println("Insert the value of the ray:");
                        double ray2 = sc.nextDouble();
                        System.out.println("Insert the value of the width:");
                        double width2 = sc.nextDouble();
                        Cone cone2 = new Cone(ray2,width2);
                        System.out.println(cone2.coneSurfaceArea());
                        break;
                }
                break;
            default:
                System.out.println("Invalid data, try again");
        }
        return null;
    }

}
