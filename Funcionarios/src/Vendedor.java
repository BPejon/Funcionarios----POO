
public class Vendedor extends Funcionarios{
	private double comissao;
	
	//cria um Vendedor
	public Vendedor(String nome, String CPF, double salario,double comissao){
		super(nome,CPF,salario);
		this.comissao = comissao;
	}
	
	//calcula salario do vendedor
	public double calculaSalario(){
		return (salarioBase+comissao);
	}

}
