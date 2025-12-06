public class Aprendiz implements Runnable {
    private Balcao balcao;
    private int desempenho;
    
    public Aprendiz(Balcao balcao, int desempenho){
        this.balcao = balcao;
        this.desempenho = desempenho;
    }

    public void run(){
        int contadorGlobal = 1;
        try {
            while (true) {
                System.out.println("Aprendiz " + Thread.currentThread().getName() + " Iniciando produção de " + desempenho + " Ingredientes");
                // Produção por iteração
                for(int i=0; i<desempenho; i++){
                    Ingrediente ingrediente = new Ingrediente("Ingrediente-" + contadorGlobal++);

                    balcao.colocar(ingrediente);
                }
                System.out.println("Aprendiz terminou a produção. Descansando...");
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
