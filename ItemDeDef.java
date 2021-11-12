package com.company;

import java.util.Scanner;

public class ItemDeDef extends Item{
    private int escudo;

    public ItemDeDef(String nome, String descricao, int escudo){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setEscudo(escudo);
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void mostrarItemDeDef(){
        System.out.println("Nome: " +   getNome()+ "\n");
        System.out.println("Descrição: " +  getDescricao()+ "\n");
        System.out.println("Escudo: " + this.escudo + "\n");
    }
    public void defender(){
        //Scanner scannerDefesa = new Scanner(System.in);
        System.out.println("defendeu");
    }
}
