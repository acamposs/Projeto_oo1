package Model;

public class Cliente extends Usuario {
    
    private String cpf;

    public Cliente(String nome, String senha, String cpf) {
        super(nome, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: Nome = " + nome + ", Senha = " + senha + ", CPF = " + cpf;
    }

    
}
