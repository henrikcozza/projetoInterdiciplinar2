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

import javax.swing.JFrame;
import projeto.classesSistema.Campeonato;
import projeto.gui.About;
import projeto.gui.CadastroPartida;
import projeto.gui.CadastroTimes;
import projeto.gui.ListagemPartidas;
import projeto.gui.ListagemTimes;
import projeto.gui.Menu;

public class GlobalInstance {

    //instancias de sistema
    public static Campeonato campeonato = new Campeonato();

    //instancas de telas
    public GlobalInstance() {
    }
    public static Menu menu = new Menu();
    public static JFrame janela = new JFrame(); // janela principal que contera todos os paines, apenas tornando os paineis visiveis ou nao conforme a navegação
    public static CadastroPartida cPartida = new CadastroPartida();
    public static CadastroTimes cTime = new CadastroTimes();
    public static ListagemPartidas lPartida = new ListagemPartidas();
    public static ListagemTimes lTime = new ListagemTimes();
    public static About about = new About();

}
