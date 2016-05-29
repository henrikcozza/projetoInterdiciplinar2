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

// importa pacote para trabalhar com Matrizes dinamicamente
import java.util.ArrayList;
import java.util.Iterator;
import static javax.swing.JOptionPane.showMessageDialog;


public class Campeonato {

    // Armazena nome do campeonato
    private String nomeCampeonato;
    //Armazena lista de partidas do campeonato
    private ArrayList<Partida> listaPartidas = new ArrayList<Partida>();
    //Armazena lista de times que participam do campeonato
    private ArrayList<Time> listaTimes = new ArrayList<Time>();
    
    
    //construtor que inicia com alguns dados
    public Campeonato(){
        //seta nome do campeonato
        setNomeCampeonato("Campeonato Brasileiro");
        
        //times pré cadastradas do sistema
        addTime(new Time("São Paulo", "São Paulo"));
        addTime(new Time("Palmeiras", "São Paulo"));
        addTime(new Time("Corinthians","São Paulo"));
        addTime(new Time("Chapecó", "Chapecó"));
        addTime(new Time("Criciúma", "Criciúma"));
        
        //partidas pré cadastradas no sistema
        addPartida(new Partida(getTimeMandante("Criciúma"), getTimeVisitante("Palmeiras"), 7, 1));
        addPartida(new Partida(getTimeMandante("São Paulo"), getTimeVisitante("Corinthians"), 5, 3));
        addPartida(new Partida(getTimeMandante("Corinthians"), getTimeVisitante("São Paulo"), 2, 1));
    }
    //aplicando conceito de encapsulamento
        
    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public ArrayList<Partida> getListaPartidas() {
        return listaPartidas;
    }

    public void addPartida(Partida partida) {
        this.listaPartidas.add(partida);
    }

    public ArrayList<Time> getListaTimes() {
        return listaTimes;
    }

    public void addTime(Time time) {
        this.listaTimes.add(time);
    }
    public Time getTimeMandante(String time){
        //for each que percorre a lista e verifica se nome do time é igual a string passada como parametro
        for (Time IteratorTime: getListaTimes()) {
            if(IteratorTime.getNomeTime().equals(time)){
                return IteratorTime;
            }
           
        }
        //Caso não encontrar time retorna menssagem de erro
        showMessageDialog(null, "Erro: Time mandante não encontrato");   
    
        return null;   
    }
      public Time getTimeVisitante(String time){
        //for each que percorre a lista e verifica se nome do time é igual a string passada como parametro
        for (Time IteratorTime: getListaTimes()) {
            if(IteratorTime.getNomeTime().equals(time)){
                return IteratorTime;
            }
           
        }
        //Caso não encontrar time retorna menssagem de erro
        showMessageDialog(null, "Erro: Time visitante não encontrato");   
    
        return null;   
    }
}
