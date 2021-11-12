package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //ITENS DE ATAQUE
        ItemDeAtq item1 = new ItemDeAtq("Espada longa", "Em geral, foram chamadas de espadas longas, espadas com 80 cm" +
                " a 1,15 m de comprimento total e peso entre 0,9 kg e 1,5 kg.", 1);
        ItemDeAtq item2 = new ItemDeAtq("Adaga", "É uma espada mais curta semelhanta a uma faca," +
                "que te tras vantagem no combate corpo a corpo e de curta distancia.", 1);
        ItemDeAtq item3 = new ItemDeAtq("Arco e Flecha", "Arco e feito de madeira e propício para o combate de longa distância. ", 1);
        ItemDeAtq item4 = new ItemDeAtq("Livro de Magia", "O livro de magia e feito especialmente para os magos," +
                "libera magia de todos os 5 elementos. ", 1);
        ItemDeAtq item5 = new ItemDeAtq("Lança", "A lança pode ser ultilizada no combate corpo a corpo  e também" +
                "no combate de longa distância arremessando-a. ", 1);
        //ITENS DE DEFESA
        ItemDeDef item6 = new ItemDeDef("Escudo de Madeira", "Escudo feito de madeira. Protege 1 de dano", 1);
        ItemDeDef item7 = new ItemDeDef("Escudo de Pedra", "Escudo feito de pedra. Protege 2 de dano", 2);
        ItemDeDef item8 = new ItemDeDef("Escudo de Aço", "Escudo feito de aço. Protege 3 de dano", 3);
        ItemDeDef item9 = new ItemDeDef("Escudo de Metal", "Escudo feito de metal. Protege 4 de dano", 4);
        ItemDeDef item10 = new ItemDeDef("Escudo de Adamantium", "Escudo feito de adamantium. Protege 5 de dano", 5);

        ArrayList<Item> itemMago = new ArrayList<Item>();
        itemMago.add(item4);
        ArrayList<Item> itemGuerreiro = new ArrayList<Item>();
        itemGuerreiro.add(item1);
        ArrayList<Item> itemArqueiro = new ArrayList<Item>();
        itemArqueiro.add(item3);
        ArrayList<Item> itemLadrao = new ArrayList<Item>();
        itemLadrao.add(item2);
        ArrayList<Item> itemLanceiro = new ArrayList<Item>();
        itemLanceiro.add(item5);


        //CLASSES
        Classe c1 = new Classe("Mago", "Os magos geralmente preferem lutar com magia ao invés de espada. Os magos têm muita versatilidade com seus feitiços" +
                " e habilidades que ganham com seus estudos, ultilizam do Livro de Magia", itemMago, 5, 3, 20);
        Classe c2 = new Classe("Guerreiro", "Guerreiros são ótimos lutadores marciais, sempre prontos para o combate. Possuem magnificas habilidades de combate." +
                " Ele possui poderosas habilidades combativas e são mais acostumados com o combate com espadas", itemGuerreiro, 5, 3, 20);
        Classe c3 = new Classe("Arqueiro", "Um arqueiro possue a proeza no uso de arco, e nem mesmo um guerreiro muito experiente" +
                " pode se igualar as suas capacidades. Para ser um bom arqueiro e necessário frieza e pontaria", itemArqueiro, 5, 3, 20);
        Classe c4 = new Classe("Ladrão", "Eles são especialistas em furtividade e assassinatos, utilizam as adagas como utensilio de batalha," +
                " mas se bobear eles fogem do combate em um piscar de olhos.", itemLadrao, 5, 3, 20);
        Classe c5 = new Classe("Lanceiro", "Os lanceiros possuem maestria em utilizar lanças tanto para se defender e atacar." +
                "Lanceiros possuem vantagens pois conseguem usa-la tanto para combates corpo a corpo e de longa distância. ", itemLanceiro, 5, 3, 20);

        //MONSTROS
        MonstroNormal m1 = new MonstroNormal("Goblin", "Semelhantes a duendes, são velozes e fortes, não possuem muita inteligência mas a " +
                "sua força bruta compensa.", 3, 15, itemLadrao);
        MonstroNormal m2 = new MonstroNormal("Esqueleto", "São fisicamente fracos, utilizam o seu arco e flecha como metódo de combate", 4, 20, itemArqueiro);
        MonstroNormal m3 = new MonstroNormal("Bruxa", "As bruxas utilizam magia negra contra seus adversários, na maioria das vezes" +
                "são crueis usando os seus feitiços.", 5, 25, itemMago);
        MonstroNormal m4 = new MonstroNormal("Principe das Trevas", "Andam em um cavalo preto e usam uma grande lança escura. Cuidado! " +
                "Esta lança é muito mais afiada do que parece", 6, 35, itemLanceiro);
        MonstroChefe m5 = new MonstroChefe("Gigante", "O Gigante é o Rei do feudo, tem mais de 10 metros de altura" +
                "e é temido por todos.", 7, 45, itemGuerreiro, "O Gigante foi esnobado por seu pai, por ser medroso, com raiva deixou" +
                "o castelo. Acabou se tornando o Rei deste feudo e tem como objetivo, criar um exercito para atacar seu pai.");

        ArrayList<Monstro> monstro1 = new ArrayList<Monstro>();
        monstro1.add(m1);
        ArrayList<Monstro> monstro2 = new ArrayList<Monstro>();
        monstro2.add(m2);
        ArrayList<Monstro> monstro3 = new ArrayList<Monstro>();
        monstro3.add(m3);
        ArrayList<Monstro> monstro4 = new ArrayList<Monstro>();
        monstro4.add(m4);
        ArrayList<Monstro> monstro5 = new ArrayList<Monstro>();
        monstro5.add(m5);


        //FASES
        Fases fase1 = new Fases("GOBLINLÂNDIA", "Para chegar ao castelo do gigante é necessário, passar pela temida " +
                "cidade dos goblins.", 1, monstro1);
        Fases fase2 = new Fases("CAVERNDA ASSOMBRADA", "Boatas que todos que entram nessa caverna nao conseguem sair." +
                "Precisamos chegar o quanto antes no castelo, e por aqui é o caminho mais curto.", 2, monstro2);
        Fases fase3 = new Fases("PANTANO ALMADIÇOADO", "Este pantano é o local com maior concentração de bruxas dessa região." +
                "As bruxas são perversas e sempre buscam novas pessoas para testar suas magias.", 3, monstro3);
        Fases fase4 = new Fases("ENTRADA DO CASTELO", "Após passar pelo pantano amaldiçoado, você se da de cara com a entrada do castelo," +
                "porém há varios princípes das trevas de guardas no portão.", 4, monstro4);
        Fases fase5 = new Fases("SALA DO REINO", "Enfim conseguiu passar todos os obstáculos, e agora está cara a cara com o rei gigante" +
                "hora de cumprir sua missão.", 5, monstro5);


        Scanner nomeScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nickname?: ");
        String nome = nomeScanner.nextLine();
        System.out.println("Qual sua idade?:");
        int idade = scanner.nextInt();
        while (true) {
            System.out.println("[1]COMEÇAR O JOGO");
            System.out.println("[2]VER FASES");
            System.out.println("[3]VER ITENS");
            System.out.println("[4]VER CLASSE");
            System.out.println("[5]VER MONSTROS");
            System.out.println("[6]SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            int valorEntrada1 = scanner.nextInt();
            if (valorEntrada1 == 1) {
                //Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("ESCOLHA UMA CLASSE");
                    System.out.println("[1]MAGO");
                    System.out.println("[2]GUERREIRO");
                    System.out.println("[3]ARQUEIRO");
                    System.out.println("[4]LADRAO");
                    System.out.println("[5]LANCEIRO");
                    System.out.println("DIGITE SUA  OPÇÃO: ");
                    int valor = scanner.nextInt();
                    if (valor == 1) {
                        Player player = new Player(nome, idade, c1, 100);
                        player.mostrarDadoJogador();
                        break;

                    } else if (valor == 2) {
                        Player player = new Player(nome, idade, c2, 100);
                        player.mostrarDadoJogador();
                        break;
                    } else if (valor == 3) {
                        Player player = new Player(nome, idade, c3, 100);
                        player.mostrarDadoJogador();
                        break;
                    } else if (valor == 4) {
                        Player player = new Player(nome, idade, c4, 100);
                        player.mostrarDadoJogador();
                        break;
                    } else if (valor == 5) {
                        Player player = new Player(nome, idade, c5, 100);
                        player.mostrarDadoJogador();
                        break;
                    } else if (valor == 6) {
                        System.exit(0);
                    } else {
                        System.out.println("DIGITE ALGO VALIDO");
                    }
                }
                Player player = new Player(nome, idade, c1, 100);
                player.mostrarDadoJogadorGameplay();
                Scanner scannerAtq = new Scanner(System.in);
                System.out.println("======COMEÇO DO JOGO======");
                System.out.println("Você foi contratado pelo pai do rei, para o matar, pois o Gigante busca vingaça contra o seu pai, " +
                        "mas para isso será necessário passar por muitos desfaios.");
                System.out.println("==FASE 1==");
                fase1.mostrarDadosFase();
                System.out.println("UM GOBLIN APARECE ");
                System.out.println("- APERTE 1 PARA ATACAR");
                int opcao = scannerAtq.nextInt();


                    if (opcao == 1) {
                        System.out.println(m1.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                        System.out.println("O GOBLIN IRÁ ATACAR, SE DEFENDA.");
                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                        opcao = scannerAtq.nextInt();


                    if (opcao == 2) {
                        System.out.println("DEFENDEU COM " + item6.getNome());
                        System.out.println("APERTE 1 PARA ATACAR");
                        opcao = scannerAtq.nextInt();
                        if (opcao == 1) {
                            System.out.println(m1.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                            System.out.println("O GOBLIN IRÁ ATACAR, SE DEFENDA.");
                            System.out.println("- APERTE 2 PARA SE DEFENDER ");
                            opcao = scannerAtq.nextInt();
                            if (opcao == 2) {
                                System.out.println("DEFENDEU COM " + item6.getNome());
                                System.out.println("APERTE 1 PARA ATACAR");
                                opcao = scannerAtq.nextInt();
                                if (opcao == 1) {
                                    System.out.println(m1.getSaude() - 3 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                    System.out.println("GOBLIN MORREU \n");
                                    System.out.println("OUTRO GOBLIN APARECE ");
                                    System.out.println("- APERTE 1 PARA ATACAR");
                                    opcao = scannerAtq.nextInt();
                                    if (opcao == 1) {
                                        System.out.println(m1.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                                        System.out.println("O GOBLIN IRÁ ATACAR, SE DEFENDA.");
                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                        opcao = scannerAtq.nextInt();
                                        if (opcao == 2) {
                                            System.out.println("DEFENDEU COM " + item6.getNome());
                                            System.out.println("APERTE 1 PARA ATACAR");
                                            opcao = scannerAtq.nextInt();
                                            if (opcao == 1) {
                                                System.out.println(m1.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                System.out.println("O GOBLIN IRÁ ATACAR, SE DEFENDA.");
                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                opcao = scannerAtq.nextInt();
                                                if (opcao == 2) {
                                                    System.out.println("DEFENDEU COM " + item6.getNome());
                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                    opcao = scannerAtq.nextInt();
                                                    if (opcao == 1) {
                                                        System.out.println(m1.getSaude() - 3 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                        System.out.println("GOBLIN MORREU \n");
                                                        System.out.println("VOCÊ GANHOU " + item7.getNome() + ", e 100 moedas \n ");

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                player.mostrarDadoJogadorGameplay();
                System.out.println("==FASE 2==");
                fase2.mostrarDadosFase();
                System.out.println("Moedas: " + player.getMoeda() * 2 + "\n");
                System.out.println("UM ESQUELETO APARECE ");
                System.out.println("- APERTE 1 PARA ATACAR");
                opcao = scannerAtq.nextInt();

                    if (opcao == 1) {
                        System.out.println(m2.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                        System.out.println("O ESQUELETO IRÁ ATACAR, SE DEFENDA.");
                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                        opcao = scannerAtq.nextInt();
                        if (opcao == 2) {
                            System.out.println("DEFENDEU COM " + item7.getNome());
                            System.out.println("APERTE 1 PARA ATACAR");
                            opcao = scannerAtq.nextInt();
                            if (opcao == 1) {
                                System.out.println(m2.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                System.out.println("O ESQUELETO IRÁ ATACAR, SE DEFENDA.");
                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                opcao = scannerAtq.nextInt();
                                if (opcao == 2) {
                                    System.out.println("DEFENDEU COM " + item7.getNome());
                                    System.out.println("APERTE 1 PARA ATACAR");
                                    opcao = scannerAtq.nextInt();
                                    if (opcao == 1) {
                                        System.out.println(m2.getSaude() - 3 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                        System.out.println("O ESQUELETO IRÁ ATACAR, SE DEFENDA.");
                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                        opcao = scannerAtq.nextInt();
                                        if (opcao == 2) {
                                            System.out.println("DEFENDEU COM " + item7.getNome());
                                            System.out.println("APERTE 1 PARA ATACAR");
                                            opcao = scannerAtq.nextInt();
                                            if (opcao == 1) {
                                                System.out.println(m2.getSaude() - 4 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                System.out.println("MORREU");
                                                System.out.println("VOCê GANHOU " + item8.getNome() + ", e 100 moedas");

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    player.mostrarDadoJogadorGameplay();
                    System.out.println("==FASE 3==");
                    fase3.mostrarDadosFase();
                    System.out.println("Moedas: " + player.getMoeda() * 3 + "\n");
                    System.out.println("UM BRUXA APARECE ");
                    System.out.println("- APERTE 1 PARA ATACAR");
                    opcao = scannerAtq.nextInt();
                    if (opcao == 1) {
                        System.out.println(m3.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                        System.out.println("O BRUXA IRÁ ATACAR, SE DEFENDA.");
                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                        opcao = scannerAtq.nextInt();
                        if (opcao == 2) {
                            System.out.println("DEFENDEU COM " + item8.getNome());
                            System.out.println("APERTE 1 PARA ATACAR");
                            opcao = scannerAtq.nextInt();
                            if (opcao == 1) {
                                System.out.println(m3.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                System.out.println("O BRUXA IRÁ ATACAR, SE DEFENDA.");
                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                opcao = scannerAtq.nextInt();
                                if (opcao == 2) {
                                    System.out.println("DEFENDEU COM " + item8.getNome());
                                    System.out.println("APERTE 1 PARA ATACAR");
                                    opcao = scannerAtq.nextInt();
                                    if (opcao == 1) {
                                        System.out.println(m3.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                        System.out.println("O BRUXA IRÁ ATACAR, SE DEFENDA.");
                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                        opcao = scannerAtq.nextInt();
                                        if (opcao == 2) {
                                            System.out.println("DEFENDEU COM " + item8.getNome());
                                            System.out.println("APERTE 1 PARA ATACAR");
                                            opcao = scannerAtq.nextInt();
                                            if (opcao == 1) {
                                                System.out.println(m3.getSaude() - 4 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                System.out.println("O BRUXA IRÁ ATACAR, SE DEFENDA.");
                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                opcao = scannerAtq.nextInt();
                                                if (opcao == 2) {
                                                    System.out.println("DEFENDEU COM " + item8.getNome());
                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                    opcao = scannerAtq.nextInt();
                                                    if (opcao == 1) {
                                                        System.out.println(m3.getSaude() - 5 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                        System.out.println("MORREU");
                                                        System.out.println("VOCÊ GANHOU: " + item9.getNome() + ", e 100 moedas");

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    player.mostrarDadoJogadorGameplay();
                    System.out.println("==FASE 4==");
                    fase4.mostrarDadosFase();
                    System.out.println("Moedas: " + player.getMoeda() * 4+ "\n");
                    System.out.println("UM PRINCÍPE DAS TREVAS APARECE ");
                    System.out.println("- APERTE 1 PARA ATACAR");
                    opcao = scannerAtq.nextInt();

                    if (opcao == 1) {
                        System.out.println(m4.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                        System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                        opcao = scannerAtq.nextInt();
                        if (opcao == 2) {
                            System.out.println("DEFENDEU COM " + item9.getNome());
                            System.out.println("APERTE 1 PARA ATACAR");
                            opcao = scannerAtq.nextInt();
                            if (opcao == 1) {
                                System.out.println(m4.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                opcao = scannerAtq.nextInt();
                                if (opcao == 2) {
                                    System.out.println("DEFENDEU COM " + item9.getNome());
                                    System.out.println("APERTE 1 PARA ATACAR");
                                    opcao = scannerAtq.nextInt();
                                    if (opcao == 1) {
                                        System.out.println(m4.getSaude() - 3 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                        System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                        opcao = scannerAtq.nextInt();
                                        if (opcao == 2) {
                                            System.out.println("DEFENDEU COM " + item9.getNome());
                                            System.out.println("APERTE 1 PARA ATACAR");
                                            opcao = scannerAtq.nextInt();
                                            if (opcao == 1) {
                                                System.out.println(m4.getSaude() - 4 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                opcao = scannerAtq.nextInt();
                                                if (opcao == 2) {
                                                    System.out.println("DEFENDEU COM " + item9.getNome());
                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                    opcao = scannerAtq.nextInt();
                                                    if (opcao == 1) {
                                                        System.out.println(m4.getSaude() - 5 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                        System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                        opcao = scannerAtq.nextInt();
                                                        if (opcao == 2) {
                                                            System.out.println("DEFENDEU COM " + item9.getNome());
                                                            System.out.println("APERTE 1 PARA ATACAR");
                                                            opcao = scannerAtq.nextInt();
                                                            if (opcao == 1) {
                                                                System.out.println(m4.getSaude() - 6 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                                System.out.println("O PRINCIPE IRÁ ATACAR, SE DEFENDA.");
                                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                                opcao = scannerAtq.nextInt();
                                                                if (opcao == 2) {
                                                                    System.out.println("DEFENDEU COM " + item9.getNome());
                                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                                    opcao = scannerAtq.nextInt();
                                                                    if (opcao == 1) {
                                                                        System.out.println(m4.getSaude() - 7 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                                        System.out.println("MORREU");
                                                                        System.out.println("Você ganhou " + item10.getNome() + ", e 100 moedas");

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    player.mostrarDadoJogadorGameplay();
                    System.out.println("==FASE 5==");
                    fase5.mostrarDadosFase();
                    System.out.println("Moedas: " + player.getMoeda() * 5 + "\n");
                    System.out.println("O REI GIGANTE APARECE ");
                    System.out.println("- APERTE 1 PARA ATACAR");
                    opcao = scannerAtq.nextInt();
                    if (opcao == 1) {
                        System.out.println(m5.getSaude() - player.getListaClasse().getForca() + " - VIDA \n");
                        System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                        opcao = scannerAtq.nextInt();
                        if (opcao == 2) {
                            System.out.println("DEFENDEU COM " + item10.getNome());
                            System.out.println("APERTE 1 PARA ATACAR");
                            opcao = scannerAtq.nextInt();
                            if (opcao == 1) {
                                System.out.println(m5.getSaude() - 2 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                opcao = scannerAtq.nextInt();
                                if (opcao == 2) {
                                    System.out.println("DEFENDEU COM " + item10.getNome());
                                    System.out.println("APERTE 1 PARA ATACAR");
                                    opcao = scannerAtq.nextInt();
                                    if (opcao == 1) {
                                        System.out.println(m5.getSaude() - 3 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                        System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                        opcao = scannerAtq.nextInt();
                                        if (opcao == 2) {
                                            System.out.println("DEFENDEU COM " + item10.getNome());
                                            System.out.println("APERTE 1 PARA ATACAR");
                                            opcao = scannerAtq.nextInt();
                                            if (opcao == 1) {
                                                System.out.println(m5.getSaude() - 4 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                System.out.println("O GIGANTEE IRÁ ATACAR, SE DEFENDA.");
                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                opcao = scannerAtq.nextInt();
                                                if (opcao == 2) {
                                                    System.out.println("DEFENDEU COM " + item10.getNome());
                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                    opcao = scannerAtq.nextInt();
                                                    if (opcao == 1) {
                                                        System.out.println(m5.getSaude() - 5 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                        System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                        opcao = scannerAtq.nextInt();
                                                        if (opcao == 2) {
                                                            System.out.println("DEFENDEU COM " + item10.getNome());
                                                            System.out.println("APERTE 1 PARA ATACAR");
                                                            opcao = scannerAtq.nextInt();
                                                            if (opcao == 1) {
                                                                System.out.println(m5.getSaude() - 6 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                                System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                                opcao = scannerAtq.nextInt();
                                                                if (opcao == 2) {
                                                                    System.out.println("DEFENDEU COM " + item10.getNome());
                                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                                    opcao = scannerAtq.nextInt();
                                                                    if (opcao == 1) {
                                                                        System.out.println(m5.getSaude() - 7 * (player.getListaClasse().getForca()) + " - VIDA \n");
                                                                        System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                                                        System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                                        opcao = scannerAtq.nextInt();
                                                                        if (opcao == 2) {
                                                                            System.out.println("DEFENDEU COM " + item10.getNome());
                                                                            System.out.println("APERTE 1 PARA ATACAR");
                                                                            opcao = scannerAtq.nextInt();
                                                                            if (opcao == 1) {
                                                                                System.out.println(m5.getSaude() - 8 * (player.getListaClasse().getForca()) + " - VIDA");
                                                                                System.out.println("O GIGANTE IRÁ ATACAR, SE DEFENDA.");
                                                                                System.out.println("- APERTE 2 PARA SE DEFENDER ");
                                                                                opcao = scannerAtq.nextInt();
                                                                                if (opcao == 2) {
                                                                                    System.out.println("DEFENDEU COM " + item10.getNome());
                                                                                    System.out.println("APERTE 1 PARA ATACAR");
                                                                                    opcao = scannerAtq.nextInt();
                                                                                    if (opcao == 1) {
                                                                                        System.out.println(m5.getSaude() - 9 * (player.getListaClasse().getForca()) + " - VIDA");
                                                                                        System.out.println("ENFIM O GIGANTE MORREU" + "\n");
                                                                                        System.out.println("Você ganhou 100 moedas");

                                                                                        player.mostrarDadoJogadorGameplay();
                                                                                        System.out.println("Moedas: " + player.getMoeda() * 6 + "\n");
                                                                                        System.out.println("====FIM DE JOGO====");
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            if (valorEntrada1 == 2) {
                fase1.mostrarDadosFase();
                System.out.println("-------------------");
                fase2.mostrarDadosFase();
                System.out.println("-------------------");
                fase3.mostrarDadosFase();
                System.out.println("-------------------");
                fase4.mostrarDadosFase();
                System.out.println("-------------------");
                fase5.mostrarDadosFase();
                System.out.println("-------------------");
            }
            if (valorEntrada1 == 3) {
                item1.mostrarItemDeAtq();
                System.out.println("-------------------");
                item2.mostrarItemDeAtq();
                System.out.println("-------------------");
                item3.mostrarItemDeAtq();
                System.out.println("-------------------");
                item4.mostrarItemDeAtq();
                System.out.println("-------------------");
                item5.mostrarItemDeAtq();
                System.out.println("-------------------");
                item6.mostrarItemDeDef();
                System.out.println("-------------------");
                item7.mostrarItemDeDef();
                System.out.println("-------------------");
                item8.mostrarItemDeDef();
                System.out.println("-------------------");
                item9.mostrarItemDeDef();
                System.out.println("-------------------");
                item10.mostrarItemDeDef();
                System.out.println("-------------------");
            }
            if (valorEntrada1 == 4) {
                c1.mostrarClasse();
                System.out.println("-------------------");
                c2.mostrarClasse();
                System.out.println("-------------------");
                c3.mostrarClasse();
                System.out.println("-------------------");
                c4.mostrarClasse();
                System.out.println("-------------------");
                c5.mostrarClasse();
            }
            if (valorEntrada1 == 5) {
                m1.mostrarDadosMonstroNormal();
                System.out.println("-------------------");
                m2.mostrarDadosMonstroNormal();
                System.out.println("-------------------");
                m3.mostrarDadosMonstroNormal();
                System.out.println("-------------------");
                m4.mostrarDadosMonstroNormal();
                System.out.println("-------------------");
                m5.mostrarDadosMonstroChefe();
                System.out.println("-------------------");
            }
            if (valorEntrada1 == 6) {
                System.exit(0);
            } else {
                System.out.println("DIGITE ALGO VÁLIDO");
            }

            }
        }
    }
