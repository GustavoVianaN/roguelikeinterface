package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String nome;
    private int idade;
    private Classe listaClasse;
    private Item listaItem;
    private int moeda;

    public Player(String nome, int idade, Classe listaClasse, int moeda){

        this.nome = nome;
        this.idade = idade;
        this.listaClasse = listaClasse;
        this.moeda = moeda;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }

    public Item getListaItem() {
        return listaItem;
    }

    public void setListaItem(Item listaItem) {
        this.listaItem = listaItem;
    }

    public Classe getListaClasse() {
        return listaClasse;
    }

    public void setListaClasse(Classe listaClasse) {
        this.listaClasse = listaClasse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarDadoJogador(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Classe: " + getListaClasse().getNome());
        //System.out.println("Item: " + getListaClasse().getItemClasse());

    }

    public void mostrarDadoJogadorGameplay(){
        System.out.println("Saúde: " + getListaClasse().getSaude());
        System.out.println("Força: " + getListaClasse().getForca());
        System.out.println("Defesa: " + getListaClasse().getDefesa());
        //System.out.println("Moedas: " + this.moeda);
    }


}
