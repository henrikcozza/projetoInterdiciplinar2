package gui;

/*Classe para armazenar dados de configuração globais do sistema*/

import java.awt.Dimension;
import java.awt.Point;

import Classes.Campeonato;


public class Configuration {
	
	//Dados

	public static Dimension windowSize = new Dimension(500,500); // Valor padrao para dimensionamento de janelas do sistema.	
	public static Point windowPosition = new Point(200,200); //Coordenada usada para manter todas as janelas na mesmo posição mesmo apos alterar a posição de alguma
	//instancias globais
	
	public static MenuPrincipal menu; //menu principal (tecnica usada para ter acesso ao objeto menu sem depender da classe Main).
	public static Campeonato ligaSub20;
}
