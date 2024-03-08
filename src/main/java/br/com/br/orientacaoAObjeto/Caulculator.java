package br.com.br.orientacaoAObjeto;

public class CaulculatorFlat{
    String name; //creating attributes
    double price;
    double discount;

    CaulculatorFlat(){ // the constructor is already executed/initialized when instantiating the object
        System.out.println("Constructor of the class");
    }

    CaulculatorFlat(String name, double price, double discount){ //constructor with 3 parameters
        this.name = name; //this it's the same as self "in python
        this.price = price;
        this.discount = discount;
    }

    // sobrecarga ou polimorfismo estatico ↓
    double calculatingDiscount(){ //creating method with camelCase
        return price - (price * discount);
    }
    double calculatingDiscount(double discountAdd){ //creating method with parameters
        return price - (price * (discount + discountAdd));
    }
    double calculatingDiscount(double discountAdd, double promotion){
        return price - (price * (discount + discountAdd + promotion));
    }

    String returnResumeProduct(){
        return String.format("The product %s" +
                " is priced as a percentage %.2f" +
                " and with the discount of %f and the final price " +
                "is R$ %.2f", this.name, this.price, this.discount, calculatingDiscount());
    }

    void showNameProduct(){ //method void didn't return anything
        System.out.println(name);
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
