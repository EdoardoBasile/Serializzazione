/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author basile.edoardo
 */
public class Studente implements Serializable{
private String nome;
private String cognome;
private int numreoregistro;

    public Studente(int numreoregistro, String nome, String cognome ) {
        this.nome = nome;
        this.cognome = cognome;
        this.numreoregistro = numreoregistro;
    }

    @Override
    public String toString() {
        return "Studente: " + "nome: " + nome + ", cognome: " + cognome + ", numreoregistro: " + numreoregistro ;
    }
    

}
