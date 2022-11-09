package Classes;

public class VeiculoCombustivel extends VeiculoPasseio {
    private Float nivelTanque;

    public VeiculoCombustivel(String placa, Float cargaMax, int passageiroMax, int passageiroAtual,
            float cargaPortaMalas, float nivelTanque) {
        super(placa, cargaMax, passageiroMax, passageiroAtual, cargaPortaMalas);
        this.nivelTanque = nivelTanque;
        tipo = "Combustível";
    }

    @Override
    public Float calcCargaAtual() {
        return ((passageiroAtual * 80) + cargaPortaMalas + nivelTanque);
    }
}
