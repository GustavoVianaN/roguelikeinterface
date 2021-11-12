package com.company;

import java.util.ArrayList;

public class Classe {
    private String nomeClasse;
    private String descricao;
    private ArrayList<Item> itemClasse;
    private int forca;
    private int defesa;
    private int saude;

    public Classe(String nomeClasse, String descricao, ArrayList<Item> itemClasse, int forca, int defesa, int saude){
        this.nomeClasse = nomeClasse;
        this.descricao = descricao;
        this.itemClasse = itemClasse;
        this.forca = forca;
        this.defesa = defesa;
        this.saude = saude;

    }




    public String getNome() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Item> getItemClasse() {
        return itemClasse;
    }

    public void setItemClasse(ArrayList<Item> itemClasse) {
        this.itemClasse = itemClasse;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }



    public void mostrarClasse(){
        System.out.println("Nome: " +  this.nomeClasse + "\n");
        System.out.println("Descrição: " + this.descricao + "\n");
        System.out.println("Item: " +  getItemClasse() + "\n");
        System.out.println("Força: " +  this.forca + "\n");
        System.out.println("Defesa: " +  this.defesa+ "\n");
        System.out.println("Saúde: " +  this.saude + "\n");
    }







}
