package br.com.vainaweb.backendt3.desafio;

abstract class Conta {
    private int numero;
    private String agencia;
    private String nomeTitular;
    private String cpf;
    private double saldo;

    public Conta(int numero, String agencia, String nomeTitular, String cpf) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // Métodos bancários
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso");
        System.out.println("Novo saldo da conta " + getNumero() + ": R$" + saldo);
    }

    public abstract void sacar(double valor);

    public void transferir(Conta destino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência " + getNumero());
        } else {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso");
            System.out.println("Novo saldo da conta " + getNumero() + ": R$" + saldo);
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    @Override
    public String toString() {
        return "Conta: " + numero + " | Titular: " + nomeTitular + " | Saldo: R$" + saldo;
    }
}
