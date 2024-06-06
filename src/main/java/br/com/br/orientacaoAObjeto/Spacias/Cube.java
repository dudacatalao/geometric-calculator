package br.com.br.orientacaoAObjeto.Spacias;

import java.util.Scanner;

public class Cube extends CaulculatingSpaciais{
    double side;
    Scanner sc = new Scanner(System.in);

    public Cube(double side){
        super();
        this.side = side;
    }
    double cubeVolume(){
        return (side * side * side);
    }
    double cubeSurfaceArea(){
        return (side * side) * 6;
    }
}
