/*SINTESE:
 * Este progama recebe um numero(que representa a opção)
 * e executa 7 possiveis funções do Menu de opções.
 */
package TrabalhoPratico01;
import java.util.Scanner;
public class Main{
	//"VARIAVEIS GLOBAIS"
	public static int clienteCA = 10;
	public static int clientes = 0;
	public static int produtosCA = 10;
	public static int produtos = 0;
	
	public static void main(String [] args) {
	//DECLARAÇÃO DE VARIAVEIS
		int opcao;
		int[]telefone_cli = new int[40];
		String[]nome_cli = new String[40];
		String[]endereco_cli = new String[40];
		String[]nome_pro = new String[40];
		String[]descricao_pro = new String[40];
		double[]valor_pro = new double[40];
		double[]lucro_pro = new double[40];
		int[]quant_estoque = new int[40];
		
		Scanner ler = new Scanner(System.in);
	//BANCO DE DADOS CLIENTES	
		//base de nomes:
		nome_cli[0] = "Davi";
		nome_cli[1] = "Thiago";
		nome_cli[2] = "Carlos";
		nome_cli[3] = "Karla";
		nome_cli[4] = "Pedro";
		nome_cli[5] = "Eudes";
		nome_cli[6] = "Patrick";
		nome_cli[7] = "Junior";
		nome_cli[8] = "Kleyton";
		nome_cli[9] = "Mendel";
		
		//base de endereços:
		endereco_cli[0] = "QNL 10 Conjunto 2 Casa 10";
		endereco_cli[1] = "Rua dos bobos numero 0";
		endereco_cli[2] = "QE 40 conjunto J";
		endereco_cli[3] = "Rua Rafael do anjos casa 02";
		endereco_cli[4] = "Gama Leste Quadra 04";
		endereco_cli[5] = "Rua Luiz gonzaga Casa 04 ";
		endereco_cli[6] = "Nucleo Bandeirante Casa do Carvalho";
		endereco_cli[7] = "Jacarepagua Zona Oeste do Rio";
		endereco_cli[8] = "QI 07 Conjunto M Apartamento 02";
		endereco_cli[9] = "Eixo Monumental Quadra 05";
		
		//base de telefones:
		telefone_cli[0] = 940028922;
		telefone_cli[1] = 984028222;
		telefone_cli[2] = 998898921;
		telefone_cli[3] = 989224002;
		telefone_cli[4] = 942789889;
		telefone_cli[5] = 941428190;
		telefone_cli[6] = 989092341;
		telefone_cli[7] = 978908902;
		telefone_cli[8] = 952312331;
		telefone_cli[9] = 984445611;

	//BANCO DE DADOS PRODUTOS
		//produtos
		nome_pro[0] = "Refrigerador";
		nome_pro[1] = "Lavadora";		
		nome_pro[2] = "Freezer";
		nome_pro[3] = "Micro-ondas";
		nome_pro[4] = "Cadeira";
		nome_pro[5] = "Armario";
		nome_pro[6] = "Sofa";
		nome_pro[7] = "Poltrona";
		nome_pro[8] = "Mesa";
		nome_pro[9] = "Guarda-Roupa";
		
		//descricao
		descricao_pro[0] = "Ampla capacidade de armazenamento e melhor distribuição de alimentos e bebidas.";
		descricao_pro[1] = "Capacidade para lavar até 12 quilos de peças de uma só vez.";
		descricao_pro[2] = "Pode ser usado para preservar ou para congelar alimentos.";
		descricao_pro[3] = "Prepara as receitas mais usadas como: arroz, macarrão e batata.";
		descricao_pro[4] = "Desenvolvida para ser resistente e segura, além de ter design moderno";
		descricao_pro[5] = "8 portas com dobradiças metálicas, para você deixar o seu ambiente mais organizado e bonito.";
		descricao_pro[6] = "Moderno, ele possui assento retrátil, encosto reclinável, sistemas flexíveis compostos por percintas elásticas.";
		descricao_pro[7] = "Com design refinado, ela vai combinar perfeitamente com a decoração da sua sala de estar.";
		descricao_pro[8] = "É uma ótima opção para complementar a decoração do seu dormitório";
		descricao_pro[9] = "Guarda-Roupa Casal 8 Portas.";
		
		//valor de compra
		valor_pro[0] = 2889;
		valor_pro[1] = 1898;
		valor_pro[2] = 2448;
		valor_pro[3] = 489;
		valor_pro[4] = 540.90;
		valor_pro[5] = 390.90;
		valor_pro[6] = 949.50;
		valor_pro[7] = 711.55;
		valor_pro[8] = 98.10;
		valor_pro[9] = 871.11;
		
		//valor da % de lucro
		lucro_pro[0] = 2;
		lucro_pro[1] = 3;
		lucro_pro[2] = 4;
		lucro_pro[3] = 1;
		lucro_pro[4] = 5;
		lucro_pro[5] = 6.2;
		lucro_pro[6] = 5.5;
		lucro_pro[7] = 2.7;
		lucro_pro[8] = 1.4;
		lucro_pro[9] = 3.2;
		
		//quantidade em estoque
		quant_estoque[0] = 10;
		quant_estoque[1] = 9;
		quant_estoque[2] = 8;
		quant_estoque[3] = 7;
		quant_estoque[4] = 6;
		quant_estoque[5] = 5;
		quant_estoque[6] = 3;
		quant_estoque[7] = 4;
		quant_estoque[8] = 5;
		quant_estoque[9] = 9;
		
	//CODIGO MAIN
		
		do{
			menu();
			opcao = ler.nextInt();
			while(opcao < 0 || opcao > 7) {
				System.out.println("Escolha Invalida, digite novamente: ");
				opcao = ler.nextInt();
			}
			limpa_tela();
			switch(opcao) {
				case 1:
					cadastro_cliente(nome_cli, endereco_cli, telefone_cli);
					limpa_tela();
				break;
				case 2:
					buscar_cliente(nome_cli, endereco_cli, telefone_cli);
					limpa_tela();
				break;
				case 3:
					cadastrar_produto(nome_pro, descricao_pro, valor_pro, lucro_pro, quant_estoque);
					limpa_tela();
				break;
				case 4:
					buscar_produto(nome_pro, descricao_pro, valor_pro, lucro_pro, quant_estoque);
					limpa_tela();
				break;
				case 5:
					cadastro_venda(nome_cli, endereco_cli, telefone_cli, nome_pro,quant_estoque);
					limpa_tela();
				break;
				case 6:
					listar_estoque(nome_pro, descricao_pro, valor_pro, lucro_pro, quant_estoque);
					limpa_tela();
				break;
				case 7:
					System.out.println("PROGAMA ENCERRADO!");
					limpa_tela();
				break;
			
			}
		}while(opcao != 7);
	}
		//PULA TELA
		public static void limpa_tela() {
				for(int i = 1; i < 2; i++) 
				System.out.println(" ");
		}
		//IMPRIME MENU
		public static void menu() {
				System.out.println("{MENU DE OPCOES}");
				System.out.println("1. Cadastrar novo cliente");
				System.out.println("2. Buscar cliente");
				System.out.println("3. Cadastrar novo produto");
				System.out.println("4. Buscar produto");
				System.out.println("5. Cadastro de venda");
				System.out.println("6. Mostrar produtos em estoque");
				System.out.println("7. Sair");
		}
		//METODO CADASTRAR CLIENTE
		public static void cadastro_cliente(String nome_cli[], String endereco_cli[], int telefone_cli[]) {
				Scanner read = new Scanner(System.in);
				System.out.println("Digite a quantidade de clientes a serem cadastrados: ");
				clientes = read.nextInt();
				read.nextLine();
				while(clientes < 0) {
					System.out.println("Quantidade invalida, digite uma quantidade valida de clientes a serem cadastrados: ");
					clientes = read.nextInt();
					read.nextLine();
				}
				for(int i = 0; i<clientes; i++) {
					//input nome
					System.out.println("Digite o nome: ");
					nome_cli[clienteCA] = read.nextLine();
		
					//input endereço
					System.out.println("Digite o endereco: ");
					endereco_cli[clienteCA] = read.nextLine();
		
					//input telefone
					System.out.println("Digite os 9 digitos do telefone: ");
					telefone_cli[clienteCA] = read.nextInt();
					read.nextLine();
		
					while(telefone_cli[clienteCA] < 100000000 || telefone_cli[clienteCA] > 999999999) {
						System.out.println("Telefone invalido, digite novamente: ");
						telefone_cli[clienteCA] = read.nextInt();
						read.nextLine();
					}
					System.out.println("Cliente ("+(clienteCA+1)+") cadastrado com sucesso!");
					clienteCA = clienteCA + 1;
				}
		}
//Metodo buscar cliente
		//METODO BUSCAR CLIENTE
		public static void buscar_cliente(String nome_cli[], String endereco_cli[], int telefone_cli[]) {
			Scanner read = new Scanner(System.in);
			int contCadastro = 0;
			String nomeBuscado;
			int alterarDado;
	
			System.out.println("Digite o nome a ser buscado: ");
			nomeBuscado = read.nextLine();
			for(int i= 0; i < clienteCA; i++) {
				if(nomeBuscado.compareTo(nome_cli[i]) == 0) {
			
					//DADOS DO CADASTRADO
					System.out.println("Dados do cadastrado("+(i+1)+"):");
					System.out.println("Nome: "+nome_cli[i]);
					System.out.println("Endereco: "+endereco_cli[i]);
					System.out.println("Telefone: "+telefone_cli[i]+"\n");
			
					//ALTERAR DADOS
					System.out.println("Deseja alterar os dados do cadastrado?");
					System.out.println("Digite 1 para alterar ou 2 para prosseguir para o menu:");
					alterarDado = read.nextInt();
					read.nextLine();
					System.out.println(alterarDado);
					while(alterarDado != 1 && alterarDado != 2) {
						System.out.println("OPCAO INVALIDA, Digite 1 para alterar ou 2 para prosseguir:");
						alterarDado = read.nextInt();
						read.nextLine();
					}
					if(alterarDado == 1) {
						limpa_tela();
						//novo nome
						System.out.println("Digite o novo nome a ser cadastrado na posicao("+(i+1)+"):");
						nome_cli[i] = read.nextLine();
				
						//novo endereco
						System.out.println("Digite o novo endereco a ser cadastrado na posicao("+(i+1)+"):");
						endereco_cli[i] = read.nextLine();
				
						//novo telefone
						System.out.println("Digite o novo telefone a ser cadastrado na posicao("+(i+1)+"):");
						telefone_cli[i] = read.nextInt();
						read.nextLine();
						while(telefone_cli[i] < 100000000 || telefone_cli[i] > 999999999) {
							System.out.println("Telefone invalido, digite novamente: ");
							telefone_cli[i] = read.nextInt();
							read.nextLine();
						}	
						break;
					}
				}else 
					contCadastro++;		
			}
			if(contCadastro == clienteCA)
				System.out.println("Cliente nao encontrado!");
		}
//Metodo cadastro de novo produto
		//METODO CADASTRAR PRODUTO
		public static void cadastrar_produto(String nome_pro[], String descricao_pro[], double valor_pro[], double lucro_pro[], int quant_estoque[]) {
			Scanner read = new Scanner(System.in);
			//ler quantidade de produtos a serem cadastrados
			System.out.println("Quantos produtos serao cadastrados?");
			produtos = read.nextInt();
			read.nextLine();
			//verificaçao de inputs invalidos
			while(produtos < 0) {
				System.out.println("Quantidade invalida, digite uma quantidade valida de produtos a serem cadastrados: ");
				produtos = read.nextInt();
				read.nextLine();
			}
			for(int i = 0;i<produtos; i++) {
				//Cadastrar nome do produto
				System.out.println("Digite o nome do produto: ");
				nome_pro[produtosCA] = read.nextLine();
		
				//Cadastrar descrição do produto
				System.out.println("Digite a descricao do produto: ");
				descricao_pro[produtosCA] = read.nextLine();
		
				//Cadastrar valor de compra
				System.out.println("Digite o valor de compra do produto: ");
				valor_pro[produtosCA] = read.nextDouble();
				read.nextLine();
				while(valor_pro[produtosCA] < 0) {
					System.out.println("Digite um valor positivo de compra do produto: ");
					valor_pro[produtosCA] = read.nextDouble();
					read.nextLine();
				}
				//Cadastrar porcentagem de lucro
				System.out.println("Digite a % de lucro do produto: ");
				lucro_pro[produtosCA] = read.nextDouble();
				read.nextLine();
				while(lucro_pro[produtosCA] < 0) {
					System.out.println("Digite um valor positivo de % de lucro do produto: ");
					lucro_pro[produtosCA] = read.nextDouble();
					read.nextLine();
				}
				//Cadastrar quantidade em estoque
				System.out.println("Digite a quantidade em estoque: ");
				quant_estoque[produtosCA] = read.nextInt();
				read.nextLine();
				while(valor_pro[produtosCA] < 0) {
					System.out.println("Digite um valor positivo de estoque: ");
					valor_pro[produtosCA] = read.nextInt();
					read.nextLine();
				}
				System.out.println("Produto ("+(produtosCA+1)+") cadastrado com sucesso!");
				produtosCA = produtosCA + 1;
				limpa_tela();
			}
	
		}
//Metodo buscar produto
		//METODO BUSCAR PRODUTO
		public static void buscar_produto(String nome_pro[], String descricao_pro[], double valor_pro[], double lucro_pro[], int quant_estoque[]) {
			Scanner read = new Scanner(System.in);
			int contCadastro = 0;
			String nomeBuscado;
			int alterarDado;
	
			System.out.println("Digite o nome a ser buscado: ");
			nomeBuscado = read.nextLine();
			for(int i= 0; i < produtosCA; i++) {
				if(nomeBuscado.compareTo(nome_pro[i]) == 0) {
		
					//DADOS DO CADASTRADO
					System.out.println("Dados do produto cadastrado("+(i+1)+"):");
					System.out.println("Nome: "+nome_pro[i]);
					System.out.println("Descricao: "+descricao_pro[i]);
					System.out.println("Valor de Compra: R$ "+valor_pro[i]);
					System.out.println("Porcetangem de lucro: "+lucro_pro[i]+"%");
					System.out.println("Quantidade em estoque: "+quant_estoque[i]);
			
					//ALTERAR DADOS
					System.out.println("Deseja alterar os dados do produto cadastrado?");
					System.out.println("Digite 1 para alterar ou 2 para prosseguir para o menu:");
					alterarDado = read.nextInt();
					read.nextLine();
					System.out.println(alterarDado);
					while(alterarDado != 1 && alterarDado != 2) {
						System.out.println("OPCAO INVALIDA, Digite 1 para alterar ou 2 para prosseguir:");
						alterarDado = read.nextInt();
						read.nextLine();
					}
					if(alterarDado == 1) {
						limpa_tela();
						//novo nome
						System.out.println("Digite o novo nome do produto a ser cadastrado na posicao("+(i+1)+"):");
						nome_pro[i] = read.nextLine();
				
						//nova descricao
						System.out.println("Digite a nova descricao do produto da posicao("+(i+1)+"):");
						descricao_pro[i] = read.nextLine();
				
						//novo valor de compra
						System.out.println("Digite o novo valor de compra a ser cadastrado na posicao("+(i+1)+"):");
						valor_pro[i] = read.nextDouble();
						read.nextLine();
						while(valor_pro[produtosCA] < 0){
							System.out.println("Digite um valor positivo de compra do produto: ");
							valor_pro[produtosCA] = read.nextDouble();
							read.nextLine();
						}
						//novo valor de % lucro
						System.out.println("Digite o novo valor de % de lucro a ser cadastrado na posicao("+(i+1)+"):");
						lucro_pro[i] = read.nextDouble();
						read.nextLine();
						while(lucro_pro[produtosCA] < 0){
							System.out.println("Digite um valor positivo de % de lucro do produto: ");
							lucro_pro[produtosCA] = read.nextDouble();
							read.nextLine();
						}
						//novo valor de quantidade de estoque
						System.out.println("Digite o novo valor de quantidade de estoque a ser cadastrado na posicao("+(i+1)+"):");
						quant_estoque[i] = read.nextInt();
						read.nextLine();
						while(quant_estoque[produtosCA] < 0){
							System.out.println("Digite um valor positivo de compra do produto: ");
							quant_estoque[produtosCA] = read.nextInt();
							read.nextLine();
						}
						break;
					}
				}else 
					contCadastro++;		
			}
			if(contCadastro == produtosCA)
				System.out.println("Produto nao encontrado!");
		}
		//METODO CADASTRO DE VENDA
		public static void cadastro_venda(String nome_cli[], String endereco_cli[], int telefone_cli[], String nome_pro[],int quant_estoque[] ) {
			Scanner read = new Scanner(System.in);
			int aux_cli = -1, aux_pro = -1,escolha_cli, escolha_pro;
			int quant_selecionada, escolha;
	
			//SELEÇÃO DE CLIENTE CADASTRADO
			System.out.println("LISTA DE CLIENTES CADASTRADOS");
			for(int i = 0; i < clienteCA; i++) {
				System.out.println("("+(i+1)+") Nome: "+nome_cli[i]);
				System.out.println("Endereco: "+endereco_cli[i]);
				System.out.println("Telefone: "+telefone_cli[i]);
				System.out.println("");
			}	
			System.out.println("Digite o numero do cliente que deseja atribuir a venda:");
			escolha_cli = read.nextInt();
			while(aux_cli != escolha_cli) {
				for(int i = 0; i < clienteCA; i++) {
					if((escolha_cli-1) == i)
						aux_cli = escolha_cli;
				}
				if(aux_cli != escolha_cli) {
					System.out.println("Escolha invalidada!");
					System.out.println("Digite o numero do cliente que deseja atribuir a venda:");
					escolha_cli = read.nextInt();
				}
			}
			System.out.println("Cliente ("+(escolha_cli)+"-"+nome_cli[escolha_cli-1]+") selecionado com sucesso!");
			//SELEÇAO DE PRODUTO CADASTRADO
			do {
				System.out.println("\nLISTA DE PRODUTOS CADASTRADOS");
				for(int i = 0; i < produtosCA; i++) {
					System.out.println("("+(i+1)+") Nome: "+nome_pro[i]);
					System.out.println("Quantidade em estoque: "+quant_estoque[i]);
					System.out.println(" ");
				}
				//
				System.out.println("Digite o numero do produto que deseja atribuir a venda:");
				escolha_pro = read.nextInt();
				while(aux_pro != escolha_pro) {
					for(int i = 0; i < produtosCA; i++) {
						if((escolha_pro-1) == i)
							aux_pro = escolha_pro;
					}
					if(aux_pro != escolha_pro) {
						System.out.println("Escolha invalidada!");
						System.out.println("Digite o numero do cliente que deseja atribuir a venda:");
						escolha_pro = read.nextInt();
					}
				}
				System.out.println("Produto ("+(escolha_pro)+"-"+nome_pro[escolha_pro-1]+") selecionado com sucesso!");
				limpa_tela();
	
				//QUANTIDADE DE PRODUTOS VENDIDA AO CLIENTE EM QUESTAO
				System.out.println("Defina a quantidade do produto ("+nome_pro[escolha_pro-1]+") a ser vendida ao cliente ("+nome_cli[escolha_cli-1]+"):");
				quant_selecionada = read.nextInt();
				while((quant_estoque[escolha_pro-1] - quant_selecionada) < 0) {
					System.out.println("A quantidade do produto ("+nome_pro[escolha_pro-1]+") em estoque é: "+quant_estoque[escolha_pro -1]);
					System.out.println("Digite uma quantidade valida!");
					quant_selecionada = read.nextInt();
				}
				System.out.println("Venda atribuida com sucesso!\n");
				quant_estoque[escolha_pro-1] = quant_estoque[escolha_pro-1] - quant_selecionada;
				//REPETICAO DO CADASTRO DE VENDA
				System.out.println("Deseja atribuir outro produto para este cliente?");
				System.out.println("DIGITE: 1 para SIM");
				System.out.println("DIGITE: 2 para NAO");
				escolha = read.nextInt();
				while(escolha != 2 && escolha != 1) {
					System.out.println("DIGITO INVALIDO!");
					System.out.println("DIGITE: 1 para SIM");
					System.out.println("DIGITE: 2 para NAO");
					escolha = read.nextInt();
				}
			}while(escolha != 2);
		
	
		}
		//METODO PRODUTOS EM ESTOQUE
		public static void listar_estoque(String nome_pro[], String descricao_pro[], double valor_pro[], double lucro_pro[], int quant_estoque[]) {
			System.out.println("\nLISTA DE PRODUTOS CADASTRADOS");
			for(int i = 0; i < produtosCA; i++) {
				System.out.println("("+(i+1)+") Nome: "+nome_pro[i]);
				System.out.println("Descrição: "+descricao_pro[i]);
				System.out.println("Valor de venda: R$"+valor_pro[i]);
				System.out.println("Porcetagem de lucro: "+lucro_pro[i]+"%");
				System.out.println("Quantidade em estoque: "+quant_estoque[i]);
				System.out.println(" ");
		
			}
		}
}
		

