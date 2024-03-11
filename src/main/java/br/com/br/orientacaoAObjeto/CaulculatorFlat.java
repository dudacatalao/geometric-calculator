package br.com.br.orientacaoAObjeto;

public class CaulculatorFlat{
    String geometricForm;
    double result;

    CaulculatorFlat(){ // the constructor is already executed/initialized when instantiating the object
        System.out.println("Constructor of the class");
    }

    //square
    double squareArea(double side){
        return side * side;
    }
    double squarePerimeter(double side){
        return side * 4;
    }

    //rectangle
    double retangleArea(double base, double height){
        return base * height;
    }
    double retanglePerimeter(double side){
        return side * 4;
    }

    //triangle
    double triangleArea(double side){
        return side * 3;
    }
    double trianglePerimeter(double base, double height){
        return 0.5 * base * height;
    }

    //hexagon
    double hexagonArea(double side){
        return (side * 6) * 0.5;
    }
    double hexagonPerimeter(double side){
        return side * 6;
    }

    //circle
    double circleArea(double ray){
        return Math.PI * (ray * ray);
    }
    double circlePerimeter(double ray){
        return 2 * (Math.PI * ray);
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
