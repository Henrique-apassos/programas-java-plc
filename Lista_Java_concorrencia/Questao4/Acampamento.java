public class Acampamento implements Restauracao {
    private double eficiencia;

    public Acampamento(double eficiencia){
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) throws EnergiaIncompatívelException{
        if(personagem.getTipo() == TipoEnergia.ESTAMINA){
            double recupera = quantidadeRecuperada + personagem.getVidaAtual();
            if(recupera > personagem.getEnergiaMaxima()){
                personagem.setEnergiaAtual(personagem.getEnergiaMaxima());
            }
            else{
                personagem.setEnergiaAtual(recupera);
            }
            calcularDuracao(quantidadeRecuperada);
        }
        else{
            EnergiaIncompatívelException e;
            e = new EnergiaIncompatívelException();
            throw e;
        }
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada){
        String mensagem;
        mensagem = "Foi recuperado " + quantidadeRecuperada + " Pontos de energia em um descanso de " + (quantidadeRecuperada/eficiencia) + "s";
        System.out.println(mensagem);
    }

    public double getEficiencia(){
        return eficiencia;
    }
    public void setEficiencia(double eficiencia){
        this.eficiencia = eficiencia;
    }
}
