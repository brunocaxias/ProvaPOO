package Classes;

import java.util.ArrayList;

public class Dados {
    public static ArrayList<Veiculo> geraDadosProva() {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        VeiculoCarga vc = new VeiculoCarga("1234", (float) 200, (float) 150, (float) 60);
        VeiculoEletrico ve = new VeiculoEletrico("4321", (float) 100000, 5, 4, (float) 0, (float) 500);
        VeiculoCombustivel vco = new VeiculoCombustivel("4567", (float) 6000, 5, 1, 500, 5500);

        veiculos.add(vc);
        veiculos.add(ve);
        veiculos.add(vco);

        return veiculos;
    }
}
