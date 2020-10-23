package com.company;

import java.util.Scanner;


public class Menu {


    public static void menu (String[] args) {





//header
        Scanner sc = new Scanner(System.in);
        System.out.println("......................");
        System.out.println("Tape marmotte");
        System.out.println(".......................");



        System.out.println("Selectionnez votre option");
        System.out.println("- N : Nouvelle partie");
        System.out.println("- S : Score");
        System.out.println("- Q : Quitter");
        String lettre = sc.nextLine();
//header


//switch
        switch (lettre) {

            case "n":

                System.out.println("Choix du niveau");
                break;
            case "s":
                System.out.println("Classement");
                break;
            case "q":
                System.out.println("Quitter");
                break;
            default:
                System.out.println("erreur");
                menu(null);
                break;
            //switch
        }
    }
}