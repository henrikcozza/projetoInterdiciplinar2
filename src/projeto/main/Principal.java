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

package projeto.main;

//Utilizado para criar uma unica janela que trabalhara com paineis sendo escondidos e exibidos
import javax.swing.JFrame;
import projeto.gui.About;
import projeto.gui.CadastroPartida;
import projeto.gui.CadastroTimes;
import projeto.gui.ListagemPartidas;
import projeto.gui.ListagemTimes;
import projeto.gui.Menu;



public class Principal {


   
    public static void main(String[] args) {
        
         // Aqui vira o codigo para instanciar as classes do sistema e manter seu correto funcionamento 
         
        
        
        
        
        GlobalInstance.janela.setVisible(true);
        GlobalInstance.janela.setSize(600,400);
        GlobalInstance.janela.setDefaultCloseOperation(GlobalInstance.janela.EXIT_ON_CLOSE);
        GlobalInstance.janela.add(GlobalInstance.menu);
        /*
        GlobalInstance.janela.add(GlobalInstance.cTime);
        GlobalInstance.janela.add(GlobalInstance.lPartida);
        GlobalInstance.janela.add(GlobalInstance.lTime);
        GlobalInstance.janela.add(GlobalInstance.about);*/
        
       
        
        
    }
    
}
