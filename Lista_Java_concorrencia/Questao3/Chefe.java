public class Chefe implements Runnable {
    private Balcao balcao;
    private int desempenho;

    public Chefe(Balcao balcao, int desempenho){
        this.balcao = balcao;
        this.desempenho = desempenho;
    }

    @Override
    public void run(){
        try{
            while(true){
                System.out.println("Chefe vai finalizar " + desempenho + " pratos");
                for (int i = 0; i < desempenho; i++){
                    balcao.retirar();

                }
                System.out.println("Chefe terminou de produzir os pratos. Descansando...");
                Thread.sleep(500); // Intervalo entre iterações
            }
        }
        catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
    }

    public int getDesempenho(){
        return desempenho;
    }
    public void setDesempenho(int desempenho){
        this.desempenho = desempenho;
    }
}
