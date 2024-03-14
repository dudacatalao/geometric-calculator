package br.com.br.orientacaoAObjeto.Spacias;

public class Sphere extends CaulculatingSpaciais{
    double ray;
    public Sphere(){
        this.ray = ray;
    }
    double sphereVolume(){
        return (4.0 / 3.0) * Math.PI * ray * ray * ray;
    }
    double sphereSurfaceArea(){
        return (4 * Math.PI) * (ray + ray);
    }
}
