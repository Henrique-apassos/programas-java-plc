import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um cenário para rodar:");
        System.out.println("1 - Balcão com pouco espaço (Gargalo de Memória)");
        System.out.println("2 - Produção Frenética (Aprendizes rápidos vs Chefes lentos)");
        System.out.println("3 - Consumo Voraz (Chefes rápidos vs Aprendizes lentos)");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                cenarioBalcaoPequeno();
                break;
            case 2:
                cenarioAltaProducao();
                break;
            case 3:
                cenarioAltoConsumo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }

    /*
     * CENÁRIO 1: Balcão com pouco espaço.
     * O Aprendiz coloca 1, o balcão enche, ele espera.
     * O Chefe tira 1, o balcão esvazia, ele espera.
     * Resultado: O sistema trava constantemente (througput baixo).
     */
    private static void cenarioBalcaoPequeno() {
        System.out.println("\n>>> Iniciando: BALCÃO COM POUCO ESPAÇO (Capacidade 1) <<<");
        
        // Balcão cabe apenas 1 prato
        Balcao balcao = new Balcao("Balcão Minusculo", 1); 

        // Aprendiz tenta fazer lotes de 2 (vai travar na metade sempre)
        Aprendiz aprendiz = new Aprendiz(balcao, 2);
        
        // Chefe tenta comer lotes de 2
        Chefe chefe = new Chefe(balcao, 2);

        new Thread(aprendiz).start();
        new Thread(chefe).start();
    }

    /*
     * CENÁRIO 2: Capacidade de produção MUITO superior.
    * O Aprendiz passará a maior parte do tempo vendo a mensagem "Fila cheia! Aguardando...".
     * Resultado: O Balcão fica sempre CHEIO.
     */
    private static void cenarioAltaProducao() {
        System.out.println("\n>>> Iniciando: ALTA PRODUÇÃO vs BAIXO CONSUMO <<<");

        Balcao balcao = new Balcao("Balcão Grande", 10);

        // Aprendiz: Tenta colocar 15 pratos de uma vez (Lote gigante)
        Aprendiz aprendiz = new Aprendiz(balcao, 15);
        
        // Chefe: Come apenas 1 prato por vez e descansa
        Chefe chefe = new Chefe(balcao, 1);

        new Thread(aprendiz).start();
        new Thread(chefe).start();
    }

    /*
     * CENÁRIO 3: Capacidade de consumo MUITO superior.
     * O Chefe passará a maior parte do tempo vendo a mensagem "Fila Vazia! Esperando...".
     * Resultado: O Balcão fica sempre VAZIO.
     */
    private static void cenarioAltoConsumo() {
        System.out.println("\n>>> Iniciando: ALTO CONSUMO vs BAIXA PRODUÇÃO <<<");

        Balcao balcao = new Balcao("Balcão Médio", 5);

        // Aprendiz: Faz apenas 1 prato por vez e descansa (Lento)
        Aprendiz aprendiz = new Aprendiz(balcao, 1);
        
        // Chefe: Tenta comer 10 pratos de uma vez (Voraz)
        Chefe chefe = new Chefe(balcao, 10);

        new Thread(aprendiz).start();
        new Thread(chefe).start();
    }
}