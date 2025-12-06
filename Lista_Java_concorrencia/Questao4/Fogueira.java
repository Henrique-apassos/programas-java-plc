public class Fogueira implements Restauracao {
    private double eficiencia;

    public Fogueira(double eficiencia){
        this.eficiencia = eficiencia;
    }


    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada){

        double recupera = quantidadeRecuperada + personagem.getVidaAtual();
        if (recupera > personagem.getVidaMaxima()) {
            personagem.setVidaAtual(personagem.getVidaMaxima());
        } else {
            personagem.setVidaAtual(recupera);
        }
        
        calcularDuracao(quantidadeRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada){
        String mensagem;
        mensagem = "Foi recuperado " + quantidadeRecuperada + " Pontos de vida em um descanso de " + (quantidadeRecuperada/eficiencia) + "s";
        System.out.println(mensagem);
    }
    
    public double getEficiencia(){
        return eficiencia;
    }
    public void setEficiencia(double eficiencia){
        this.eficiencia = eficiencia;
    }
}