package amin.co;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;

import java.util.Arrays;

public class Terrain {

    // private char[][] plateau;

    // public Grille(){
    // plateau = new char[3][3];
    Positionnement position;
    char[][] plateau;
    int b;
    public char symboleJoueur;
    public char symboleJoueur1;
    public char symboleJoueur2;

    static ArrayList<Integer> player1Position = new ArrayList<Integer>();
    static ArrayList<Integer> player2Position = new ArrayList<Integer>();

    // }

    public Terrain() {

        this.b = b;
        this.symboleJoueur = symboleJoueur;
        this.plateau = new char[][] { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

    }

    public void placezPosition(int b , char symboleJoueur) {
        switch (b) {
            case 1:
                this.plateau[0][0] = symboleJoueur;
                break;
            case 2:
                this.plateau[0][2] = symboleJoueur;
            case 3:
                this.plateau[0][4] = symboleJoueur;
                break;
            case 4:
                this.plateau[2][0] = symboleJoueur;
            case 5:
                this.plateau[2][2] = symboleJoueur;
                break;
            case 6:
                this.plateau[2][4] = symboleJoueur;
                break;
            case 7:
                this.plateau[4][0] = symboleJoueur;
                break;
            case 8:
                this.plateau[4][2] = symboleJoueur;
                break;
            case 9:
                this.plateau[4][4] = symboleJoueur;
                break;

            default:
                break;
        }
        // plateau.getClass();
        printPlateau(plateau);

    }

    public static void printPlateau(char[][] plateau) {
        for (char[] row : plateau) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static List checkWinner(){
        List Top = Arrays.asList(1 , 2 , 3);
        List mid = Arrays.asList(4 , 5 , 6);
        List bot = Arrays.asList(7 , 8 , 9);
        List leftColumln = Arrays.asList(1 , 4, 7);
        List midleColumn = Arrays.asList(2 , 5 , 8);
        List rightColumn = Arrays.asList(3 , 6  , 9);
        List crossL = Arrays.asList(1 , 5 , 9);
        List crossR = Arrays.asList(3 , 5 , 7);

        List<List> winning = new ArrayList<List>;
        winning.add(Top);
        winning.add(mid);
        winning.add(bot);
        winning.add(leftColumln);
        winning.add(midleColumn);
        winning.add(rightColumn);
        winning.add(crossL);
        winning.add(crossR);

        for(List l : winning){
            if(player1Position.containsAll(l)){
                System.out.println("player 1 won");

            } else if ( player2Position.containsAll(l)){
                System.out.println(" player 2 won ");
                
              
            }
        }

    }
}
