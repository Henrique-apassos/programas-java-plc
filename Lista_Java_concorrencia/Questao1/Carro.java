class Carro extends Viagem {

    public Carro(String destino, Double distancia, Double precoBase){
        super(destino, distancia, precoBase);
    }

    @Override
    public Double calcularValor(){
        return this.getPrecoBase() + (this.getDistanciaEmKm() * 0.5);
    }

    @Override
    public String tempoDeViagem(){
        return "Tempo de viagem até " + this.getDestino() + " é "+ this.duracaoViagem() + " horas.";
    }

    public Integer duracaoViagem(){
        double duracao = this.getDistanciaEmKm() / 80;
        int duracao_min =  (int) duracao;
        return duracao_min;
    }
}
