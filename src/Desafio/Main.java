package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Main {
     static void main(String[] args) {

    Funcionario desenvolvedor = new Desenvolvedor();

    desenvolvedor.setNome("João");
    desenvolvedor.setEmail("joao@dev.com");
    desenvolvedor.setSalario(8000);

     Funcionario devOps = new DevOps();
     devOps.setNome("Pedro");
     devOps.setEmail("Pedro@devops.com");
     devOps.setSalario(9000);

    Funcionario productManager = new ProductManager();
    productManager.setNome("Maria");
    productManager.setEmail("Maria@pn.com");
    productManager.setSalario(10000);

    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(desenvolvedor);
    funcionarios.add(productManager);
    funcionarios.add(devOps);

    double totalFolhaDePagamento = 0;
    double maiorSalario = 0;
    Funcionario funcionarioMaiorSalario = null;


    for (Funcionario funcionario : funcionarios) {
        funcionario.exibirRelatorio();
        totalFolhaDePagamento = totalFolhaDePagamento + funcionario.calcularSalarioFinal();

        //Contagem dos cargos
        Funcionario.contarCargo(funcionario);

        //Cálculo maior salário
        if (funcionario.calcularSalarioFinal() > maiorSalario){
            maiorSalario = funcionario.calcularSalarioFinal();
            funcionarioMaiorSalario = funcionario;
        }
    }
         System.out.println("Quantidade de Funcionarios: " +  funcionarios.size());
         System.out.println("Total folha de pagamento: " + totalFolhaDePagamento);
         System.out.println("Maior salario da empresa:");
         System.out.println("--------------------------");
         System.out.println(funcionarioMaiorSalario.getNome());
         System.out.println(maiorSalario);
         System.out.println("--------------------------");
         Funcionario.quantidadeDeCargos();





    }
}
