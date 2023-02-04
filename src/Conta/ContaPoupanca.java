package Conta;

import Banco.Cliente;
import Banco.Agencia;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Agencia agencia) {
        super(cliente, agencia);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupança ---");
        super.ImprimirInfos();        
    }

}
