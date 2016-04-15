package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroTimes extends JFrame {
	
	private JButton voltar;

	public CadastroTimes(){
		
		super("Cadastro de Time");
		
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
