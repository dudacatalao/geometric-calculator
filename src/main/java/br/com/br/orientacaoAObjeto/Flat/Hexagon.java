package br.com.br.orientacaoAObjeto.Flat;

public class Hexagon extends CaulculatorFlat{
    double side;
    public Hexagon(double side){
        this.side = side;
    }    double hexagonArea(){
        return (side * 6) * 0.5;
    }
    double hexagonPerimeter(){
        return side * 6;
    }
}
