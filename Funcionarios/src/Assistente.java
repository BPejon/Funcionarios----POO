
public class Assistente extends Funcionarios {
	
	//instancia um assistente
	public Assistente(String nome, String CPF, double salario){
		super(nome,CPF,salario);
	}
	
	//calcula o salario do assistente
	public double calculaSalario(){
		return salarioBase;
	}

}
