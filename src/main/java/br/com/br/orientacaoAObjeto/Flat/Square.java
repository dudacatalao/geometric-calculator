package br.com.br.orientacaoAObjeto.Flat;

public class Square extends CaulculatorFlat {
    double side;

    public Square(double side){
        this.side = side;
    }
    double squareArea(){
        return side * side;
    }
    double squarePerimeter(){
        return side * 4;
    }
}
