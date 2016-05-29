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


import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;


public class Campeonato {

   
    private String nomeCampeonato;
 
    private ArrayList<Partida> listaPartidas = new ArrayList<Partida>();
  
    private ArrayList<Time> listaTimes = new ArrayList<Time>();

    private ArrayList<Placar> listaPlacar = new ArrayList<Placar>();
   
    
    
 
    public Campeonato(){
       
        setNomeCampeonato("Campeonato Brasileiro");
        
        
        addTime(new Time("São Paulo", "São Paulo"));
        addTime(new Time("Palmeiras", "São Paulo"));
        addTime(new Time("Corinthians","São Paulo"));
        addTime(new Time("Chapecó", "Chapecó"));
        addTime(new Time("Criciúma", "Criciúma"));
        
        
        addPartida(new Partida(getTimeMandante("Criciúma"), getTimeVisitante("Palmeiras"), 7, 1));
        addPartida(new Partida(getTimeMandante("São Paulo"), getTimeVisitante("Corinthians"), 5, 3));
        addPartida(new Partida(getTimeMandante("São Paulo"), getTimeVisitante("Palmeiras"), 4, 2));
        addPartida(new Partida(getTimeMandante("Corinthians"), getTimeVisitante("São Paulo"), 2, 1));
        addPartida(new Partida(getTimeMandante("Chapecó"), getTimeVisitante("São Paulo"), 2, 2));
    }
 
        
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
        
        getPlacarTime(partida.getTimeMandante()).setPartida(partida.getGolMandante(), partida.getGolVisitante());
        
        getPlacarTime(partida.getTimeVisitante()).setPartida( partida.getGolVisitante(),partida.getGolMandante());
        
    }

    public ArrayList<Time> getListaTimes() {
        return listaTimes;
    }

    public void addTime(Time time) {
        this.listaTimes.add(time);
        
        this.listaPlacar.add(new Placar(time));
    }
    
    public Time getTimeMandante(String time){
      
        for (Time IteratorTime: getListaTimes()) {
            if(IteratorTime.getNomeTime().equals(time)){
                return IteratorTime;
            }
           
        }
      
        showMessageDialog(null, "Erro: Time mandante não encontrato");   
    
        return null;   
    }
      public Time getTimeVisitante(String time){
      
        for (Time IteratorTime: getListaTimes()) {
            if(IteratorTime.getNomeTime().equals(time)){
                return IteratorTime;
            }
           
        }
      
        showMessageDialog(null, "Erro: Time visitante não encontrato");   
    
        return null;   
    }
      public Placar getPlacarTime(Time timePlacar){
        
          for(Placar placar: listaPlacar){
              if(placar.getTime().equals(timePlacar)){
                  return placar;
              }              
          }          
          return null;
      }
}
