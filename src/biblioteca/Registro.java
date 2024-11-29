package biblioteca;

public class Registro extends Livros {
     private String data_pegoulivro;
     private String data_devolucao;
     private String nome_leitor;
     
     
     Registro(String capa, String nome_livro, String nome_autor, int ano_escrito, 
     String genero, int ano_publicado, String data_pegoulivro, String data_devolucao, String nome_leitor) {
         super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
         this.data_pegoulivro = data_pegoulivro;
         this.data_devolucao = data_devolucao;
         this.nome_leitor = nome_leitor;
     }
     
     public String getDataPegouLivro() {
         return this.data_pegoulivro;
     }
 
     public void setDataPegouLivro(String data_pegoulivro) {
         this.data_pegoulivro = data_pegoulivro;
     }
 
     public String getDataDevolucao() {
         return this.data_devolucao;
     }
 
     public void setDataDevolucao(String data_devolucao) {
         this.data_devolucao = data_devolucao;
     }
 
     public String getNomeLeitor() {
         return this.nome_leitor;
     }
 
     public void setNomeLeitor(String nome_leitor) {
         this.nome_leitor = nome_leitor;
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
