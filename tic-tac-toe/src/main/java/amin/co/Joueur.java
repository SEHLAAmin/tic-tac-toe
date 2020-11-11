package amin.co;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur{
    
    // Attributs de class
    private String name; 
    private char symbolJoueur; 
    private char symbolJoueur1; 
    private char symbolJoueur2; 
    Terrain terrain;

    // Constructor
    public Joueur(String name, char symbolJoueur) {
        this.name = name; 
        this.symbolJoueur = symbolJoueur; 
        this.symbolJoueur1 = symbolJoueur1;
        this.symbolJoueur2 = symbolJoueur2;
    }
    /*GETTER & SETTER */ 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
    }
    

	public int getsymbolJoueur() {
		return symbolJoueur;
    }
    

	public void setsymbolJoueur(char symbolJoueur) {
		this.symbolJoueur = symbolJoueur;
    }
    ///////////////////////////////

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }




    /*CHOISIR SYMBOLE POUR LES PLAYERS */ 

    
    //public void chooseSymboleJoueur1(){
       // Scanner scan = new Scanner(System.in);
       // try {
      //      char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
      //     if(chooseSymbol == 'x' || chooseSymbol =='X'){
       //     }else if(chooseSymbol == 'o' || chooseSymbol =='O'){
     //           this.symbolJoueur = 'O';  
              }
           
    //    } catch (InputMismatchException e) {
         //   System.out.println("Choisit une lettre, soit X, soit O !");
    //    }
   // }
//}
