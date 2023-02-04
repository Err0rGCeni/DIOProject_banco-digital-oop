package Banco;

public class Cliente {
    private String nome;
    private String cpf;
    private String senha;

    public Cliente(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF(String senha) {
        if (senha == this.senha) {
            return this.cpf;
        } else {
            return "Acesso Inválido!";
        }        
    }

    public void setCPF(String novoCPF, String senha) {
        if (senha == this.senha) {
            this.cpf = novoCPF;
        } else {
            System.out.println("Acesso Inválido!");
        }
    }
    
}
