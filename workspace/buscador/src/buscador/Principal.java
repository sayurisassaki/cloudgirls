package buscador;

public class Principal {

	public static void main(String[] args) {
		
		ConsultaCep consultaCep = new ConsultaCep();
		Endereco novoEndereco = consultaCep.buscaEndereco("09541001");
		System.out.println(novoEndereco);
		

	}

}
