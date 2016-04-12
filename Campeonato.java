package Classes;
/*
 * Classe Campeonato
 * 
 * Para o trabalho da disciplina Projeto Interdiciplinar II
 * 
 * Data: 04/03/2016
 * Aluno: Henrique A. Conzatti
 * R.a.: 2068657
 * 
 * Para o trabalho da disciplina Projeto Interdiciplinar II
 * 
 */

// importa pacote para trabalhar com Matrizes dinamicamente
import java.util.ArrayList;

public class Campeonato {

    //Armazena lista de partidas do campeonato
    ArrayList<Partida> partidas;

    //Armazena lista de times que participam do campeonato
    ArrayList<Time> times;

    // Armazena nome do campeonato
    StringnomeCampeonato;

    //gets e sets Para aplicar conceitos de encapsulamento

    //para lista de partidas
    public void setPartidas(Partida partida){
	this.partidas.add(partida);
    }
    public Partida getPartidas(int index){
	return this.partidas.get(index);
    }

    //para lista de times
    public void setTimes(Time time){
	this.times.add(time);
    }
    public Time getTimes(int index){
	return this.times.get(index);
    }

    //para atributo nomeCampeonato
    public void setNomeCampeonato(String nome){
	this.nomeCampeonato = nome;
    }
    public String getNomeCampeonato(){
	return this.nomeCampeonato;
    }
}
