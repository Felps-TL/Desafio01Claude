package exercicios.mini04media.domain;

public class Media {
    public double calcularMedia(double... notas) {

        if (notas.length == 0) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
//