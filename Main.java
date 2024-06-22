
// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
    // livro1.exibirInformacoes();
    // livro1.setAutor("José de Alencar");
    // livro1.exibirInformacoes();

    // Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);
    // No<Livro> noLivro = new No<Livro>(livro);
    // System.out.println(noLivro.getData().getTitulo());

    // ListaSimplesmenteEncadeada<Livro> listaLivros = new
    // ListaSimplesmenteEncadeada<Livro>();
    // listaLivros.inserirCabeca(new Livro("Dom Casmurro", "Machado de Assis",
    // 256));
    // listaLivros.inserirCauda(new Livro("Memórias Póstumas de Brás Cubas",
    // "Machado de Assis", 312));
    // System.out.println("Tamanho da lista: " + listaLivros.getTamanho());
    // System.out.println("Lista de Livros:");
    // listaLivros.imprimirLista();

    // Fila<Livro> filaLivros = new Fila<Livro>();
    // filaLivros.enfileirar(new Livro("Dom Casmurro", "Machado de Assis", 256));
    // filaLivros.enfileirar(new Livro("Memórias Póstumas de Brás Cubas", "Machado
    // de Assis", 312));
    // System.out.println("Primeiro elemento da fila: " +
    // filaLivros.primeiroElemento());
    // System.out.println("Fila está vazia? " + filaLivros.estaVazia());
    // System.out.println("Fila de Livros:");
    // filaLivros.imprimirFila();
    // System.out.println("Desenfileirando o primeiro elemento:");
    // filaLivros.desenfileirar();
    // System.out.println("Fila de Livros após desenfileirar:");
    // filaLivros.imprimirFila();

    // Pilha<Livro> pilhaLivros = new Pilha<Livro>();
    // pilhaLivros.empilhar(new Livro("Dom Casmurro", "Machado de Assis", 256));
    // pilhaLivros.empilhar(new Livro("Memórias Póstumas de Brás Cubas", "Machado de
    // Assis", 312));
    // System.out.println("Elemento no topo da pilha: " +
    // pilhaLivros.elementoTopo());
    // System.out.println("Pilha está vazia? " + pilhaLivros.estaVazia());
    // System.out.println("Pilha de Livros:");
    // pilhaLivros.imprimirPilha();
    // System.out.println("Desempilhando o elemento do topo:");
    // pilhaLivros.desempilhar();
    // System.out.println("Pilha de Livros após desempilhar:");
    // pilhaLivros.imprimirPilha();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha a estrutura de dados:");
    System.out.println("1. Lista Simplesmente Encadeada");
    System.out.println("2. Fila");
    System.out.println("3. Pilha");
    System.out.print("Opção: ");

    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:
        ListaSimplesmenteEncadeada<Livro> listaLivros = new ListaSimplesmenteEncadeada<Livro>();
        manipularLista(listaLivros, scanner);
        break;
      case 2:
        Fila<Livro> filaLivros = new Fila<Livro>();
        manipularFila(filaLivros, scanner);
        break;
      case 3:
        Pilha<Livro> pilhaLivros = new Pilha<Livro>();
        manipularPilha(pilhaLivros, scanner);
        break;
      default:
        System.out.println("Opção inválida.");
        break;
    }

    scanner.close();
  }

  public static void manipularLista(ListaSimplesmenteEncadeada<Livro> listaLivros, Scanner scanner) {
    boolean sair = false;
    while (!sair) {
      System.out.println("\nEscolha uma operação:");
      System.out.println("1. Inserir Livro na Cabeça");
      System.out.println("2. Remover Livro na Cauda");
      System.out.println("3. Imprimir Lista");
      System.out.println("4. Sair");
      System.out.print("Opção: ");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o título do livro: ");
          scanner.nextLine(); // Consumir a quebra de linha
          String titulo1 = scanner.nextLine();
          System.out.print("Digite o autor do livro: ");
          String autor1 = scanner.nextLine();
          System.out.print("Digite o número de páginas do livro: ");
          int numPaginas1 = scanner.nextInt();
          listaLivros.inserirCabeca(new Livro(titulo1, autor1, numPaginas1));
          break;
        case 2:
          System.out.print("Digite o título do livro: ");
          scanner.nextLine(); // Consumir a quebra de linha
          String titulo2 = scanner.nextLine();
          System.out.print("Digite o autor do livro: ");
          String autor2 = scanner.nextLine();
          System.out.print("Digite o número de páginas do livro: ");
          int numPaginas2 = scanner.nextInt();
          listaLivros.inserirCauda(new Livro(titulo2, autor2, numPaginas2));
          break;
        case 3:
          listaLivros.imprimirLista();
          break;
        case 4:
          sair = true;
          System.out.println("Encerrando o programa.");
          break;
        default:
          System.out.println("Opção inválida.");
          break;
      }
    }
  }

  public static void manipularFila(Fila<Livro> filaLivros, Scanner scanner) {
    boolean sair = false;
    while (!sair) {
      System.out.println("\nEscolha uma operação:");
      System.out.println("1. Enfileirar Livro");
      System.out.println("2. Desenfileirar Livro");
      System.out.println("3. Mostrar Primeiro da Fila");
      System.out.println("4. Verificar se a Fila está vazia");
      System.out.println("5. Imprimir Fila");
      System.out.println("6. Sair");
      System.out.print("Opção: ");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o título do livro: ");
          scanner.nextLine(); // Consumir a quebra de linha
          String titulo1 = scanner.nextLine();
          System.out.print("Digite o autor do livro: ");
          String autor1 = scanner.nextLine();
          System.out.print("Digite o número de páginas do livro: ");
          int numPaginas1 = scanner.nextInt();
          filaLivros.enfileirar(new Livro(titulo1, autor1, numPaginas1));
          break;
        case 2:
          filaLivros.desenfileirar();
          break;
        case 3:
          Livro primeiro = filaLivros.primeiroElemento();
          if (primeiro != null) {
            System.out.println("Primeiro da Fila: " + primeiro.getTitulo());
          } else {
            System.out.println("A Fila está vazia.");
          }
          break;
        case 4:
          System.out.println("Fila está vazia? " + filaLivros.estaVazia());
          break;
        case 5:
          System.out.println("Conteúdo da Fila:");
          filaLivros.imprimirFila();
          break;
        case 6:
          sair = true;
          System.out.println("Encerrando o programa.");
          break;
        default:
          System.out.println("Opção inválida.");
          break;
      }
    }
  }

  public static void manipularPilha(Pilha<Livro> pilhaLivros, Scanner scanner) {
      boolean sair = false;
      while (!sair) {
          System.out.println("\nEscolha uma operação:");
          System.out.println("1. Empilhar Livro");
          System.out.println("2. Desempilhar Livro");
          System.out.println("3. Mostrar Elemento no Topo");
          System.out.println("4. Verificar se a Pilha está vazia");
          System.out.println("5. Imprimir Pilha");
          System.out.println("6. Sair");
          System.out.print("Opção: ");

          int opcao = scanner.nextInt();

          switch (opcao) {
              case 1:
                  System.out.print("Digite o título do livro: ");
                  scanner.nextLine(); // Consumir a quebra de linha
                  String titulo = scanner.nextLine();
                  System.out.print("Digite o autor do livro: ");
                  String autor = scanner.nextLine();
                  System.out.print("Digite o número de páginas do livro: ");
                  int numPaginas = scanner.nextInt();
                  pilhaLivros.empilhar(new Livro(titulo, autor, numPaginas));
                  break;
              case 2:
                  pilhaLivros.desempilhar();
                  break;
              case 3:
                  Livro topo = pilhaLivros.elementoTopo();
                  if (topo != null) {
                      System.out.println("Elemento no Topo: " + topo.getTitulo());
                  } else {
                      System.out.println("A Pilha está vazia.");
                  }
                  break;
              case 4:
                  System.out.println("Pilha está vazia? " + pilhaLivros.estaVazia());
                  break;
              case 5:
                  System.out.println("Conteúdo da Pilha:");
                  pilhaLivros.imprimirPilha();
                  break;
              case 6:
                  sair = true;
                  System.out.println("Encerrando o programa.");
                  break;
              default:
                  System.out.println("Opção inválida.");
                  break;
          }
      }
  }

}
