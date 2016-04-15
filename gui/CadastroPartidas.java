package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CadastroPartidas extends JFrame {

	private JButton voltar;
	public CadastroPartidas(){
		
		super("Cadastro de Partidas");
		setSize(Configuration.windowSize);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		voltar = new JButton("Voltar ao menu");
		voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
				Configuration.menu.setVisible(true);
			}
		});
		add(voltar);
	}
}
