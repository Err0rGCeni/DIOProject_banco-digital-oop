import Banco.Cliente;
import Banco.Agencia;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Agencia a01 = new Agencia("Rua dos Bobos");
        Agencia a02 = new Agencia("Tão Tão Distante");

        System.out.println(a01.getEndereco() + " - " + a01.getNumero());
        System.out.println(a02.getEndereco() + " - " + a02.getNumero());

        Cliente ze = new Cliente("zezo", "123123", "Senha123");
        ze.setNome("Zé");
        Cliente jao = new Cliente("João", "707070", "321Senha");
        Cliente maria = new Cliente("Maria", "007007", "abc123");

        System.out.println(ze.getCPF("123"));
        System.out.println(ze.getCPF("Senha123"));

        Conta cc01 = new ContaCorrente(ze, a01);
        Conta cp01 = new ContaPoupanca(jao, a02);
        Conta cc02 = new ContaCorrente(maria, a01);

        cc01.depositar(100);
        cc01.transferir(50, cc02);
        cc02.transferir(75, cp01);
        
        cc01.imprimirExtrato();
        cp01.imprimirExtrato();
        cc02.imprimirExtrato();
    }
    
}
