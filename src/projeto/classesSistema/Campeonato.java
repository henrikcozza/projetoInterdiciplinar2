/*
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

// importa pacote para trabalhar com Matrizes dinamicamente
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;


public class Campeonato {

    // Armazena nome do campeonato
    private String nomeCampeonato;
    //Armazena lista de partidas do campeonato
    private ArrayList<Partida> listaPartidas = new ArrayList<Partida>();
    //Armazena lista de times que participam do campeonato
    private ArrayList<Time> listaTimes = new ArrayList<Time>();
    //Armazena Placar de times
    private ArrayList<Placar> listaPlacar = new ArrayList<Placar>();
   
    
    
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
        addPartida(new Partida(getTimeMandante("São Paulo"), getTimeVisitante("Palmeiras"), 4, 2));
        addPartida(new Partida(getTimeMandante("Corinthians"), getTimeVisitante("São Paulo"), 2, 1));
        addPartida(new Partida(getTimeMandante("Chapecó"), getTimeVisitante("São Paulo"), 2, 2));
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
        
        //seleciona placar do time mandante e incrementa gols marcados e sofridos com gols da partida já contabiliza pontuação       
        getPlacarTime(partida.getTimeMandante()).setPartida(partida.getGolMandante(), partida.getGolVisitante());
        
        //seleciona placar do time visitante e incrementa gols marcados e sofridos com gols da partida já contabiliza pontuação      
        getPlacarTime(partida.getTimeVisitante()).setPartida( partida.getGolVisitante(),partida.getGolMandante());
        
    }

    public ArrayList<Time> getListaTimes() {
        return listaTimes;
    }

    public void addTime(Time time) {
        this.listaTimes.add(time);
        //isto adiciona time na lista de placar também
        this.listaPlacar.add(new Placar(time));
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
      public Placar getPlacarTime(Time timePlacar){
         //itera sobre lista de placar e verifica se time passado por paramentro é igual a time no placar 
          for(Placar placar: listaPlacar){
              if(placar.getTime().equals(timePlacar)){
                  return placar;
              }              
          }          
          return null;
      }
}
