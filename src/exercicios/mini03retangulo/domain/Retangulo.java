package exercicios.mini03retangulo.domain;

public class Retangulo {
    private double largura;
    private int altura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public boolean ehMaiorQue(Retangulo outro) {
        return this.calcularArea() > outro.calcularArea();
    }
}
//