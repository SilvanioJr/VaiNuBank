package br.com.vainaweb.backendt3.desafio;

interface SistemaBancario {
    void cadastrarConta(Conta conta);
    void excluirConta(int numeroConta);
    void editarConta(int numeroConta, String novoNome);
    void visualizarTodasContas();
    Conta buscarContaPorNumero(int numeroConta);
}