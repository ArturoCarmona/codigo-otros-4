package com.generation;

//Se importa java.util
import java.util.Scanner;

//Se cambio el nombre del archivo para que tuviera el mismo nombre de Clase
public class Codigo4 {
	
	//Se agrega metodo main
	public static void main(String[] args) {
		//Se agrega System.in
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    
	    //Se agrega system.in
	    //Se cambia "s" por "s2"
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    
	    //Se quita ")"
	    //Se cambia "==" por .equals
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      
	    	//Se quita g=2 para hacer Switch
	    	//int g = 2;
	      int g = 0;
	      
	      //Comienza Switch
	    //Se cambia "==" por .equals
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	            break;
	          }

	          //Se agrega "}" para cerrar if
	        //Se cambia "==" por .equals
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 2;
	            //Se agrega break
	            break;
	          }
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	            break;
	          }
	          //Se acomoda break dentro de las llavas {}
	        default:
	        	//SE agrega default
	        	System.out.println("Vuelve a intentarlo");
	      }
	      System.out.println("Gana el jugador " + g);
	    }	
	}
}
	


