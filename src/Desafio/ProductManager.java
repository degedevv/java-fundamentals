package Desafio;

public class ProductManager extends Funcionario{

    @Override
    double calcularSalarioFinal() {
        return getSalario() * 1.20;
    }

    @Override
    String cargo() {
        return "ProductManager";
    }

}
