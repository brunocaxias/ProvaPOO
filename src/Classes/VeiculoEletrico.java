package Classes;

public class VeiculoEletrico extends VeiculoPasseio {
    private Float autonomia;

    public VeiculoEletrico(String placa, Float cargaMax, int passageiroMax, int passageiroAtual, Float cargaPortaMalas,
            Float autonomia) {
        super(placa, cargaMax, passageiroMax, passageiroAtual, cargaPortaMalas);
        this.autonomia = autonomia;
        tipo = "Elétrico";
    }

    public Float getAutonomia() {
        return autonomia;
    }

}
