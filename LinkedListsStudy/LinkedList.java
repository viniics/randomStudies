package LinkedListThrowaway;

public class LinkedList<T> {
    private Node<T> inicio;
    private int tamanho;
    private Node<T> end;
    private Node<T> current;

    public void adiciona(T elemento) {
        Node<T> celula = new Node<T>(elemento);
        if (inicio == null) {
            this.inicio = celula;
            current = inicio;
        } else {
            end.setNext(celula);
            celula.setPrev(end);
        }
        this.end = celula;
        this.tamanho++;
    }

    public Node procuraElemento(T elemento) {
        Node atual = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (atual.getElemento().equals(elemento)) {
                return atual;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public Node procuraPorPosicao(int posicao){
        Node atual = inicio;
        for (int i=0;i<posicao-1;i++){
            atual=atual.getNext();
        }
        return atual;

    }

    public String encontraPosicao(T elemento) { 
        if (tamanho == 0) {
            return "A lista está vazia";
        }
        Node atual = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (atual.getElemento().equals(elemento)) {
                return "O elemento está na posicão " + (i+1) + ".";
            }
            atual = atual.getNext();
        }
        return "Elemento não existe na lista.";
    }

    public int getTamanho() {
        return tamanho;
    }

    public Node<T> getEnd() {
        return end;
    }

    @Override
    public String toString() {
        // [1,2,3,4,5]
        if (this.tamanho == 0) {
            return "[]";
        }
        String out = "[";
        for (int i = 0; i < this.tamanho - 1; i++) {
            out += current.getElemento() + ",";
            current = current.getNext();
        }
        return out + current.getElemento() + "]";
    }

}