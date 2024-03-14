package br.com.br.orientacaoAObjeto.Spacias;

public class Cone extends CaulculatingSpaciais{
    double ray;
    double width;

    public Cone(){
        this.ray = ray;
        this.width = width;
    }
    double coneVolume(){
        return (1.0/3.0) * Math.PI * ray * ray * width;
    }
    double coneSurfaceArea(){
        return Math.PI * ray * Math.sqrt((width * width) + (ray * ray));
    }
}
