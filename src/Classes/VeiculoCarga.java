package Classes;

public class VeiculoCarga extends Veiculo {
    private Float cargaAtual;
    private Float nivelTanque;

    public VeiculoCarga(String placa, Float cargaMax, Float cargaAtual, Float niveTanque) {
        super(placa, cargaMax);
        this.cargaAtual = cargaAtual;
        this.nivelTanque = niveTanque;
        tipo = "Carga";

    }

    @Override
    public Float calcCargaAtual() {
        return (cargaAtual + nivelTanque);
    }
}
