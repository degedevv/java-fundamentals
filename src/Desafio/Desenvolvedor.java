package Desafio;

public class Desenvolvedor extends Funcionario{

    @Override
    double calcularSalarioFinal() {
        return getSalario() * 1.15;
    }

    @Override
    String cargo() {
        return "Desenvolvedor";
    }

}
