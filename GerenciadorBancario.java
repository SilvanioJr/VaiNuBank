package br.com.vainaweb.backendt3.desafio;

import java.util.ArrayList;
import java.util.List;

class GerenciadorBancario implements SistemaBancario {
    private List<Conta> contas;

    public GerenciadorBancario() {
        this.contas = new ArrayList<>();
    }

    @Override
    public void cadastrarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso.");
    }

    @Override
    public void excluirConta(int numeroConta) {
        Conta conta = buscarContaPorNumero(numeroConta);
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    @Override
    public void editarConta(int numeroConta, String novoNome) {
        Conta conta = buscarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.setNomeTitular(novoNome);
            System.out.println("Nome do titular da conta " + numeroConta + " editado para " + novoNome + ".");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    @Override
    public void visualizarTodasContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    @Override
    public Conta buscarContaPorNumero(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
    
    
}

