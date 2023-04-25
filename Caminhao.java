package Montadora;

public class Caminhao implements CarroFuncoes {

    private String cor;

    private String modelo;

    private String tipo;

    public Caminhao(String cor, String modelo, String tipo) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Caminhao(){

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
         return "Caminhão " + cor + " foi para frente";
    }

    @Override
    public String atras() {
         return "Caminhão " + cor + " foi para tras";
    }

    @Override
    public String esquerda() {
         return "Caminhão " + cor + " foi para esquerda";
    }

    @Override
    public String direita() {
         return "Caminhão " + cor + " foi para direita";
    }

    @Override
    public String toString() {
        return "Caminhão " + cor + " "+ modelo + " motor " + tipo;
    }
}
