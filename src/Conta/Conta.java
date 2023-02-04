package Conta;

import Banco.Agencia;
import Banco.Cliente;

public abstract class Conta implements InterfaceConta{
    // protected permite classes filhas acessar a prop/met
    // static -> tem relação com a classe, e não com a instância.
    // private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Agencia agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, Agencia agencia) {
        this.agencia = agencia;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -=  valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo +=  valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia.getNumero()));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
