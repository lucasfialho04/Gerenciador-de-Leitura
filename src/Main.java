

import java.util.List;

import model.Livro;
import service.BibliotecaService;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("+ esperto que o diabo","napoleon" );
        Livro livro2 = new Livro("Dom Casmurro","Machado de Assis" );
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas ","Machado de Assis" );

        BibliotecaService livros = new BibliotecaService();
        livros.adicionarLivro(livro1);
        livros.adicionarLivro(livro2);
        livros.adicionarLivro(livro3);

        List<Livro> listarLivros = livros.listarLivros();
        System.out.println(listarLivros);
    }
}
