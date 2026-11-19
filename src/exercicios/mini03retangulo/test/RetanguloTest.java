package exercicios.mini03retangulo.test;

import exercicios.mini03retangulo.domain.Retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();

        retangulo1.setAltura(15);
        retangulo1.setLargura(40);

        retangulo2.setAltura(20);
        retangulo2.setLargura(50);

        System.out.println("Área do retângulo 1: " + retangulo1.calcularArea());
        System.out.println("Perímetro do retângulo 1: " + retangulo1.calcularPerimetro());
        System.out.println("Área do retângulo 2: " + retangulo2.calcularArea());
        System.out.println("Perímetro do retângulo 2: " + retangulo2.calcularPerimetro());
        System.out.println("Retângulo 1 é maior que retângulo 2? " + retangulo1.ehMaiorQue(retangulo2));
    }
}
//