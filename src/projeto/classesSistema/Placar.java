/*
 * Classe criada para auxiliar o armazenamento dos dados durante o campeonato   
 * Esta classe lida com placar de um time apenas
 *
 * Criado para o projeto interdiciplinar II da universidade anhembi morumbi no ano de 2016
 * 
 * Autores:   
 * Henrique Alves Conzatti
 * Ra: 20686577
 * Egerton Maciel
 * Ra: 20709502
 * Michael Arcângelo
 * Ra: 20714553
 * Rafael Sommer
 * Ra: 20709887
 *
 */

package projeto.classesSistema;

public class Placar {
    
    // armazena gols durante o campeonato
    private int golsMarcados;
    private int golsSofridos;
    // armazena pontuação durante campeonato
    private int pontuação;
    // relaciona time com estes dados
    private Time time;

    public Placar(Time timePlacar){
       /* */ 
        setPontuação(0);
        setGolsMarcados(0);
        setGolsSofridos(0);
        // armazena objeto time 
        setTime(timePlacar);
    }
    
    
    
    //Metodo que ira setar valores por partida
    public void setPartida(int golMarcado, int golSofrido){
         // incrementa pontuação caso ganhe ou empate
        if(golMarcado > golSofrido )
            setPontuação(getPontuação()+3);
        else if (golMarcado == golSofrido)
            setPontuação(getPontuação()+1);
        
        // incrementa gols marcados e sofridos 
        setGolsMarcados(getGolsMarcados()+golMarcado);
        setGolsSofridos(getGolsSofridos()+golSofrido);
        
    }
    
    public int getSaldoGols(){
        //subtrai gols sofridos de gols marcados e retorna resultado
        return getGolsMarcados() - getGolsSofridos();
    }
    
    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setPontuação(int pontuação) {
        this.pontuação = pontuação;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
    
}
