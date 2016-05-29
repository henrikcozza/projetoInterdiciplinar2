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

package projeto.main;




public class Principal {


   
    public static void main(String[] args) {
        
         // Aqui vira o codigo para setar a instancia global janela       
        
        
        
        GlobalInstance.janela.setVisible(true);
        GlobalInstance.janela.setSize(600,400);
        GlobalInstance.janela.setDefaultCloseOperation(GlobalInstance.janela.EXIT_ON_CLOSE);
        GlobalInstance.janela.add(GlobalInstance.menu); 
        
       
        
        
    }
    
}
