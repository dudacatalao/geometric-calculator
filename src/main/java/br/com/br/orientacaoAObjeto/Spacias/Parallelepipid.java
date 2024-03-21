package br.com.br.orientacaoAObjeto.Spacias;

public class Parallelepipid extends CaulculatingSpaciais{
    double length;
    double width;
    double height;
    public Parallelepipid(double length, double height, double width){
        this.length = this.length;
        this.width = width;
        this.height = height;
    }
    double parallelepipidVolume(){
        return length * height * width;
    }
    double parallelepipidSurfaceArea(){
        return 2 * ((length * width) + (width + height) + (length + height));
    }
}
