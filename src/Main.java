import java.util.ArrayList;

import Classes.Dados;
import Classes.Veiculo;
import Classes.VeiculoEletrico;

public class Main {
    public static void main(String[] args) throws Exception {
        String infoVeiculo;
        ArrayList<Veiculo> lst = new ArrayList<Veiculo>();

        lst = Dados.geraDadosProva();

        for (int i = 0; i < lst.size(); i++) {
            infoVeiculo = lst.get(i).getPlaca();
            if (lst.get(i).checaSobrepeso()) {
                infoVeiculo += ", COM SOBREPESO, ";
            } else {
                infoVeiculo += ", SEM SOBREPESO, ";
            }
            if (lst.get(i).getTipo() == "Elétrico") {
                infoVeiculo += ((VeiculoEletrico) lst.get(i)).getAutonomia().toString();
                infoVeiculo += ", ";
            }

            infoVeiculo += lst.get(i).getTipo();
            System.out.println(infoVeiculo);
        }

    }
}
