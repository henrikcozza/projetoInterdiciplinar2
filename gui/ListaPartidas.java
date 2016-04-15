package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Classes.Campeonato;
import Classes.Partida;

public class ListaPartidas extends JFrame{

	//janela
	private JButton voltar;
	private JButton atualizar;
	private JPanel painel1 = new JPanel(); //painel de botoes
	private JPanel painel2 = new JPanel();
	private GridLayout gradeGeral = new GridLayout(2,1);
	private JScrollPane scroll;
	
	//dados da tabela
	private DefaultTableModel mydata;
	private JTable tabela;
	private String [] colunas;
	private Campeonato champ;
	
	public ListaPartidas(){
		super("Lista Partidas");
		setSize(Configuration.windowSize);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//inicializaçoes de variaveis		
		tabela = new JTable();
		colunas =new String[] {"Partida","Placar"};
		mydata = new DefaultTableModel(colunas,0);
		champ = Configuration.ligaSub20;
		scroll = new JScrollPane();
		
		//botões
		voltar = new JButton("Voltar ao menu");
		voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Configuration.windowPosition = getLocation();
				Configuration.menu.setLocation(Configuration.windowPosition);
				setVisible(false);
				Configuration.menu.setVisible(true);
				
			}
		});
		
		atualizar = new JButton("Atualizar");
		atualizar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tabela = atualizaTabela(champ,mydata,tabela);
			}
		});
	
			
		
		tabela = atualizaTabela(champ,mydata,tabela);
		
		
		painel1.add(voltar);
		painel1.add(atualizar);
		scroll.getViewport().add(tabela);
		painel2.add(scroll);
		
		
		
		painel1.setVisible(true);
		painel2.setVisible(true);
		
		setLayout(gradeGeral);
		add(painel2);
		add(painel1);
		
	}
	
	
	private Object[] convertListObjectPartidaToArray(ArrayList<Partida> lista, int index){	
	
		Object[] data;
		int i = index;
			
		int golMandante = lista.get(i).getGolMandante();
		int golVisitante = lista.get(i).getGolVisitante();
		String mandante = lista.get(i).getMandante().getNome();			
		String visitante = lista.get(i).getVisitante().getNome();
			
		data = new Object[] { mandante+" x "+ visitante, golMandante+"-"+ golVisitante};
		
		return data;
	}
	
	private JTable atualizaTabela(Campeonato champ, DefaultTableModel mydata, JTable tabela ){
		
		//limpa tabela
		mydata.removeTableModelListener(tabela);
	
		//insere na tabela apartir da lista campeonato
		for(int i =0; i < champ.getPartidas().size(); i++){
			Object[] data = convertListObjectPartidaToArray(champ.getPartidas(),i);
			mydata.addRow(data);
		}
		
		// define tabela
		tabela = new JTable(mydata);
		tabela.setEnabled(false);
		return tabela;
	}
	

}