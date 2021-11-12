package com.company;

import java.util.Scanner;

public class ItemDeAtq extends Item{
    private int danoDeAtq;

    public ItemDeAtq(String nome, String descricao, int danoDeAtq){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setDanoDeAtq(danoDeAtq);
    }

    public int getDanoDeAtq() {
        return danoDeAtq;
    }

    public void setDanoDeAtq(int danoDeAtq) {
        this.danoDeAtq = danoDeAtq;
    }

    public void mostrarItemDeAtq(){
        System.out.println("Nome: " + this.getNome() + "\n");
        System.out.println("Descrição: " +  this.getDescricao()+ "\n");
        System.out.println("Dano: " +  this.danoDeAtq + "\n");
    }

    public void atacar(){
        //Scanner scannerAtacar = new Scanner(System.in);
        System.out.println("atacar");
        //int opcao = scannerAcao.nextInt();

    }
}
