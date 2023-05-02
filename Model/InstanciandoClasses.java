package projeto_OO.Model;

import java.util.ArrayList;

public class InstanciandoClasses {
    public static void main(String[] args) {
       
        //Administrador
        Administrador Maria = new Administrador("Maria", "ABC123", 2710);
        System.out.println(Maria);
        System.out.println();
        
        //Cliente
        Cliente Joao = new Cliente("Joâo", "12345678", "11111111111");
        System.out.println(Joao);
        System.out.println();

        //Cosmetico
        Cosmetico laRoche = new Cosmetico("La Roche-Posay Effaclar Concentrado", "30/09/2024", "La Roche-Posay", 79.90, "Gel de limpeza facial");
        System.out.println(laRoche);
        System.out.println();

        //Medicamento
        Medicamento paracetamol = new Medicamento ("Paracetamol", "30/09/2024", "neo quimica", 5.90, "febre e dor");
        System.out.println(paracetamol);
        System.out.println();

        //Farmacia
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(laRoche);
        listaProdutos.add(paracetamol);
        Farmacia farm = new Farmacia("Farmacia da Marcia", listaProdutos);
        System.out.println(farm);
        System.out.println();


        //Venda
        Venda venda1 = new Venda(01, Joao, paracetamol, 2);
        System.out.println(venda1);
        System.out.println();
    }
}
