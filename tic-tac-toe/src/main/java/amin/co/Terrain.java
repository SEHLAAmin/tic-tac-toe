package amin.co;
import java.util.Arrays;
import java.lang.reflect.Array;

import java.util.Arrays;

public class Terrain {

    //private char[][] plateau;

    // public Grille(){
    //     plateau = new char[3][3];
    Positionnement position;
    char[][] plateau;
    int b;
    char symboleJoueur;

    // }


    public Terrain(){
                this.b = b;
        this.symboleJoueur = symboleJoueur;
        this.plateau  = new char[][]
        {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}};

    }
   
  

       public void placezPosition(int b , char symboleJoueur){
        switch(b){
                case 1 : 
                this.plateau[0][0] = symboleJoueur;
                break;
                case 2 : 
                this.plateau[0][2]= symboleJoueur;
                case 3 : 
                this.plateau[0][4] = symboleJoueur;
                 break;
                 case 4 : 
                 this.plateau[2][0]= symboleJoueur;
                 case 5 : 
                 this.plateau[2][2] = symboleJoueur;
                  break;
                 case 6 : 
                  this.plateau[2][4]= symboleJoueur;
                 break;
                 case 7 : 
                this.plateau[4][0]= symboleJoueur;
                break;
                case 8 : 
                this.plateau[4][2]= symboleJoueur;
                break;
                case 9 : 
                this.plateau[4][4]= symboleJoueur;
                break;
    
                default:
                break;
            }

            printPlateau(plateau);

        }
        
    public static void  printPlateau(char[][] plateau){
        for (char[] row : plateau) {
            for (char column : row) {
                System.out.print(column);
            }
        System.out.println();
        }
    }
    
}
