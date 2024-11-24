package biblioteca;

public class Opiniao extends Livros {
    private String opiniao;


    Opiniao(String capa,String nome_livro,String nome_autor,String ano_escrito,String genero,String ano_publicado,String opiniao){
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
        return super.getCapa();
    }

    @Override
    public void setCapa(String capa) {
        super.setCapa(capa);
    }

    @Override
    public String getNomelivro() {
        return super.getNomelivro();
    }

    @Override
    public void setNomelivro(String nome_livro) {
        super.setNomelivro(nome_livro);
    }

    @Override
    public String getNomeautor() {
        return super.getNomeautor();
    }

    @Override
    public void setNomeautor(String nome_autor) {
        super.setNomeautor(nome_autor);
    }

    @Override
    public String getAnoescrito() {
        return super.getAnoescrito();
    }

    @Override
    public void setAnoescrito(String ano_escrito) {
        super.setAnoescrito(ano_escrito);
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public String getAnopublicado() {
        return super.getAnopublicado();
    }

    @Override
    public void setAnopublicado(String ano_publicado) {
        super.setAnopublicado(ano_publicado);
    }
}

