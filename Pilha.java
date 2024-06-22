public class Pilha<T> {
    private No<T> topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(T data) {
        No<T> novoNo = new No<>(data);
        if (estaVazia()) {
            topo = novoNo;
        } else {
            novoNo.setProximo(topo);
            topo = novoNo;
        }
        tamanho++;
    }

    public T desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        T data = topo.getData();
        topo = topo.getProximo();
        tamanho--;
        return data;
    }

    public T elementoTopo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.getData();
    }

    public void imprimirPilha() {
        No<T> atual = topo;
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
