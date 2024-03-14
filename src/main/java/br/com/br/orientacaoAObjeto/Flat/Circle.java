package br.com.br.orientacaoAObjeto.Flat;

public class Circle extends CaulculatorFlat{
    double ray;
    public Circle(){
        this.ray = ray;
    }
    double circleArea(){
        return Math.PI * (ray * ray);
    }
    double circlePerimeter(){
        return 2 * (Math.PI * ray);
    }
}
