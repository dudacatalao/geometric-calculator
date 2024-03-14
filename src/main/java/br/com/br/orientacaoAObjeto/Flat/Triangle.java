package br.com.br.orientacaoAObjeto.Flat;

public class Triangle extends CaulculatorFlat{
    double side;
    double base;
    double height;

    public Triangle(){
        this.side = side;
        this.base = base;
        this.height = height;

    }
    double triangleArea(){
        return side * 3;
    }
    double trianglePerimeter(){
        return 0.5 * base * height;
    }
}
