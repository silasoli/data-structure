public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void enfileirar(T data) {
        No<T> novoNo = new No<>(data);
        if (estaVazia()) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        T data = inicio.getData();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return data;
    }

    public T primeiroElemento() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return inicio.getData();
    }

    public void imprimirFila() {
        No<T> atual = inicio;
        while (atual != null) {
            Livro livro = (Livro) atual.getData(); // Cast para Livro
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Número de Páginas: " + livro.getNumPaginas());
            System.out.println("--------------------");
            atual = atual.getProximo();
        }
    }
}
