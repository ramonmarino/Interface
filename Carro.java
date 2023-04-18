package Montadora;

public class Carro implements CarroFuncoes {

    private String cor;
    private String modelo;

    private String tipo;

    public Carro(String cor, String modelo, String tipo) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipo = tipo;
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String frente() {
        return "O carro da cor " + cor + ", da " + modelo + ",  de combustivel  " + tipo + "foi para frente";
    }

    @Override
    public String atras() {
        return"O carro da cor " + cor + ", da " + modelo + ",  de combustivel  " + tipo + "foi para trás";
    }

    @Override
    public String esquerda() {
        return "O carro da cor " + cor + ", da " + modelo + ",  de combustivel  " + tipo + "foi para esquerda";
    }

    @Override
    public String direita() {
        return "O carro da cor " + cor + ", da " + modelo + ",  de combustivel  " + tipo + "foi para direita ";
    }
}
