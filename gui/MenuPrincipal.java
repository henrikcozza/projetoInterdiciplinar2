package gui;

import javax.swing.JFrame;
import javax.swing.JButton;

import Classes.Campeonato;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame{
	
	//Botões de cadastro
	private JButton cadTimes;
	private	JButton cadPartidas;
					
    //Botões de informações
	private	JButton listPartidas;
	private	JButton listTimes;
	private JButton about;
	
	//Dados de layout
	private GridLayout grade;
	
	//Gui do sistema
	private CadastroTimes janelaCadastroTimes;
	private CadastroPartidas janelaCadastroPartidas;
	private ListaTimes janelaListaTimes;
	private ListaPartidas janelaListaPartidas;
	private About janelaAbout;
	
	//inicializa classes do sistema
	
	
	//construtor do menu principal
	public MenuPrincipal(){
		
		super("Menu Principal");
		
		setVisible(true);
		
		setSize(Configuration.windowSize);
		setLocation(Configuration.windowPosition);
		
		//finaliza o programa quando fechar a janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		grade = new GridLayout(5,1,0,5); //5 linhas e 1 coluna, com espaçamentos de 5 entre as linhas ezero entre as colunas
		
		setLayout(grade);	
		
		//inicializa classes
		Configuration.ligaSub20 = new Campeonato("Liga Sub 20");
		//cria botoes do menu
		cadTimes = new JButton("Cadastro de Times");
		cadTimes.addActionListener(/*classe anonima que implementa a interface ActionListener*/ new ActionListener (){
			public void actionPerformed(ActionEvent e){
				//ação do botão aqui
				
				setVisible(false);
				Configuration.windowPosition = getLocation();
				
				if(janelaCadastroTimes==null)
					janelaCadastroTimes = new CadastroTimes();
				else
					janelaCadastroTimes.setVisible(true);
					janelaCadastroTimes.setLocation(Configuration.windowPosition);
			}
		});
		add(cadTimes); //adiciona botão ao JFrame
		
		cadPartidas = new JButton("Cadastro de Partidas");
		cadPartidas.addActionListener(/*classe anonima que implementa a interface ActionListener*/ new ActionListener (){
			public void actionPerformed(ActionEvent e){
				//ação do botão aqui
				setVisible(false);
				Configuration.windowPosition = getLocation();
				
				if(janelaCadastroPartidas==null)
					janelaCadastroPartidas = new CadastroPartidas();
				else	
					janelaCadastroPartidas.setVisible(true);
					janelaCadastroPartidas.setLocation(Configuration.windowPosition);
			}
		});
		add(cadPartidas);  //adiciona botão ao JFrame
		
		listPartidas = new JButton("Listar Partidas");
		listPartidas.addActionListener(/*classe anonima que implementa a interface ActionListener*/ new ActionListener (){
			public void actionPerformed(ActionEvent e){
				//ação do botão aqui
				setVisible(false);
				Configuration.windowPosition = getLocation();
				
				if(janelaListaPartidas == null)					
					janelaListaPartidas = new ListaPartidas();
				else
					janelaListaPartidas.setVisible(true);
					janelaListaPartidas.setLocation(Configuration.windowPosition);
				
			}
		});
		add(listPartidas);  //adiciona botão ao JFrame
		
		listTimes = new JButton("Listar Times");
		listTimes.addActionListener(/*classe anonima que implementa a interface ActionListener*/ new ActionListener (){
			public void actionPerformed(ActionEvent e){
				//ação do botão aqui
				setVisible(false);
				Configuration.windowPosition = getLocation();
				
				if(janelaListaTimes==null)
					janelaListaTimes = new ListaTimes();
				else
					janelaListaTimes.setVisible(true);
					janelaListaTimes.setLocation(Configuration.windowPosition);
				
				
			}
		});
		add(listTimes);  //adiciona botão ao JFrame
		
		about = new JButton("Sobre o sistema");
		about.addActionListener(/*classe anonima que implementa a interface ActionListener*/ new ActionListener (){
			public void actionPerformed(ActionEvent e){
				//ação do botão aqui
				setVisible(false);
				Configuration.windowPosition = getLocation();
				
				if(janelaAbout == null)
					janelaAbout = new About();
				else
					janelaAbout.setVisible(true);
					janelaAbout.setLocation(Configuration.windowPosition);
			}
		});
		add(about);  //adiciona botão ao JFrame
	}

}
