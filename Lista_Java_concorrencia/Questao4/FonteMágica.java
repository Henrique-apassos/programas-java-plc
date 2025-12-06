public class FonteMágica implements Restauracao {
    private double eficiencia;

    public FonteMágica(double eficiencia){
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) throws EnergiaIncompatívelException{
        if(personagem.getTipo() == TipoEnergia.MANA){
            double recupera = quantidadeRecuperada + personagem.getEnergiaAtual();
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
        mensagem = "Foi recuperado " + quantidadeRecuperada + " Pontos de MANA em um descanso de " + (quantidadeRecuperada/eficiencia) + "s";
        System.out.println(mensagem);
    }

    public double getEficiencia(){
        return eficiencia;
    }
    public void setEficiencia(double eficiencia){
        this.eficiencia = eficiencia;
    }
}
