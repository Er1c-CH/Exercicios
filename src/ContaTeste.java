
public class ContaTeste {

	public static void main(String[] args) {

		Conta c1 = new Conta(1000);
		Conta c2 = new Conta(532);
		
		System.out.println("Saldo conta 1: R$" + c1.getSaldo() + ".\nSaldo Conta 2: R$" + c2.getSaldo() + ".");
		
		c1.creditar(2000);
		c2.debitar(600);
		c1.creditar(-100);
		c2.debitar(300);
		
		System.out.println("Saldo após operação conta 1: R$" + c1.getSaldo() + ".\nSaldo Conta após operação 2: R$" + c2.getSaldo() + ".");
		
	}

}
