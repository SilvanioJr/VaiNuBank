package br.com.vainaweb.backendt3.desafio;

class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(int numero, String agencia, String nomeTitular, String cpf, double limiteCredito) {
        super(numero, agencia, nomeTitular, cpf);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo() ) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            super.setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Novo saldo da conta " + getNumero() + ": R$" + getSaldo());
        }
    }
}