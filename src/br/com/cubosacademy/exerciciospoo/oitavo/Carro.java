package br.com.cubosacademy.exerciciospoo.oitavo;

public class Carro extends Veiculo {
    private String cor, marca, modelo;
    private int ano;

    public Carro (String cor, String marca, String modelo, int ano, String placa) {
        super (placa);
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getCor () {
        return this.cor;
    }
    public String getMarca () {
        return this.marca;
    }
    public String getModelo () {
        return this.modelo;
    }
    public int getAno () {
        return this.ano;
    }

    public void setCor (String novaCor) {
        this.cor = novaCor;
    }
}