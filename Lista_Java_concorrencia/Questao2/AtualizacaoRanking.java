public class AtualizacaoRanking extends Thread {
    private JogadorATP jogador;
    private boolean ehGanho; // true = adiciona pontos, false = remove pontos 
    private double valor;

    public AtualizacaoRanking(JogadorATP jogador, boolean ehGanho, double valor){
        this.jogador = jogador;
        this.ehGanho = ehGanho;
        this.valor = valor;
    }

    @Override
    public void run(){
        try{
            if(ehGanho){
                jogador.adicionarPontos(valor);
            }
            else{
                jogador.removerPontos(valor);
            }
        }
        catch(PontosInsuficientesException e){
            System.out.println("Erro na " + Thread.currentThread().getName() + ": " + e.getMessage());
        }
    }


    public JogadorATP getJogador(){
        return this.jogador;
    }
    
    public boolean getEhGanho(){
        return this.ehGanho;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
