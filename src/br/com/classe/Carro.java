package br.com.classe;


/**
 * @version  1.0;
 * @since 04/03/2024;
 */
public class Carro {

    private String marca;

    private String modelo;

    private String ano;

    // Metodo Construtor
    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    // Metodo para acelerar
    public void acelerar(){
        System.out.println("Acelerando");
    }

    // Metodo para frear
    public void frear(){
        System.out.println("Freando");
    }
}
