class ônibus extends Viagem {
    
    public ônibus(String destino, Double distancia, Double precoBase){
        super(destino, distancia, precoBase);
    }

    @Override
    public Double calcularValor(){
        return this.getPrecoBase() + (this.getDistanciaEmKm() * 0.3);
    }

    @Override
    public String tempoDeViagem(){
        return "Tempo de viagem até " + this.getDestino() + " é "+ this.duracaoViagem() + " horas.";
    }

    public Integer duracaoViagem(){
        double duracao = this.getDistanciaEmKm() / 80;
        int duracao_min =  (int) duracao; // Pega a parte inteira do tempo de duração (funcao floor)
        return duracao_min;
    }
}
