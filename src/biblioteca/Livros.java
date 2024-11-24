package biblioteca;


public abstract class Livros {
    private String capa;
    private String nome_livro;
    private String nome_autor;
    private String ano_escrito;
    private String genero;
    private String ano_publicado;
    
    Livros(String capa,String nome_livro,String nome_autor,String ano_escrito,String genero,String ano_publicado){
    this.capa=capa;
    this.nome_livro=nome_livro;
    this.nome_autor=nome_autor;
    this.ano_escrito=ano_escrito;
    this.genero=genero;
    this.ano_publicado=ano_publicado;
    }
    public abstract String getCapa();
    public abstract void setCapa(String capa);
    
    public abstract String getNomelivro();
    public abstract void setNomelivro(String nome_livro);
    
    public abstract String getNomeautor();
    public abstract void setNomeautor(String nome_autor);
      
    public abstract String getAnoescrito();
    public abstract void setAnoescrito(String ano_escrito);
       
    public abstract String getGenero();
    
    public abstract void setGenero(String genero);
        
    public abstract String getAnopublicado();
       
    public abstract void setAnopublicado(String ano_publicado);
    
    
}
