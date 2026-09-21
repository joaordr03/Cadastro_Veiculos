public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculos(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public String getPlaca(){
        return placa;
    }
}
