package br.fag.aula01;
import java.util.Scanner;

public class User{
    private static void Dados(){
        Scanner leitorNome = new Scanner(System.in);
        char leitor;
        System.out.println("Qual seria o seu nome para colocar no pedido?");
        leitor = leitorNome.next().charAt(0);
    }
}