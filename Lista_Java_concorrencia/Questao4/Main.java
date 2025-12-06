public class Main {
    public static void main() {
        // Restauração de vida
        Personagem lola = new Personagem(1000, TipoEnergia.ESTAMINA, 1000);
        lola.sofrerDano(500);
        System.out.println("Vida de Lola: " + lola.getVidaAtual());
        Fogueira postinho = new Fogueira(50);
        postinho.restaurar(lola, 250);
        System.out.println("Vida de Lola: " + lola.getVidaAtual());

        // Recuperacao de energia bem sucedida
        Personagem oMago = new Personagem(20000, TipoEnergia.MANA, 50000);
        oMago.sofrerDano(0); // O Mago é implacável
        oMago.usarEnergia(10000);
        FonteMágica sofa = new FonteMágica(1000);
        System.out.println("\nEnergia do Mago: " + oMago.getEnergiaAtual());
        try{
            sofa.restaurar(oMago, 5000);
        }
        catch(EnergiaIncompatívelException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Energia do Mago: " + oMago.getEnergiaAtual());
        
        lola.usarEnergia(150);
        Acampamento cama = new Acampamento(50);
        System.out.println("\nEnergia de Lola: " + lola.getEnergiaAtual());
        try{
            cama.restaurar(lola, 200);
        }
        catch(EnergiaIncompatívelException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Energia de Lola: " + lola.getEnergiaAtual());

        // Recuperação de energia incompatível
        lola.usarEnergia(10);
        System.out.println("\nEnergia de Lola: " + lola.getEnergiaAtual());
        try{
            sofa.restaurar(lola, 5000);
        }
        catch(EnergiaIncompatívelException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Energia de Lola: " + lola.getEnergiaAtual());
    }
}
