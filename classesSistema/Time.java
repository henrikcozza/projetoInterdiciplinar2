package Classes;
/*
 * Classe Time
 * 	
 * Para o trabalho da disciplina Projeto Interdiciplinar II
 * 
 * Data: 04/03/2016
 * Aluno: Henrique A. Conzatti
 * R.a.: 2068657
 * 
 */

public class Time {
	
	//Armazena nome do time
	String nome;
	
	//Armazena cidade natal do time
	String cidade;
	
	public Time(String nome, String cidade){
		
		setNome(nome);
		setCidade(cidade);
	}
	
	//gets e sets Para aplicar conceitos de encapsulamento
	
	//para atributo nome
	public void setNome(String name){
		this.nome = name;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	//para atributo cidade
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
		
	public String getCidade(){
		return this.cidade;
	}
}
