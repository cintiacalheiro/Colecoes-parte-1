import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();


        lista.add("Ana Paula");
        lista.add("Dolores");
        lista.add("Claudia");

        OrdenarNomes ordenador = new OrdenarNomes(lista);

        ordenador.ordenarNomes();

        ordenador.exibirNomesOrdenados();
    }

    }
