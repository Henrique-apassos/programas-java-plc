public class Fila < T > {
    private int max, tamanho;
    private T[] elementos;

    @SuppressWarnings("unchecked")
    public Fila(int max){
        this.tamanho = 0;
        this.max = max;
        this.elementos = ( T[] ) new Object[max];
    }

    public void push(T e){
        if(isFull()){
            throw new RuntimeException("A fila está cheia");
        }
        else{
            elementos[tamanho] = e;
            tamanho++;
        }
    }

    public T pop(){
        if(isEmpty())
            throw new RuntimeException("Fila vazia");
        T item = elementos[0]; 

        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        elementos[tamanho] = null;
        
        return item;
    }

    public boolean isFull(){
        return tamanho == max;
    }
    public boolean isEmpty(){
        return tamanho == 0;
    }
}