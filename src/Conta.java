
public class Conta {
	
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void debitar(double debito) {
		
		if(debito > saldo) {
			System.out.println("Valor maior que o disponível.");
		} else if(debito < 0) {
			System.out.println("Não é possível debitar um valor negativo.");
		} else {
			System.out.println("Debito realizado com sucesso.");
			saldo -= debito;
		}
		
	}
	
	public void creditar(double credito) {
		if(credito < 0) {
			System.out.println("Não é possível creditar um valor negativo.");
		} else {
			System.out.println("Depósito realizado com sucesso.");
			saldo += credito;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
