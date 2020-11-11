package amin.co;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        /* CREATION DES JOUEURS */ 
        Joueur joueur1 = new Joueur("Player_1", ' '); 
        Joueur joueur2 = new Joueur("Player_2", ' '); 
        Positionnement position = new Positionnement();

        /*CREATION DE LA GRID */
        Terrain plateau = new Terrain(); 

        /* START PLAYING */ 

        System.out.println("\n" + "Bienvenue à toi jeune entrepreneur, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in); 
        String entreTonNom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Très bien " + entreTonNom + ". Tu connais surement les règles du morpion, choisit une lettre, soit X, soit O : " + "\n");

        /*CHOOSE SYMBOL*/
        char symboleJoueur = scan.next("[O|Xo|x]*").charAt(0);
        char symboleJoueur1 = ' ';
        char symboleJoueur2 = ' ';
        
        //joueur.displayChoice();
        if (symboleJoueur == 'X' ||symboleJoueur == 'x') {
            symboleJoueur1= 'X';
            symboleJoueur2 = 'O';
        } else {
            symboleJoueur1 =  'O';
            symboleJoueur2 = 'X';
        }
        System.out.println("\n" + "Tu es donc le " + joueur1 + " et tu auras le symbole : " +  symboleJoueur1 + " et le Joueur2 aura :" + symboleJoueur2 +"\n" + "choose your position ! (1 à 9)");
        


        boolean gameIsPlaying = true;
        while(gameIsPlaying){


            int  b= scan.nextInt();
            plateau.placezPosition(b, symboleJoueur1);
           joueur1.getsymbolJoueur();


            System.out.println("Turn of player 2 ! ");

          

            b= scan.nextInt();

            plateau.placezPosition(b, symboleJoueur2);

            System.out.println("Turn of player1");


            
            //symboleJoueur =scan.nextInt();
        }
    }
}