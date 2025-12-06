import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        JogadorATP jogador = new JogadorATP("P1", 100);
        System.out.println("Pontos inicial do jogador " + jogador.getNome() + ": " + jogador.getPontos() + " pontos");
        List<Thread> threads = new ArrayList<>();

        // Testar ganhos concorrentes
        for(int i=0; i < 10; i++){
            threads.add(new AtualizacaoRanking(jogador, true, i+5));
        }

        // Testar perdas concorrentes
        for(int i=0; i<10; i++){
            threads.add(new AtualizacaoRanking(jogador, false, i+1));
        }

        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Perder além do limite
        AtualizacaoRanking aoInfinito = new AtualizacaoRanking(jogador, false, 1000);
        aoInfinito.start();
        try {
            aoInfinito.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verificar ranking consistente
        System.out.println("Pontos atuais do jogador " + jogador.getNome() + " : " + jogador.getPontos() + " Pontos");

        Thread[] ganhaPerde = new Thread[10];
        for(int i=0; i<5; i++){
            ganhaPerde[i] = new AtualizacaoRanking(jogador, true, i+1);
        }
        for(int j=5; j<10; j++){
            ganhaPerde[j] = new AtualizacaoRanking(jogador, false, j-4);
        }

        for(int i=0; i < 10; i++){
            ganhaPerde[i].start();
        }
        for(int i=0; i < 10; i++){
            try{
                ganhaPerde[i].join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Pontuação final de " + jogador.getNome() + " = " + jogador.getPontos() + " Pontos");
    }
}
