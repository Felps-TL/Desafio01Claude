package exercicios.mini01calculadora.domain;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maior(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}