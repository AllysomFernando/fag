package br.fag.aula01.pizza.controller;

import br.fag.aula01.pizza.Pizza;
import br.fag.aula01.pizza.types.SaborDoce;
import br.fag.aula01.pizza.types.SaborSalgada;

import java.util.Scanner;

public class ControllerPizza {

    public static void adicionarPizza() {

        Pizza pizza = new Pizza();

        final Scanner scanner = new Scanner(System.in);

        int leitor;
        int quantidade = 0;

        while (quantidade <= 0) {
            System.out.println("Quantas pizzas o senhor(a) vai querer?\n");
            quantidade = scanner.nextInt();
        }
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Qual seria o tamanho da pizza " + i + "?\n");
            System.out.println("1 - Pequena");
            System.out.println("2 - Média");
            System.out.println("3 - Grande");
            System.out.println("4 - Gigante");
            leitor = scanner.nextInt();
            switch (quantidade) {
                case 1:
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
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }

                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));
                            break;

                        case 2:
                            System.out.println("Selecionado pizza Média, pode selecionar somente 2 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 3:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 3 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 4:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 4 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                case 2:
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
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }

                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));
                            break;

                        case 2:
                            System.out.println("Selecionado pizza Média, pode selecionar somente 2 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 3:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 3 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 4:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 4 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
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
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }

                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));
                            break;

                        case 2:
                            System.out.println("Selecionado pizza Média, pode selecionar somente 2 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 3:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 3 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;

                        case 4:
                            System.out.println("Selecionado pizza Grande, pode selecionar somente 4 sabores:");
                            System.out.println("Selecionar sabor?\n");
                            System.out.println("1 - Doce");
                            System.out.println("2 - Salgada");
                            leitor2 = scanner.nextInt();

                            if (leitor2 == 1) {
                                for (SaborDoce saborDoce : pizza.getSaboresDoces()) {
                                    System.out.printf("%d - %s\n", saborDoce.ordinal() + 1, saborDoce.getNomedaPizza());
                                }
                            } else {
                                for (SaborSalgada saborSalgada : pizza.getSaboresSalgada()) {
                                    System.out.printf("%d - %s\n", saborSalgada.ordinal() + 1, saborSalgada.getNomedaPizza());
                                }
                            }
                            leitor = scanner.nextInt();
                            pizza.setNome(String.valueOf(leitor));

                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                default:
                    System.out.println("muito grande");
                    break;
            }
        }
    }
}
