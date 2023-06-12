package Model;
import java.util.*;

public class Dados {

    private Cosmetico[] cosmeticos = new Cosmetico[50];
    private int qtdCosmeticos = 0;
    private Farmacia[] farmacias = new Farmacia[50];
    private int qtdFarmacias = 0;
    private Medicamento[] medicamentos = new Medicamento[50];
    private int qtdMedicamentos = 0;

    public void fillWithSomeData() {
        Date d = Calendar.getInstance().getTime();
        for(int i = 0; i < 5; i++) {
          cosmeticos[i] = new Cosmetico("Cosmetico"+i,d,"Fabricante"+i, (i+1)*1000, null)
        }
    }
}