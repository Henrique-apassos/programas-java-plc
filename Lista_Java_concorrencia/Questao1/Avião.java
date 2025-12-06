class Avião extends Viagem{

    public Avião(String destino, Double distancia, Double precoBase){
        super(destino, distancia, precoBase);
    }

    @Override
    public Double calcularValor(){
        return this.getPrecoBase() + this.getDistanciaEmKm();
    }

    @Override
    public String tempoDeViagem(){
        return "Tempo de viagem até " + this.getDestino() + " é "+ this.duracaoViagem() + " horas.";
    }

    public double duracaoViagem(){
        double duracao = this.getDistanciaEmKm() / 800;
        double truncado = Math.floor(duracao * 10) / 10; // Trunca para apenas uma casa decimal
        return truncado;
    }
}