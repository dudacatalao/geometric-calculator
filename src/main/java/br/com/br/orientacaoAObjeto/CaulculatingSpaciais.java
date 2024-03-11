package br.com.br.orientacaoAObjeto;

public class CaulculatingSpaciais{
    String geometricForm;
    double side;
    double base;
    double height;
    double width;
    double result;
    double length;
    double ray;

    CaulculatingSpaciais(){ // the constructor is already executed/initialized when instantiating the object
        System.out.println("Constructor of the class");
    }

    //cube
    double cubeVolume(){
        return side * side * side;
    }
    double cubeSurfaceArea(){
        return (side * side) * 6;
    }

    //parallelepipid
    double parallelepipidVolume(){
        return length * height * width;
    }
    double parallelepipidSurfaceArea(){
        return 2 * ((length * width) + (width + height) + (length + height));
    }

    //cylinder
    double cylinderVolume(){
        return Math.PI * width * (ray * ray);
    }
    double cylinderSurfaceArea(){
        return (2 * Math.PI * width) + (2 * Math.PI * (ray * ray));
    }

    //cone
    double coneVolume(){
        return (1.0/3.0) * Math.PI * ray * ray * width;
    }
    double coneSurfaceArea(){
        return Math.PI * ray * Math.sqrt((width * width) + (ray * ray));
    }

    //pyramid
    double pyramidVolume(double areaBase){
        areaBase = side * side;
        return (areaBase * width)/3;
    }
    double pyramidSurfaceArea(double apothem, double baseEdge){
        return (2 * baseEdge * apothem) + baseEdge;
    }

    //sphere
    double sphereVolume(){
        return (4.0 / 3.0) * Math.PI * ray * ray * ray;
    }
    double sphereSurfaceArea(double apothem, double baseEdge){
        return (4 * Math.PI) * (ray + ray);
    }
    String returnCount(){
        return String.format("The Form %s" +
                " and the result:  " +
                "%f", this.geometricForm, this.result);
    }


    /*
     * %d - tipos inteiros -  byte, short, int, long
     * %f - tipos reais - float and double
     * %c - tipo caractere - char
     * %b - tipo lógico - boolean
     * %s - tipo string
     * %.2f - duas casas após a virgula
     * %.3f - tres casas após a virgula
     * %.0f - nenhuma casa após a virgula
     * */
}
