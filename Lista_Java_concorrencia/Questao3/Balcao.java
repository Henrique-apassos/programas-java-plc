public class Balcao {
    private String nome;
    private int capacidade;
    private Fila<Ingrediente> buffer;

    public Balcao(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
        this.buffer = new Fila<>(capacidade);
    }

    public synchronized void colocar(Ingrediente ingrediente) throws InterruptedException{
        while(buffer.isFull()){
            wait();
            System.out.println("Fila cheia! Aguardando...");
        }

        buffer.push(ingrediente);
        System.out.println("Produzido: " + ingrediente.getNome());
        notifyAll();
    }

    public synchronized void retirar() throws InterruptedException{
        while(buffer.isEmpty()){
            wait();
            System.out.println("Fila Vazia! Esperando...");
        }

        Ingrediente ingrediente = buffer.pop();

        System.out.println("Prato finalizado " + this.nome + " com o ingrediente " + ingrediente.getNome());
        notifyAll();
    }

    public int getCapacidade(){
        return capacidade;
    }
    public String getNome(){
        return nome;
    }
}
