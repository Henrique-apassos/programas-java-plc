public class PontosInsuficientesException extends Exception {
    public PontosInsuficientesException(String id ){
        super("Pontos insuficientes em " + id );
    }
}
