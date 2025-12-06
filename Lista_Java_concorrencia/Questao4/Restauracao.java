public interface Restauracao {
    public void restaurar(Personagem personagem, double quantidadeRecuperada) throws EnergiaIncompatívelException;
    public void calcularDuracao(double quantidadeRecuperada);
}
