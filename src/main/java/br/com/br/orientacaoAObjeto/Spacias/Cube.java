package br.com.br.orientacaoAObjeto.Spacias;

public class Cube extends CaulculatingSpaciais{
    double side;

    public Cube(){
        this.side = side;
    }
    double cubeVolume(){
        return side * side * side;
    }
    double cubeSurfaceArea(){
        return (side * side) * 6;
    }
}
