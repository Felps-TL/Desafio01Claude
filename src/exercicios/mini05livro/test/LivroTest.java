package exercicios.mini05livro.test;

import exercicios.mini05livro.domain.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setPaginas(-5);
        livro.setTitulo("A Empregada Argoniana");

        System.out.println("Páginas atuais: " + livro.getPaginas());
        System.out.println("Título: " + livro.getTitulo());
    }
}
