package com.company;

import java.util.ArrayList;

public class MonstroChefe extends Monstro{
    private String motivacao;

    public MonstroChefe(String nome, String descricao, int forca, int saude, ArrayList<Item> itemMonstro, String motivacao){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setForca(forca);
        this.setSaude(saude);
        this.setItemMonstro(itemMonstro);
        this.setMotivacao(motivacao);
    }



    public String getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(String motivacao) {
        this.motivacao = motivacao;
    }

    public void mostrarDadosMonstroChefe(){
        System.out.println("Nome: " + this.getNome() + "\n");
        System.out.println("Descrição: " + this.getDescricao() + "\n");
        System.out.println("Força: " + this.getForca() + "\n");
        System.out.println("Saúde: " + this.getSaude() + "\n");
        System.out.println("Item: " + this.getItemMonstro() + "\n");
        System.out.println("Motivação: " + this.getMotivacao() + "\n");
    }
}
