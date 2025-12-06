public class Viagem {
    private String destino;
    private Double distanciaEmKm;
    private Double precoBase;

    public Viagem(String destino, Double distancia, Double precoBase){
        this.destino = destino;
        this.distanciaEmKm = distancia;
        this.precoBase = precoBase;
    }

    public Double calcularValor(){
        return precoBase;
    } 
    
    public String tempoDeViagem(){
        return "Tempo desconhecido";
    }

    public Double getPrecoBase(){
        return precoBase;
    }
    public Double getDistanciaEmKm(){
        return distanciaEmKm;
    }

    public String getDestino(){
        return destino;
    }
}