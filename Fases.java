package com.company;

import java.util.ArrayList;

public class Fases {
    private String nome;
    private String descricao;
    private int level;
    private ArrayList<Monstro> monstro;

    public Fases(String nome, String descricao, int level, ArrayList<Monstro> monstro) {
        this.nome = nome;
        this.descricao = descricao;
        this.level = level;
        this.monstro = monstro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Monstro> getMonstro() {
        return monstro;
    }

    public void setMonstro(ArrayList<Monstro> monstro) {
        this.monstro = monstro;
    }

    public void mostrarDadosFase(){
        System.out.println("Nome: " +  this.nome + "\n");
        System.out.println("Descrição: " +  this.descricao + "\n");
        System.out.println("Nível: " +  this.level+ "\n");

    }
}
