import java.util.Scanner;

public class Barraquinha {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantidade = 5;
		
		System.out.println("Quantos cachorros quentes deseja armazenar?");
		quantidade = scan.nextInt();
		scan.nextLine();
		
		CachorroQuente vendas[] = new CachorroQuente[quantidade];
		
		int i = 0;
		for (i = 0; i < quantidade; i++)
		{
		String nome = new String();
		int matricula = 0;
		
		System.out.println("Qual o nome do aluno?");
		nome = scan.nextLine();
		System.out.println("Qual a matricula do aluno?");
		matricula = scan.nextInt();
		scan.nextLine();
		Aluno aluno = new Aluno(nome, matricula);
		
		String proteina = new String();
		String queijo = new String();
		String bebida = new String();
		
		System.out.println("Qual a proteina?");
		System.out.println("Opcoes: Salsicha, Linguica, Frango, Bacon");
		proteina = scan.next();
		
		System.out.println("Qual o queijo?");
		System.out.println("Opcoes: Mussarela, Prato, Parmesao, Coalho");
		queijo = scan.next();
		scan.nextLine();
		
		System.out.println("Qual a bebida?");
		System.out.println("Opcoes: Coca-Cola, Del Rio, Suco do Chaves");
		bebida = scan.nextLine();
		
		CachorroQuente hotdog = new CachorroQuente(aluno, (i+1), proteina, queijo, bebida);
		
		char op = 'n';
		System.out.println("Adicionar ketchup? y/n");
		op = scan.next().charAt(0);
		if (op == 'y' || op == 'Y')
		{
			hotdog.adicionarKetchup();
		}
		System.out.println("Adicionar maionese? y/n");
		op = scan.next().charAt(0);
		if (op == 'y' || op == 'Y')
		{
			hotdog.adicionarMaionese();
		}
		System.out.println("Adicionar ovo? y/n");
		op = scan.next().charAt(0);
		if (op == 'y' || op == 'Y')
		{
			hotdog.adicionarOvo();
		}
		System.out.println("Adicionar batata palha? y/n");
		op = scan.next().charAt(0);
		if (op == 'y' || op == 'Y')
		{
			hotdog.adicionarBatata();
		}
		
		int repeticoes = 1;
		System.out.println("Deseja repetir o pedido quantas vezes? (minimo de 1 vez)");
		repeticoes = scan.nextInt();
		scan.nextLine();
		
		int a;
		if (repeticoes >=1)
		{
			vendas[i] = new CachorroQuente(hotdog);
			for(a = 1; a < repeticoes; a++)
			{
				i++;
				vendas[i] = new CachorroQuente(hotdog);
				vendas[i].maisUm();
			}
		}
		else
		{
			System.out.println("Numero de repeticoes invalido");
			System.out.println("O pedido so sera registrado uma unica vez");
			vendas[i] = new CachorroQuente(hotdog);
		}
		}
		
		//Descomente esse bloco pra imprimir a lista de vendas
//		char op = 'n';
//		
//		System.out.println("Imprimir lista de vendas? y/n");
//		op = scan.next().charAt(0);
//		
//		if (op == 'y' || op == 'Y') 
//		{
//		for (i = 0; i < quantidade; i++)
//		{
//		System.out.println("Nome do comprador: " + vendas[i].aluno.nome);
//		System.out.println("Matricula: " + vendas[i].aluno.matricula);
//		System.out.println("Numero do pedido: #" + vendas[i].numeroDoPedido);
//		System.out.println("Proteina: " + vendas[i].proteina);
//		System.out.println("Queijo: " + vendas[i].queijo);
//		System.out.println("Bebida: " + vendas[i].bebida);
//		System.out.println("Tem ketchup? " + vendas[i].ketchup);
//		System.out.println("Tem maionese? " + vendas[i].maionese);
//		System.out.println("Tem ovo? " + vendas[i].ovo);
//		System.out.println("Tem batata palha? " + vendas[i].batata);
//		}
//		}
		
		scan.close();
	}

}
