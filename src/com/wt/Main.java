package com.wt;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_RED+"Geef naam jonguh");
        String userName = input.nextLine();         //user input

        System.out.println("Steen, Papier, Schaar");
//        char[] choice = console.readPassword();           //Steen Papier Schaar - user input

//        System.out.println(choice);
        Player player1 = new Player(userName);
//        Player player2 = new Player(userName)

    }
}
