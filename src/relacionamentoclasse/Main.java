package relacionamentoclasse;

public class Main {
	public static void main(String[] args) {
	
	    Biblioteca biblioteca1 = new Biblioteca();
	    Livro livro1 = new Livro();
	    Livro livro2 = new Livro();
	    Autor autor1 = new Autor();
	    Leitor leitor1 = new Leitor();
	    
	    biblioteca1.setNomeBiblioteca("Municipal José Alves");
	    biblioteca1.setEndereco("Rua dos Bobos");
	    Livro[] livros = {livro1, livro2};
	    biblioteca1.setLivros(livros);    
	   
	    livro1.setNomeLivro("Monalisa");
	    livro1.setEditora("Vevo");
	    livro1.setPaginas("400");
	    livro1.setAutores(new Autor[] {autor1}); 
	   
	    livro2.setNomeLivro("Que nem maré");
	    livro2.setEditora("MTV");
	    livro2.setPaginas("198");
	    livro2.setAutores(new Autor[] {autor1}); 
	    
	    autor1.setNomeAutor("Jorge Vercilio");
	    autor1.setLivrosEscritos(new Livro[] {livro1, livro2}); 
	    
	    leitor1.setNomeLeitor("Abraão");
	    leitor1.setEnderecoLeitor("Rua A");
	    leitor1.setIdLeitor("5");
	    leitor1.setLivrosEmprestados(new Livro[] {livro1, livro2});
	    
	    biblioteca1.imprimirBiblioteca();
	    System.out.println("--------------------");
	    livro1.imprimirLivro();
	    System.out.println("--------------------");
	    livro2.imprimirLivro();
	    System.out.println("--------------------");
	    autor1.imprimirAutor();
	    System.out.println("--------------------");
	    leitor1.imprimirLeitor();
	    System.out.println("--------------------");
	  }
}
