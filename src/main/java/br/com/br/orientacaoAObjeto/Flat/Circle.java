package br.com.br.orientacaoAObjeto.Flat;
import br.com.br.orientacaoAObjeto.Spacias.CaulculatingSpaciais;

public class Circle extends CaulculatingSpaciais {
    double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    double circleArea() {
        return Math.PI * (this.ray * this.ray);
    }

    double circlePerimeter() {
        return 2 * Math.PI * this.ray;
    }
}
