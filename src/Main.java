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
             System.out.println("Menu funcionario");
             break;
         case 2:
             System.out.println("Menu cliente");
             break;
         case 3:
             System.out.println("Menu livro");
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


