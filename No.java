class No<T> {
    private T data;
    private No<T> proximo;

    public No(T data) {
        this.data = data;
        this.proximo = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}
