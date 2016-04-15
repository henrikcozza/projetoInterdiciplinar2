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
	String	nomeCampeonato;	
	
	//construtor do objeto campeonato
	public Campeonato(String nomeCampeonato){
		
		setNomeCampeonato(nomeCampeonato);
		
		//inicializa listas
		times = new ArrayList<Time>();
		partidas = new ArrayList<Partida>();
		//cadastro default		
		setTimes(new Time("Palmeiras","São Paulo"));
		setTimes(new Time("São Paulo","São Paulo"));
		setPartidas(new Partida(getTimes("Palmeiras"),getTimes("São Paulo"), 5, 2));
		setPartidas(new Partida(getTimes("São Paulo"),getTimes("Palmeiras"), 2, 2));
	}
	
	//gets e sets Para aplicar conceitos de encapsulamento
	
	//para lista de partidas
	public void setPartidas(Partida partida){
		this.partidas.add(partida);	
	}
	public Partida getPartidas(int index){
		return this.partidas.get(index);
	}
	public ArrayList<Partida> getPartidas(){
		return partidas;
	}
	//para lista de times
	public void setTimes(Time time){
		this.times.add(time);
	}
	public Time getTimes(int index){
		return this.times.get(index);
	}
	
	//faz busca de time pelo nome
	public Time getTimes(String time){
		
		Time sect = null;
		for(Time i : times ){
			if(i.getNome().equals(time)){
				sect = i;
				System.out.println("time: "+i.getNome());
			}
		}
		if(sect!=null)
		return sect;
		else
			System.out.println("Erro: time não encontrado");
		return sect;
	}

	//para atributo nomeCampeonato
	public void setNomeCampeonato(String nome){
		this.nomeCampeonato = nome;
	}
	public String getNomeCampeonato(){
		return this.nomeCampeonato;
	}
}
