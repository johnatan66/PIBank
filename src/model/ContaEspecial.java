package model;

public class ContaEspecial extends Conta{
	private float limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroConta,saldo);
		this.limite = limite;
	}
	
	public void depositarNaConta(float deposito) {
		saldo += deposito;
	}
	
	public void saqueDaConta(float saque) {
		if(saldo+limite >= saque) {
			saldo = saldo - saque;
		}
		else {
			System.out.println("Saldo insuficiente, tente outro valor");
		}
	}
	
	//public String imprimirInfo() {
		//return "Titular: "+super.nomeTitular+" ("+super.cpf+") "+"Conta: "+numeroConta+" Saldo final R$: "+super.saldo+" Limite: "+this.limite;
	//}
	
	public String toString() {
		return "Titular: "+super.nomeTitular+" ("+super.cpf+") "+"Conta: "+numeroConta+" Saldo final R$: "+super.saldo+" Limite: "+this.limite;
	}
	
}
