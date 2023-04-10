package br.fag.aula01;

import java.util.Calendar;
import java.util.Scanner;
import br.fag.aula01.User;


public class Main {
    public static void main(String[] args){
      Calendar time = Calendar.getInstance();
      System.out.println(decodePeriod(time));
      System.out.println(outPut());
    }
    public static String decodePeriod(final Calendar time) {
        String decodedPeriod = null;
        int hour = time.get(Calendar.HOUR_OF_DAY);
        if (hour >= 18){
            decodedPeriod = "\nBoa noite!\n";
        } else if (hour >= 12) {
            decodedPeriod = "\nBoa tarde!\n";
        }else{
            decodedPeriod = "\nBom dia!\n";
        }
        return decodedPeriod;
    }

     private static boolean outPut() {
            Scanner inputUser = new Scanner(System.in);
            int leitor;
            System.out.println("Qual seria o tipo de retirada? \n");
            System.out.println("1 Delivery \n2 Retirada Balcao \n3 La Carte\n");
            leitor = inputUser.nextInt();

            if(leitor == 1){
                System.out.println(new User());
            }else if(leitor == 2){

         }
            return true;
     }
}
