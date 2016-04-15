package Classes;
/*
 * Classe Partida
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

public class Partida {
	
	// Armazena numero inteiro do placar de gols do time da casa
	int golMandante;
	//Armazena numero inteiro do placar de gols do time visitante
	int golVisitante;
	
	// Armazena instancia do time da casa
	Time mandante;
	// Armazena instancia do time visitante
	Time visitante;
	
	
	public Partida(Time mandante, Time visitante, int golMandante, int golVisitante){
		
		setMandante(mandante);
		setVisitante(visitante);
		setGolMandante(golMandante);
		setGolVisitante(golVisitante);
		
	}
	//gets e sets Para aplicar conceitos de encapsulamento
	
	//para atributo golMandante
	public void setGolMandante(int gols){
		this.golMandante = gols;
	}
	public int getGolMandante(){
		return this.golMandante;
	}
	
	//para atributo golVisitante
	public void setGolVisitante(int gols){
		this.golVisitante = gols;
	}
	public int getGolVisitante(){
		return this.golVisitante;
	}
	
	//para atributo mandante
	public void setMandante(Time timeCasa){
		this.mandante = timeCasa;
	}
	public Time getMandante(){
		return this.mandante;
	}
	public String getMandanteNome(){
		return this.mandante.getNome();
	}
	
	//para atributo visitante
	public void setVisitante(Time timeVisitante){
		this.visitante = timeVisitante;
	}
	public Time getVisitante(){
		return this.visitante;
	}
}
