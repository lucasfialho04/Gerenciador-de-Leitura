package service;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class BibliotecaService {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public List<Livro> listarLivros(){
       return new ArrayList<>(livros);
    }
}
