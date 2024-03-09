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

            switch (opcao) {
                case 1:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");
                    System.out.print("Cadastro do funcionário: \n"
                            + "Nome: ");
                    locacao.getFuncionario().setNome(scanner.next());

                    System.out.println("Digite seu CPF");
                    locacao.getFuncionario().setCpf(scanner.nextLong());

                    System.out.print("Endereço------\n"
                            + "Rua: ");
                    scanner.nextLine();
                    locacao.getFuncionario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite o numero da sua casa:");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu bairro:");
                    locacao.getFuncionario().getEndereco().setBairro(scanner.next());

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
                    do {

                        System.out.print("Selecione o cadastro na qual o mesmo queira acessar: \n"
                                + "1 - Cadastro do Funcionário: \n"
                                + "2 - Cadastro do Usuário \n"
                                + "3 - Cadastro do livro\n"
                                + "9 - Voltar ao menu principal\n"
                                + "Digite a opção desejada: ");

                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("cadastro de funcionario");
                                System.out.println(locacao.getFuncionario().toString());
                                break;

                            case 2:
                                System.out.println("cadastro de cliente");
                                System.out.println(locacao.getCliente().toString());
                                break;

                            case 3:
                                System.out.println("cadastro de livro");
                                System.out.println(locacao.getLivro().toString());
                                break;

                            default:
                                System.out.println("opcao invalia");
                        }

                    } while (opcao != 9);

                    break;
                case 5:
                    System.out.println("Menu locacao");
                    do {
                        System.out.print("\n::::::::::::::::: Sistema de Locação ::::::::::::::::::\n" +
                                "  Escolha uma opção abaixo\n" +
                                "  [1] - Locar livro\n" +
                                "  [2] - Devolver livro\n" +
                                "  [3] - Mostrar os dados do livro locado\n" +
                                "  [4] - Mostra os dados do livro devolvido\n" +
                                "  [5] - Sair da locação\n" +
                                "  Digite aqui a opção: \n");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("Insira os dados do livro");
                                System.out.println("insira o título do livro");
                                locacao.getLivro().setTitulo(scanner.next());
                                System.out.println("Insira o genero");
                                locacao.getLivro().setGenero(scanner.next());
                                System.out.println("Insira o autor do livro");
                                locacao.getLivro().setAutor(scanner.next());

                                break;

                            case 2:
                                System.out.println("Insira os dados da devolução do livro");
                                System.out.println("Insira o título do livro devolvido");
                                locacao.getLivro().setTitulo(scanner.next());
                                System.out.println("Insira o genero do livro devolvido");
                                locacao.getLivro().setTitulo(scanner.next());
                                System.out.println("insira os dados do autor do livro devolvido");
                                locacao.getLivro().setAutor(scanner.next());

                                break;

                            case 3:
                                System.out.println("Mostre os dados do livro locado");

                                System.out.println(locacao.getLivro().toString());

                                break;

                            case 4:
                                System.out.println("Mostre os dados da devolução do livro");

                                System.out.println(locacao.getLivro().toString());

                                break;
                        }


                    } while (opcao != 5);


                    break;
                default:
                    System.out.println("Opcao inválida");
            }

        }
        while (opcao != 0);

    }
}


