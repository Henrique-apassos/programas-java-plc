public class Personagem{
    private double vidaAtual;
    private double vidaMaxima;
    private double energiaAtual;
    private double energiaMaxima;
    private TipoEnergia tipo;

    public Personagem(double pontos_saude, TipoEnergia tipo, double pontos_energia){
        // Considera que inicializa com a saúde e energia máxima
        this.vidaAtual = pontos_saude;
        this.vidaMaxima = pontos_saude;

        this.tipo = tipo;
        this.energiaAtual = pontos_energia;
        this.energiaMaxima = pontos_energia;
        

    }

    public double getVidaAtual(){
        return vidaAtual;
    }
    public double getEnergiaAtual(){
        return energiaAtual;
    }
    public double getVidaMaxima(){
        return vidaMaxima;
    }
    public double getEnergiaMaxima(){
        return energiaMaxima;
    }
    public TipoEnergia getTipo(){
        return tipo;
    }

    public void setVidaAtual(double vida){
        this.vidaAtual = vida;
    }
    public void setEnergiaAtual(double energia){
        this.energiaAtual = energia;
    }

    public void sofrerDano(double dano){ // Função para o personagem perder vida
        this.vidaAtual -= dano;
    }
    public void usarEnergia(double custo){ // Função para usar energia do personagem
        this.energiaAtual -= custo;
    }
}