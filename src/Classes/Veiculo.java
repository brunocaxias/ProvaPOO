package Classes;

public abstract class Veiculo {
    protected String placa;
    protected Float cargaMax;
    protected String tipo;

    public Veiculo(String placa, Float cargaMax) {
        this.placa = placa;
        this.cargaMax = cargaMax;
        tipo = "Veiculo";
    }

    public abstract Float calcCargaAtual();

    public String getPlaca() {
        return placa;
    }

    public boolean checaSobrepeso() {
        return (calcCargaAtual() > cargaMax);
    }

    public String getTipo() {
        return tipo;
    }
}
