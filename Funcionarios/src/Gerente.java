
public class Gerente extends Funcionarios {
	
	//intancia um gerente
	public Gerente(String nome, String CPF, double salario){
		super(nome,CPF,salario);
	}
	
	///calcula o salario do gerente
	public double calculaSalario(){
		return (salarioBase*2);
	}

}
