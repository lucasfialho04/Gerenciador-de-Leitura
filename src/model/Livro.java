package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private StatusLeitura status;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    
    @Override
    public String toString() {
        return "Livro id " + id + ", titulo " + titulo + ", autor " + autor +", ano publicação "+anoPublicacao +", status " + status ;
    }


    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }


    public StatusLeitura getStatus() {
        return status;
    }


    public void setStatus(StatusLeitura status) {
        this.status = status;
    }

    
    
}
