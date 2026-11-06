package Desafio;

public class DevOps extends Funcionario {

    @Override
    double calcularSalarioFinal() {
        return getSalario() * 1.10;
    }

    @Override
    String cargo() {
        return "DevOps";
    }

}
