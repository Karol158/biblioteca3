package biblioteca;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner input=new Scanner(System.in);
       System.out.println("Digite o tipo de capa do livro:");
        String capa = input.nextline();
        System.out.println("Digite o nome do livro:")
        String nome_livro=input.nextline();
        System.out.println("Digite o nome do autor:");
        String nome_autor = input.nextline();
        System.out.println("Digite o ano que o livro foi escrito:");
        String ano_escrito = input.nextline();
        System.out.println("Digite o genero literário:");
        String genero = input.nextline();
        System.out.println("Digite o ano que foi publicado:");
        String ano_publicado = input.nextline();
        System.out.println("Digite a data que o livro foi pego:");
        String data_pegoulivro = input.nextline();
        System.out.println("Digite a data que foi devolvido:");
        String data_devolucao = input.nextline();
        System.out.println("Digite o nome do leitor");
         String nome_leitor = input.nextline();
        System.out.println("Digite a sua opiniao sobre o livro");
         String opiniao = input.nextline();
        
       System.out.println("Tipo de capa dp livro:" +capa);
       System.out.println("O nome do livro:"+nome_livro);
       System.out.println("O nome do autor:"+nome_autor);
       System.out.println("O ano que o livro foi escrito:"+ano_escrito);
       System.out.println("O genero literáro:"+genero);
       System.out.println("O ano que foi publicado:"+ano_publicado);
       System.out.println("A data que o livro foi pego:"+data_pegoulivro);
       System.out.println("A data que o livro foi devolvido:"+data_devolucao);
       System.out.println("O nome do leitor:"+nome_leitor);
       System.out.println("Opiniao sobre o livro:"+opiniao);



    }
}
