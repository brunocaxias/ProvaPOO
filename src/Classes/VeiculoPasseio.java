package Classes;

public class VeiculoPasseio extends Veiculo {
    protected int passageiroMax, passageiroAtual;
    protected Float cargaPortaMalas;

    public VeiculoPasseio(String placa, Float cargaMax, int passageiroMax, int passageiroAtual, float cargaPortaMalas) {
        super(placa, cargaMax);
        this.passageiroMax = passageiroMax;
        this.passageiroAtual = passageiroAtual;
        this.cargaPortaMalas = cargaPortaMalas;
        tipo = "Passeio";
    }

    public void setPassageiroAtual(int passageiroAtual) {
        this.passageiroAtual = passageiroAtual;
    }

    public void setCargaPortaMalas(Float cargaPortaMalas) {
        this.cargaPortaMalas = cargaPortaMalas;
    }

    @Override
    public Float calcCargaAtual() {
        return ((passageiroAtual * 80) + cargaPortaMalas);
    }

}
