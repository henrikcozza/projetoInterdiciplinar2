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


public class Time {
    //Armazena nome do time
    private String nomeTime;
    //Armazena cidade natal do time
    private String cidadeTime;

    public Time(String nome, String cidade){
        setNomeTime(nome);
        setCidadeTime(cidade);
        
    }
    //aplicar conceitos de encapsulamento
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getCidadeTime() {
        return cidadeTime;
    }

    public void setCidadeTime(String cidadeTime) {
        this.cidadeTime = cidadeTime;
    }
    
    
}