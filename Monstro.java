package com.company;
import java.util.ArrayList;
public class Monstro {
    private String nome;
    private String descricao;
    private int forca;
    private int saude;
    private ArrayList<Item> itemMonstro;


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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public ArrayList<Item> getItemMonstro() {
        return itemMonstro;
    }

    public void setItemMonstro(ArrayList<Item> itemMonstro) {
        this.itemMonstro = itemMonstro;
    }


}
