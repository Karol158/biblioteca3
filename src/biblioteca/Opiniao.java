package biblioteca;

public class Opiniao extends Livros {
    private String opiniao;


    Opiniao(String capa,String nome_livro,String nome_autor,int ano_escrito,String genero,int ano_publicado,String opiniao){
        super(capa,nome_livro,nome_autor,ano_escrito,genero,ano_publicado);
        this.opiniao=opiniao;
    }
   public String getOpiniao(){
    return this.opiniao;
   }
   public void setOpiniao(String opiniao){
    this.opiniao=opiniao;
   }
   @Override
    public String getCapa() {
        return getCapa();
    }

    @Override
    public void setCapa(String capa) {
       setCapa(capa);
    }

    @Override
    public String getNomelivro() {
        return getNomelivro();
    }

    @Override
    public void setNomelivro(String nome_livro) {
        setNomelivro(nome_livro);
    }

    @Override
    public String getNomeautor() {
        return getNomeautor();
    }

    @Override
    public void setNomeautor(String nome_autor) {
        setNomeautor(nome_autor);
    }

    @Override
    public int getAnoescrito() {
        return getAnoescrito();
    }

    @Override
    public void setAnoescrito(int ano_escrito) {
       setAnoescrito(ano_escrito);
    }

    @Override
    public String getGenero() {
        return getGenero();
    }

    @Override
    public void setGenero(String genero) {
        setGenero(genero);
    }

    @Override
    public int getAnopublicado() {
        return getAnopublicado();
    }

    @Override
    public void setAnopublicado(int ano_publicado) {
        setAnopublicado(ano_publicado);
    }
}
