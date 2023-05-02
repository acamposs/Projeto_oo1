package Model;

public class Administrador extends Usuario {

    private int ra;

    public Administrador(String nome, String senha, int ra) {
        super(nome, senha);
        this.ra = ra;
    }

  
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Administrador: Nome = " + nome + ", Senha = " + senha + ", Registro do Administrador = " + ra;
    }
   
}
