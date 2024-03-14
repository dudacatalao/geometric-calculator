package br.com.br.orientacaoAObjeto.Spacias;

public class Cylinder extends CaulculatingSpaciais{
    double width;
    double ray;
    public Cylinder(){
        this.width = width;
        this.ray = ray;
    }
    double cylinderVolume(){
        return Math.PI * width * (ray * ray);
    }
    double cylinderSurfaceArea(){
        return (2 * Math.PI * width) + (2 * Math.PI * (ray * ray));
    }

}
