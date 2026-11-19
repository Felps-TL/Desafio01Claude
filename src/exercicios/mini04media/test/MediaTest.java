package exercicios.mini04media.test;

import exercicios.mini04media.domain.Media;

public class MediaTest {
    public static void main(String[] args) {
        Media media = new Media();

        System.out.println("Média (6, 8): " +  media.calcularMedia(6, 8));
        System.out.println("Média (10): " +  media.calcularMedia(10));
        System.out.println("Média (): " +  media.calcularMedia());
    }
}
