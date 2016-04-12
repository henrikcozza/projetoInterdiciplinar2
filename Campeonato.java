/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.ArrayList;

/**
 *
 * @author Egerton
 */
public class Campeonato {

    private String nomeCampeonato;
    private ArrayList<Partida> listaPartidas;
    private ArrayList<Time> listaTimes;

    public void newPartida() {
        this.listaPartidas = new ArrayList<>();
    }

    public void newTime() {
        this.listaTimes = new ArrayList<>();
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public ArrayList<Partida> getListaPartidas() {
        return listaPartidas;
    }

    public void addPartida(Partida partida) {
        this.listaPartidas.add(partida);
    }

    public ArrayList<Time> getListaTimes() {
        return listaTimes;
    }

    public void addTime(Time time) {
        this.listaTimes.add(time);
    }
}
