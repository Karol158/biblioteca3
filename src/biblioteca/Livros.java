package biblioteca;


public  class Livros {
    private String capa;
    private String nome_livro;
    private String nome_autor;
    private int ano_escrito;
    private String genero;
    private int ano_publicado;
    
    Livros(String capa,String nome_livro,String nome_autor,int ano_escrito,String genero,int ano_publicado){
    this.capa=capa;
    this.nome_livro=nome_livro;
    this.nome_autor=nome_autor;
    this.ano_escrito=ano_escrito;
    this.genero=genero;
    this.ano_publicado=ano_publicado;
    }
     public String getCapa() {
        return this.capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getNome_livro() {
        return this.nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getNome_autor() {
        return this.nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public int getAno_escrito() {
        return this.ano_escrito;
    }

    public void setAno_escrito(int ano_escrito) {
        this.ano_escrito = ano_escrito;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno_publicado() {
        return this.ano_publicado;
    }

    public void setAno_publicado(int ano_publicado) {
        this.ano_publicado = ano_publicado;
    }
    
    
}
