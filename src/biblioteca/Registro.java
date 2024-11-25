package biblioteca;

public class Registro extends Livros {
     private String data_pegoulivro;
     private String data_devolucao;
     private String nome_leitor;
     
     
     Registro(String capa, String nome_livro, String nome_autor, int ano_escrito, 
     String genero, int ano_publicado,String data_pegoulivro,String data_devolucao,String nome_leitor){
            super(capa,nome_livro,nome_autor,ano_escrito,genero,ano_publicado);
               this.data_pegoulivro=data_pegoulivro;
               this.data_devolucao=data_devolucao;
               this.nome_leitor=nome_leitor;
     }
     public String getDatapegoulivro(){
        return this.data_pegoulivro;
    }
    
    public void setDatapegoulivro(String data_pegoulivro){
        this.data_pegoulivro=data_pegoulivro;
    
    }
    public String getDatadevolucao(){
        return this.data_devolucao;
    }
    
    public void setCapa(String data_devolucao){
        this.data_devolucao=data_devolucao;
    
    }
    public String getNomeLeitor(){
        return this.nome_leitor;
    }
    
    public void setNomeLeitor(String nome_leitor){
        this.nome_leitor=nome_leitor;
    
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
    public int getAnoescrito() {
        return super.getAnoescrito();
    }

    @Override
    public void setAnoescrito(int ano_escrito) {
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
    public int getAnopublicado() {
        return super.getAnopublicado();
    }

    @Override
    public void setAnopublicado(int ano_publicado) {
        super.setAnopublicado(ano_publicado);
    }
}
