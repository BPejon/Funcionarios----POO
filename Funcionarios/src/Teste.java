public class Teste {
	public static void main(String [] args) throws Exception{

		double salario;
		double comissao;
		double folha_salarial = 0;
		String CPF, nome;
		Funcionarios vetor[] = new Funcionarios[10];		//vetor de 10 funcionarios

		System.out.printf("Qual o salario base dos funcionarios?\n");
		salario = EntradaTeclado.leDouble();

		System.out.printf("Qual a comissao dos vendedores?\n");
		comissao = EntradaTeclado.leDouble();

		//0 e 1 sao gerentes
		nome = "Pecanha";
		CPF = "01255333731";
		vetor[0] = new Gerente(nome,CPF , salario);
		
		nome = "Mesquita";
		CPF = "42061691790";
		vetor[1] = new Gerente(nome, CPF  , salario);

		//de 2 a 5 sao vendedores
		nome = "Cleiton";
		CPF = "33819764003";
		vetor[2] = new Assistente(nome ,CPF, salario);
		nome = "Albertina";
		CPF = "61502152029";
		vetor[3] = new Assistente(nome, CPF , salario );
		nome = "Joana";
		CPF = "83406506291";
		vetor[4] = new Assistente(nome ,CPF , salario );
		nome = "Claudete";
		CPF = "54647142949";
		vetor[5] = new Assistente(nome, CPF, salario );
	

		//de 7 a 9 sao vendedores
		nome = "Yuji";
		CPF = "55872378009";
		vetor[7] = new Vendedor(nome ,CPF , salario, comissao );
		nome = "Julia";
		CPF = "34234453005";
		vetor[8] = new Vendedor(nome, CPF , salario, comissao );
		nome = "Ricardo";
		CPF = "26539069022";
		vetor[9] = new Vendedor(nome,CPF , salario, comissao);

		//imprime a folha salarial dos funcionaios
		for(int i=0; i<10; ++i){
			folha_salarial += vetor[i].calculaSalario();
		}

		System.out.printf("A folha salarial é de R$ %f.2\n", folha_salarial );	

	}
}
