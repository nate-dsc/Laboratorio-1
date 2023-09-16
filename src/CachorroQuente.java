
public class CachorroQuente {
	Aluno aluno;
	
	int numeroDoPedido;
	
	String proteina;
	String queijo;
	String bebida;
	
	boolean ketchup = false;
	boolean maionese = false;
	boolean ovo = false;
	boolean batata = false;
	
	public CachorroQuente(Aluno aluno, int pedido, String proteina, String queijo, String bebida)
	{
		this.aluno = aluno;
		this.numeroDoPedido = pedido;
		this.proteina = proteina;
		this.queijo = queijo;
		this.bebida = bebida;
	}
	
	public void adicionarKetchup()
	{
		this.ketchup = true;
	}
	public void adicionarMaionese()
	{
		this.maionese = true;
	}
	public void adicionarOvo()
	{
		this.ovo = true;
	}
	public void adicionarBatata()
	{
		this.batata = true;
	}
	public void maisUm()
	{
		this.numeroDoPedido += 1;
	}

	//metodo pra copiar o cachorro quente pra array
	public CachorroQuente(CachorroQuente outro)
	{
		this.aluno = outro.aluno;
		this.numeroDoPedido = outro.numeroDoPedido;
		this.proteina = outro.proteina;
		this.queijo = outro.queijo;
		this.bebida = outro.bebida;
		this.ketchup = outro.ketchup;
		this.maionese = outro.maionese;
		this.ovo = outro.ovo;
		this.batata = outro.batata;
	}
}
