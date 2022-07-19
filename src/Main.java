public class Main {

	public static void main(String[] args) {
		Cliente jackeline = new Cliente();
		jackeline.setNome("Jackeline");
		
		Conta cc = new ContaCorrente(jackeline);
		Conta poupanca = new ContaPoupanca(jackeline);

		cc.depositar(500);
		cc.transferir(100, poupanca);
		cc.sacar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}