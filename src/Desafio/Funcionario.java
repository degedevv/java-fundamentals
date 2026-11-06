package Desafio;

public abstract class Funcionario extends Pessoa{

    private double salario;

    private static int qnt_desenvolvedores = 0;
    private static int qnt_devops = 0;
    private static int qnt_productManager = 0;

    public int getQnt_desenvolvedores() {
        return qnt_desenvolvedores;
    }

    public void setQnt_desenvolvedores(int qnt_desenvolvedores) {
        this.qnt_desenvolvedores = qnt_desenvolvedores;
    }

    public int getQnt_devops() {
        return qnt_devops;
    }

    public void setQnt_devops(int qnt_devops) {
        this.qnt_devops = qnt_devops;
    }

    public int getQnt_productManager() {
        return qnt_productManager;
    }

    public void setQnt_productManager(int qnt_productManager) {
        this.qnt_productManager = qnt_productManager;
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public Funcionario() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    abstract double calcularSalarioFinal();

    void exibirRelatorio(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + cargo());
        System.out.println("Email: " + getEmail());
        System.out.println("Salario Base: " + getSalario());
        System.out.println("Salario Final: " + calcularSalarioFinal());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void contarCargo(Funcionario funcionario){
        switch (funcionario.cargo()){
            case "Desenvolvedor" -> qnt_desenvolvedores++;
            case "DevOps" -> qnt_devops++;
            case "ProductManager" -> qnt_productManager++;
            default -> System.out.println("Cargo desconhecido.");
        }
    }

    abstract String cargo();

    static void quantidadeDeCargos(){
        System.out.println("Desenvolvedores: " + qnt_desenvolvedores);
        System.out.println("Devops: " + qnt_devops  );
        System.out.println("ProductManager: " + qnt_productManager  );
        System.out.println("----------------------------------------");
    }

}
