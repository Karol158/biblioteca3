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
}
