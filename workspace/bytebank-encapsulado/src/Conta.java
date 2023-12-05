public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private  Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {		
		Conta.total++;
		System.out.println("O tatal de contas é " + total);
		this.agencia = agencia;
		this.numero = numero; 
		
		System.out.println("estou criando uma conta " + numero);
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
						
		} 
		this.saldo -= valor;
	}
	public void transfere(double valor, Conta destino) {
			this.saca(valor);
			destino.deposita(valor);
			
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		
		return Conta.total;
	}
}
	