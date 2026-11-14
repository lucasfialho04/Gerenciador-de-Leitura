package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import model.Livro;

public class BibliotecaService {
    private List<Livro> livros = new ArrayList<>();
    private int id;

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        livro.setId(++id);
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }

    public Boolean removePorId(int id) {
        Iterator<Livro> livroIterator = livros.iterator();
        while (livroIterator.hasNext()) {
            if (livroIterator.next().getId() == id) {
                livroIterator.remove();
                return true;
            }
        }
        return false;
    }

    public Optional<Livro> buscarPorId(int id){
        for (Livro livro : livros) {
            if (livro.getId()==id) {
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }
}
