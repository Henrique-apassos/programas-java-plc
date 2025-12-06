public class Main {
    public static void main(){
        String destino = "Salvador";
        Double distanciaKm = 900.0;
        Double precoBase =  distanciaKm/3; // Preco que muda dependendo da distância

        ônibus viagemÔnibus = new ônibus(destino, distanciaKm, precoBase);
        System.out.println("Transporte: Ônibus");
        System.out.println("Destino: " + viagemÔnibus.getDestino());
        System.out.println("Preço da viagem: " + "R$ " + viagemÔnibus.calcularValor());
        System.out.println("Tempo estimado: " + viagemÔnibus.tempoDeViagem());

        System.out.println("");

        Avião viagemAvião = new Avião(destino,distanciaKm,precoBase);
        System.out.println("Transporte: Avião");
        System.out.println("Destino: " + viagemAvião.getDestino());
        System.out.println("Preço da viagem: " + "R$ " + viagemAvião.calcularValor());
        System.out.println("Tempo estimado: " + viagemAvião.tempoDeViagem());

        System.out.println("");

        Carro viagemCarro = new Carro(destino, distanciaKm, precoBase);
        System.out.println("Transporte: Carro");
        System.out.println("Destino: " + viagemCarro.getDestino());
        System.out.println("Preço da viagem: " + "R$ " + viagemCarro.calcularValor());
        System.out.println("Tempo estimado: " + viagemCarro.tempoDeViagem());

    }
}
