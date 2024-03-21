package br.com.br.orientacaoAObjeto.Flat;

public class Triangle extends CaulculatorFlat{
    double side;
    double base;
    double height;

    public Triangle(double side, double base, double height){
        this.side = this.side;
        this.base = this.base;
        this.height = this.height;

    }
    double triangleArea(){
        return side * 3;
    }
    double trianglePerimeter(){
        return 0.5 * base * height;
    }
}
