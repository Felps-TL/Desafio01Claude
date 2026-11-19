package exercicios.mini02previsao;

class Caixa {
    int itens;
}

class Mexedor {
    void mudarNumero(int n) {
        n = n + 5;
    }

    void mudarCaixa(Caixa c) {
        c.itens = c.itens + 5;
        c = new Caixa();
        c.itens = 99;
    }
}

public class Previsao {
    public static void main(String[] args) {
        Mexedor m = new Mexedor();
        int numero = 10;
        Caixa caixa = new Caixa();
        caixa.itens = 10;

        m.mudarNumero(numero);
        m.mudarCaixa(caixa);

        System.out.println(numero);
        System.out.println(caixa.itens);
    }
}

//Eu acho que vai imprimir um numero aleatório de caixas e de itens
