
import java.util.ArrayList;

public class InstanciandoClasses {
    public static void main(String[] args) {
    
       
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

    }
}
