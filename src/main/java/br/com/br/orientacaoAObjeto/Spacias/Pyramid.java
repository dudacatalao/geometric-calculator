package br.com.br.orientacaoAObjeto.Spacias;

public class Pyramid extends CaulculatingSpaciais{
    double side;
    double width;
    double baseEdge;
    double apothem;
    double areaBase;

    public Pyramid(){
        this.side = side;
        this.width = width;
        this.baseEdge = baseEdge;
        this.apothem = apothem;
        this.areaBase = areaBase;
    }

    double pyramidVolume(){
        areaBase = side * side;
        return (areaBase * width)/3;
    }
    double pyramidSurfaceArea(){
        return (2 * baseEdge * apothem) + baseEdge;
    }
}
