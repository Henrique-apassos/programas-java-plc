public class JogadorATP {
    private double pontos;
    private String nome;

    public JogadorATP(String nome, double pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public synchronized void adicionarPontos(double valor){
        this.pontos += valor;
        System.out.println(Thread.currentThread().getName() + " adicionou " + valor +" pontos para " + this.nome + ". | O total ficou " + this.pontos);
    }
    
    public synchronized void removerPontos(double valor) throws PontosInsuficientesException{
        if(valor > this.pontos){
            PontosInsuficientesException e = new PontosInsuficientesException(this.nome);
            throw e;
        }
        else{
            this.pontos -= valor;
            System.out.println(Thread.currentThread().getName() + " removeu " + valor +" pontos para " + this.nome + ". | O total ficou " + this.pontos);
        }
    }

    public double getPontos(){
        return pontos;
    }
    public String getNome(){
        return nome;
    }
}
