public class Funcionario implements IFuncionario {

    private String nome;
    private double salario;

    private CargoFuncinario cargoFuncinario = CargoFuncinario.INICIANTE;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public CargoFuncinario getCargoFuncinario() {
        return cargoFuncinario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", salario=" + salario + '}';
    }

    @Override
    public void promover() {
        if (cargoFuncinario.equals(CargoFuncinario.INICIANTE)) {
            cargoFuncinario = CargoFuncinario.EXPERIENTE;
        } else if (cargoFuncinario.equals(CargoFuncinario.EXPERIENTE)) {
            cargoFuncinario = CargoFuncinario.AVANCADO;
        }
    }

}
