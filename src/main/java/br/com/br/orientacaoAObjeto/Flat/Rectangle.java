package br.com.br.orientacaoAObjeto.Flat;

public class Rectangle extends CaulculatorFlat{
    double base;
    double height;
    double side;

    public Rectangle(double base, double height,double side){
        this.base = this.base;
        this.height = this.height;
        this.side = side;
    }
    double retangleArea(){
        return base * height;
    }
    double retanglePerimeter(){
        return side * 4;
    }
}
