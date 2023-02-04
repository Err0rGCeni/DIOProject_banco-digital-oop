package Banco;

public class Agencia {

    private static int SEQUENCIAL = 1;
    private int numero;
    private String endereco;

    public Agencia(String endereco) {
        this.numero = Agencia.SEQUENCIAL++;
        this.endereco = endereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

}
