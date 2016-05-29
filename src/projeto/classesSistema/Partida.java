/*
 * Criado para o projeto interdiciplinar II da universidade anembi morumbi no ano de 2016
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


public class Partida {
    // Armazena numero inteiro do placar de gols do time da casa
    private int golMandante;
    //Armazena numero inteiro do placar de gols do time visitante
    private int golVisitante;
    // Armazena instancia do time da casa
    private Time timeMandante;
    // Armazena instancia do time visitante
    private Time timeVisitante;
    
    
    //Construtor
    public Partida(Time mandante, Time visitante, int golMandante, int golVisitante ){
        
        setTimeMandante(mandante);
        setTimeVisitante(visitante);
        setGolMandante(golMandante);
        setGolVisitante(golVisitante);
    }
    
    //Para aplicar conceitos de encapsulamento
    public int getGolMandante() {
        return golMandante;
    }

    public void setGolMandante(int golMandante) {
        this.golMandante = golMandante;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public Time getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    
    
}
