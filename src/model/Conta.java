package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void depositarNaConta(float deposito) {
		this.saldo += deposito;
	}
	
	public void saqueDaConta(float saque) {
		if(this.saldo >= saque) {
			saldo -= saque;
		}
		else {
			System.out.println("Saldo insuficiente, tente outro valor");
		}
	}
	
	//public String imprimirInfo() {
		//return "Titular: "+nomeTitular+" ("+cpf+") "+"Conta: "+numeroConta+" Saldo final R$: "+saldo;
	//}
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Titular: "+nomeTitular+" ("+cpf+") "+"Conta: "+numeroConta+" Saldo final R$: "+saldo;
	}
	

}
