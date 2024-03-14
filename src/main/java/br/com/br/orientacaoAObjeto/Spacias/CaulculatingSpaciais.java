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
    Cube cube = new Cube();
    Cone cone = new Cone();
    Cylinder cylinder = new Cylinder();
    Parallelepipid parallelepipid = new Parallelepipid();
    Pyramid pyramid = new Pyramid();
    Sphere sphere = new Sphere();

    String menu(){
        System.out.println("[1] Cubo");
        System.out.println("[2] Paralelepipido");
        System.out.println("[3] Esfera");
        System.out.println("[4] Piramide de base quadrada");
        System.out.println("[5] Cilindro");
        System.out.println("[6] Cone");
        int spacialOption = sc.nextInt();

        switch (spacialOption) {
            case 1: //cubo
                System.out.println("Do you want to calculate:");
                System.out.println("[1] volume");
                System.out.println("[2] area superficial");
                int thirdOption = sc.nextInt();

                switch (thirdOption) {
                    case 1:
                        cube.cubeVolume();
                        break;
                    case 2:
                        cube.cubeSurfaceArea();
                        break;
                }
                break;
            case 2: //paralelepipido
                System.out.println("Do you want to calculate:");
                System.out.println("[1] area");
                System.out.println("[2] perimetro");
                int fourthOption = sc.nextInt();

                switch (fourthOption) {
                    case 1:
                        parallelepipid.parallelepipidVolume();
                        break;
                    case 2:
                        parallelepipid.parallelepipidSurfaceArea();
                        break;
                }
                break;
            case 3: //esfera
                System.out.println("Do you want to calculate:");
                System.out.println("[1] area");
                System.out.println("[2] perimetro");
                int fifthOption = sc.nextInt();

                switch (fifthOption) {
                    case 1:
                        sphere.sphereVolume();
                        break;
                    case 2:
                        sphere.sphereSurfaceArea();
                        break;
                }
                break;
            case 4: //piramide de base quadrada
                System.out.println("Do you want to calculate:");
                System.out.println("[1] area");
                System.out.println("[2] perimetro");
                int sixthOption = sc.nextInt();

                switch (sixthOption) {
                    case 1:
                        pyramid.pyramidVolume();
                        break;
                    case 2:
                        pyramid.pyramidSurfaceArea();
                        break;
                }
                break;
            case 5: //cilindro
                System.out.println("Do you want to calculate:");
                System.out.println("[1] area");
                System.out.println("[2] perimetro");
                int seventhOption = sc.nextInt();

                switch (seventhOption) {
                    case 1:
                        cylinder.cylinderVolume();
                        break;
                    case 2:
                        cylinder.cylinderSurfaceArea();
                        break;
                }
                break;
            case 6: //cone
                System.out.println("Do you want to calculate:");
                System.out.println("[1] area");
                System.out.println("[2] perimetro");
                int eighthOption = sc.nextInt();

                switch (eighthOption) {
                    case 1:
                        cone.coneVolume();
                        break;
                    case 2:
                        cone.coneSurfaceArea();
                        break;
                }
                break;
            default:
                System.out.println("Invalid data, try again");

        }
        return null;
    }

}
