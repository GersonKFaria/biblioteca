import javax.print.attribute.standard.CopiesSupported;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 Locacao locacao = new Locacao();
 int opcao;

 do {
     System.out.println("1 - Cadastrar funcionario");
     System.out.println("2 - Cadastrar Cliente");
     System.out.println("3 - Cadastras Livro");
     System.out.println("4 - Mostrar dados do cadastro");
     System.out.println("5 - ir para locacao");
     System.out.println("0 - Sair");
     System.out.println("Digite a opção");

     opcao = scanner.nextInt();

     switch (opcao){
         case 1:
             System.out.println("Bem vindo ao cadastro de funcionário");
             System.out.println("Digite seu nome");
             locacao.getFuncionario().setNome(scanner.next());

             System.out.println("Digite seu CPF");
             locacao.getFuncionario().setCpf(scanner.nextLong());

             System.out.println("Digite seu endereco");
             locacao.getFuncionario().getEndereco().setRua(scanner.next());
             locacao.getFuncionario().getEndereco().setBairro(scanner.next());
             locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());

             System.out.println("digite seu salario");
             locacao.getFuncionario().setSalario(scanner.nextInt());

             System.out.println("Digite seu cargo");
             locacao.getFuncionario().setCargo(scanner.next());

             break;
         case 2:
             System.out.println("bem vindo ao cadastro de cliente");
             System.out.println("Menu cliente");

             System.out.println("digite o nome do cliente");
             locacao.getCliente().setNome(scanner.next());

             System.out.println("digite o código");
             locacao.getCliente().setCodigo(scanner.nextInt());

             System.out.println("digite o CPF do cliente");
             locacao.getCliente().setCpf(scanner.nextInt());

             System.out.println("digite o endereço do cliente");
             locacao.getCliente().getEndereco().setBairro(scanner.next());
             locacao.getCliente().getEndereco().setNumero(scanner.nextInt());
             locacao.getCliente().getEndereco().setRua(scanner.next());

             break;
         case 3:

             System.out.println("Bem vindo ao Cadastro dos Livros");
             System.out.println("Menu livro");

             System.out.println("Digite o titulo do livro");
             locacao.getLivro().setTitulo(scanner.next());

             System.out.println("Digite o genero do Livro");
             locacao.getLivro().setGenero(scanner.next());

             System.out.println("Digite o autor do Livro");
             locacao.getLivro().setAutor(scanner.next());

             break;
         case 4:

             System.out.println("Menu dados do cadastro");

             break;
         case 5:
             System.out.println("Menu locacao");
             break;
         default:
             System.out.println("Opcao inválida");
     }

      }
 while  (opcao != 9);

    }
}


