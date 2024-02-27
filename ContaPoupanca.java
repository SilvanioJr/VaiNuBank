package br.com.vainaweb.backendt3.desafio;

class ContaPoupanca extends Conta {
    private int diaAniversario;

    public ContaPoupanca(int numero, String agencia, String nomeTitular, String cpf, int diaAniversario) {
        super(numero, agencia, nomeTitular, cpf);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void sacar(double valor) {
    	if(super.getSaldo() >= valor) {
			super.setSaldo(super.getSaldo() - valor - (2 * valor / 100));
			System.out.println("\nSaque realizado com sucesso.");
			System.out.println("Novo saldo da conta " + getNumero() + ": R$" + getSaldo());
		}else {
			System.out.println("\nSaldo insuficiente para o saque.");
		}
    }
}
