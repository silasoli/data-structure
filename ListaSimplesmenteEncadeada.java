public class ListaSimplesmenteEncadeada<T> {
    private No<T> cabeca;
    private int tamanho;

    public ListaSimplesmenteEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return cabeca == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inserirCabeca(T data) {
        No<T> novoNo = new No<>(data);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
        tamanho++;
    }

    public void inserirCauda(T data) {
        No<T> novoNo = new No<>(data);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No<T> atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void imprimirLista() {
        No<T> atual = cabeca;
        while (atual != null) {
            Livro livro = (Livro) atual.getData(); // Cast para Livro
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de páginas: " + livro.getNumPaginas());
            System.out.println("--------------------");
            atual = atual.getProximo();
        }
    }
}