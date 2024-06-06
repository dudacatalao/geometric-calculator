package br.com.br.orientacaoAObjeto.Spacias;

public class Cone extends CaulculatingSpaciais{
    double ray;
    double width;

    public Cone(double ray, double width){
        super();
        this.ray = this.ray;
        this.width = this.width;
    }
    double coneVolume(){
        return (1.0/3.0) * Math.PI * ray * ray * width;
    }
    double coneSurfaceArea(){
        return Math.PI * ray * Math.sqrt((width * width) + (ray * ray));
    }
}
