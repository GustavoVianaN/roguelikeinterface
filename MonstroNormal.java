package com.company;

import java.util.ArrayList;

public class MonstroNormal extends Monstro {

    private Monstro listaMonstro;

    public MonstroNormal(String nome, String descricao, int forca, int saude, ArrayList<Item> itemMonstro){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setForca(forca);
        this.setSaude(saude);
        this.setItemMonstro(itemMonstro);


    }

    public Monstro getListaMonstro() {
        return listaMonstro;
    }

    public void setListaMonstro(Monstro listaMonstro) {
        this.listaMonstro = listaMonstro;
    }

    public void mostrarDadosMonstroNormal(){
        System.out.println("Nome: " + this.getNome() + "\n");
        System.out.println("Descrição: " + this.getDescricao() + "\n");
        System.out.println("Força: " + this.getForca() + "\n");
        System.out.println("Saúde: " + this.getSaude() + "\n");
        System.out.println("Item: " + this.getItemMonstro() + "\n");
    }
}
