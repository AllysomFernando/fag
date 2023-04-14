package br.fag.aula01.pizza.controller;

import br.fag.aula01.helpers.ValorTotal;
import br.fag.aula01.pizza.Pizza;
import br.fag.aula01.pizza.types.SaborDoce;
import br.fag.aula01.pizza.types.SaborSalgada;

import java.util.ArrayList;
import java.util.Scanner;


public class ControllerPizza {

    public static void adicionarPizza() {
        ValorTotal valorTotal = new ValorTotal();
        Pizza pizza = new Pizza();

        final Scanner scanner = new Scanner(System.in);

        int leitor;


            System.out.println("Qual seria o tamanho da pizza  ?\n");
            System.out.println("1 - Pequena");
            System.out.println("2 - Média");
            System.out.println("3 - Grande");
            System.out.println("4 - Gigante");

            leitor = scanner.nextInt();

            ArrayList <Float> valoresSabor = new ArrayList<Float>();
            ArrayList <String> saboresPizza = new ArrayList<String>();

            switch (leitor) {
                        case 1:

                            int leitor2;

                            System.out.println("Selecionado pizza Pequena, pode selecionar somente 1 sabor:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {

                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                    valoresSabor.add(saborDoce.getValordoSabor());
                                }

                                leitor2 = scanner.nextInt();

                                valorTotal.setValorTotal(valoresSabor.get((leitor2 - 1)) * 10);

                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                    valoresSabor.add(saborSalgada.getValordoSabor());
                                }
                                leitor2 = scanner.nextInt();

                                valorTotal.setValorTotal(valoresSabor.get((leitor2 - 1)) * 4);
                            }
                            pizza.setNome(String.valueOf(leitor));
                            break;

                        case 2:

                            int quantidade = 0;




                            System.out.println("Selecionado pizza Média, pode selecionar somente 2 sabores:");

                            while(quantidade < 2){

                                System.out.println("Selecionar sabor?\n");
                                System.out.println("1 - Doce");
                                System.out.println("2 - Salgada");
                                leitor2 = scanner.nextInt();

                                if (leitor2 == 1) {
                                    for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                        System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                        valoresSabor.add(saborDoce.getValordoSabor());
                                        saboresPizza.add(saborDoce.getNomedaPizza());
                                    }
                                        quantidade += saboresPizza.size() - 9;
                                } else {
                                    for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                        System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                        valoresSabor.add(saborSalgada.getValordoSabor());
                                        saboresPizza.add(saborSalgada.getNomedaPizza());
                                    }
                                        quantidade += saboresPizza.size() - 20;
                                }
                                valorTotal.setValorTotal(valoresSabor.get((leitor2 - 1)) * 8);
                                leitor = scanner.nextInt();
                                pizza.setNome(String.valueOf(leitor));
                            }

                            break;

                        case 3:
                            quantidade = 0;

                            System.out.println("Selecionado pizza Grande, pode selecionar somente 3 sabores:");
                            System.out.println("Selecionar sabor?\n");

                            while(quantidade < 3) {

                                System.out.println("1 - Doce");
                                System.out.println("2 - Salgada");
                                leitor2 = scanner.nextInt();

                                if (leitor2 == 1) {
                                    for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                        System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                        valoresSabor.add(saborDoce.getValordoSabor());
                                        saboresPizza.add(saborDoce.getNomedaPizza());
                                    }
                                     quantidade += saboresPizza.size() - 10;
                                } else {
                                    for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                        System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                        valoresSabor.add(saborSalgada.getValordoSabor());
                                        saboresPizza.add(saborSalgada.getNomedaPizza());
                                    }
                                    quantidade += saboresPizza.size() - 21;
                                }

                                valorTotal.setValorTotal(valoresSabor.get((leitor2 - 1)) * 12);
                                leitor = scanner.nextInt();
                                pizza.setNome(String.valueOf(leitor));

                                break;
                            }
                        case 4:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 4 sabores:");

                            quantidade = 0;

                            while(quantidade < 3) {

                                System.out.println("Selecionar sabor?\n");
                                System.out.println("1 - Doce");
                                System.out.println("2 - Salgada");
                                leitor2 = scanner.nextInt();

                                if (leitor2 == 1) {
                                    for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                        System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                        valoresSabor.add(saborDoce.getValordoSabor());
                                        saboresPizza.add(saborDoce.getNomedaPizza());
                                    }
                                    quantidade += saboresPizza.size() - 11;
                                } else {
                                    for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                        System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                        valoresSabor.add(saborSalgada.getValordoSabor());
                                        saboresPizza.add(saborSalgada.getNomedaPizza());
                                    }
                                    quantidade += saboresPizza.size() - 22;
                                }

                                valorTotal.setValorTotal(valoresSabor.get((leitor2 - 1)) * 16);
                                leitor = scanner.nextInt();
                                pizza.setNome(String.valueOf(leitor));

                                break;
                            }
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
            }


