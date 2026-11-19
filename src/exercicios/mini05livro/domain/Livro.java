package exercicios.mini05livro.domain;

public class Livro {
    private String titulo;
    private int paginas;

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setPaginas(int paginas) {
        if (paginas > 0 ) {
            this.paginas = paginas;
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
//