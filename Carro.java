package Montadora;

import java.util.ArrayList;

public class Carro implements CarroFuncoes {

    private String cor;
    private String modelo;

    private String tipo;

    public Carro(String cor, String modelo, String tipo) {
        this.cor = cor;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Carro() {

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
        return "Carro " + cor + " foi para frente";
    }

    @Override
    public String atras() {
        return "Carro " + cor + " foi para tras";
    }

    @Override
    public String esquerda() {
        return "Carro " + cor + " foi para esquerda";
    }

    @Override
    public String direita() {
        return "Carro " + cor + " foi para direita";
    }

    @Override
    public String toString() {
         return "Carro " + cor + " "+ modelo + " motor " + tipo;
    }
}
