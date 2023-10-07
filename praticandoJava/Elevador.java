package praticandoJava;

public class Elevador 
{
	//Atributos:
	private int andarAtual;
	private int totalAndares;
	private int capacidadePessoas;
	private int ocupantesAtual;
	
	//Construtores:
	public Elevador(int andarAtual, int totalAndares, int capacidadePessoas, int ocupantesAtual) 
	{
		super();
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadePessoas = capacidadePessoas;
		this.ocupantesAtual = ocupantesAtual;
	}

	//Getters and Setters:
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public int getOcupantesAtual() {
		return ocupantesAtual;
	}

	public void setOcupantesAtual(int ocupantesAtual) {
		this.ocupantesAtual = ocupantesAtual;
	}
	
	//M�todos:
	public void inicializa (int capacidade, int andaresTotal)
	{
		System.out.printf("Inicializa��o realizada.\nEsse elevador tem capacidade maxima de %d usuarios, "
				+ "e viaja do t�rreo at� o %d� Andar.\n",this.capacidadePessoas, this.totalAndares);
		System.out.printf("\nAndar Atual: T�rreo\nLota��o Atual: %d pessoas\n\n",this.ocupantesAtual);
	}
		
	public void entrarUsuario (int ocupantes)
	{
		if (ocupantes < this.capacidadePessoas)
		{
			this.ocupantesAtual++;
			System.out.printf("\nLota��o Atual: %d pessoas\n", this.ocupantesAtual);
			System.out.printf("Capacidade Maxima: %d pessoas\n\n",this.capacidadePessoas);
		}
		else
		{
			System.out.println("\nLimite de ocupantes atingido\n");
		}
	}
	
	public void sairUsuario (int ocupantes)
	{
		if (ocupantes > 0)
		{
			this.ocupantesAtual--;
			System.out.printf("\nLota��o Atual: %d pessoas\n", this.ocupantesAtual);
			System.out.printf("Capacidade Maxima: %d pessoas\n\n",this.capacidadePessoas);
		}
		else 
		{
			System.out.println("\nN�o h� ningu�m ocupando o elevador.\n");
		}
		
	}
	
	public void subir (int andarAtual, int andaresTotal)
	{
		int timer=6;
		if (andarAtual < andaresTotal)
		{
			this.andarAtual++;
			System.out.printf("Subindo... ");
			do
			{
				try 
				{
				    Thread.sleep(1000);                
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				timer--;
				System.out.printf("%d  ",timer);
			}
			while (timer > 1);
			try 
			{
			    Thread.sleep(1000);                
			} catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			System.out.printf("\n\nAndar Atual: %d�Andar\n\n",this.andarAtual);
		}
		else 
		{
			System.out.println("Estamos no ultimo andar.\n");
		}
		
	}
	
	public void descer (int andarAtual, int andaresTotal)
	{
		int timer=6;
		if (andarAtual > 0)
		{
			this.andarAtual--;
			System.out.printf("Descendo... ");
			do
			{
				try 
				{
				    Thread.sleep(1000);                
				} catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				timer--;
				System.out.printf("%d  ",timer);
			}
			while (timer > 1);
			try 
			{
			    Thread.sleep(1000);                
			} catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			if (this.andarAtual==0)
			{
				System.out.println("\n\nAndar Atual: T�rreo\n");
			}
			else
			{
				System.out.printf("\n\nAndar Atual: %d�Andar\n\n",this.andarAtual);
			}
		}
		else 
		{
			System.out.println("\nEstamos no T�rreo. N�o � possivel descer.\n");
		}
	}
	
	
	/*
	 * Crie uma classe denominada Elevador para armazenar as informa��es de um elevador
		dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares
		no pr�dio (desconsiderando o t�rreo), capacidade do elevador e quantas pessoas est�o
		presentes nele. A classe deve tamb�m disponibilizar os seguintes m�todos:
		Inicializa : que deve receber como par�metros a capacidade do elevador e o total de
		andares no pr�dio (os elevadores sempre come�am no t�rreo e vazio);
		Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver
		espa�o);
		Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m
		dentro dele);
		Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
		Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
		Encapsular todos os atributos da classe (criar os m�todos set e get).

	 */
}
