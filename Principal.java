/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Egerton
 */
public class Principal {

    Campeonato camp = new Campeonato();
    String mensagem;
    String resposta;
    int count;

    public Principal() {
        criaDBInicial();

        inicio();

//        System.out.println("resposta" + resposta);
//
//        listarTimes();
//        listarPartidas();
    }

    public void inicio() {
        try {

            mensagem = "Informe uma Opção:\n\n"
                    + "1 - Cadastrar Times\n"
                    + "2 - Cadastrar Partidas\n"
                    + "3 - Listar Times\n"
                    + "4 - Listar Partidas\n"
                    + "0 - Sair";
            resposta = JOptionPane.showInputDialog(mensagem);

            if (resposta.indexOf("1") >= 0) {
                cadastroTime(JOptionPane.showInputDialog("Informe Nome do Time"), JOptionPane.showInputDialog("Informe Cidade do Time"));
            }

            if (resposta.indexOf("2") >= 0) {
                mensagem = "Times Disponíveis:\n"
                        + "";
                count = 0;
                for (Time t : camp.getListaTimes()) {
                    count++;
                    mensagem += count + " - " + t.getNomeTime() + "\n";
                }
                cadastroPartida(camp.getListaTimes().get(Integer.parseInt(JOptionPane.showInputDialog(mensagem + "Informe o Time Mandante:")) - 1), camp.getListaTimes().get(Integer.parseInt(JOptionPane.showInputDialog(mensagem + "Informe o Time Visitante:")) - 1), Integer.parseInt(JOptionPane.showInputDialog("Informe Gols Time Mandante:")), Integer.parseInt(JOptionPane.showInputDialog("Informe Gols Time Visitante:")));
            }
            if (resposta.indexOf("3") >= 0) {
                listarTimes();
            }
            if (resposta.indexOf("4") >= 0) {
                listarPartidas();
            }
            if (resposta.indexOf("0") >= 0) {
                System.exit(0);
            }

        } catch (Exception e) {
            inicio();
        }

        inicio();
    }

    public void criaDBInicial() {
        // criando estrurura para simular o db
        camp.newPartida();
        camp.newTime();

        // cadastrando times no db
        cadastroTime("Time um", "CidadeA");
        cadastroTime("Time dois", "CidadeB");
        cadastroTime("Time tres", "CidadeC");
        cadastroTime("Time quatro", "CidadeD");

        // cadastrando partidas no db
        cadastroPartida(camp.getListaTimes().get(0), camp.getListaTimes().get(1), 2, 1);
        cadastroPartida(camp.getListaTimes().get(2), camp.getListaTimes().get(3), 4, 1);

    }

    public void cadastroTime(String nomeTime, String cidadetime) {
        Time t = new Time();
        t.setCidadeTime(cidadetime);
        t.setNomeTime(nomeTime);
        camp.addTime(t);
    }

    public void listarTimes() {
        mensagem = "Times:\n------------------------------------------\n";
        for (Time t : camp.getListaTimes()) {
            mensagem += " - Time: \t" + t.getNomeTime() + "\n";
            mensagem += " - Cidade: \t" + t.getCidadeTime() + "\n";
            mensagem += "------------------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void cadastroPartida(Time timeMandante, Time timeVisitante, int golMandante, int golVisitante) {
        Partida p = new Partida();
        p.setGolMandante(golMandante);
        p.setGolVisitante(golVisitante);
        p.setTimeMandante(timeMandante);
        p.setTimeVisitante(timeVisitante);
        camp.addPartida(p);
    }

    public void listarPartidas() {
        mensagem = "Partidas:\n------------------------------------------\n";
        for (Partida p : camp.getListaPartidas()) {
            mensagem += " - Time Mandante: \t" + p.getTimeMandante().getNomeTime() + "\n";
            mensagem += " - Time Visitante: \t" + p.getTimeVisitante().getNomeTime() + "\n";
            mensagem += " - Gols Mandante: \t" + p.getGolMandante() + "\n";
            mensagem += " - Gols Visitante: \t" + p.getGolVisitante() + "\n";
            mensagem += "------------------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void main(String[] args) {
        new Principal();
    }

}
