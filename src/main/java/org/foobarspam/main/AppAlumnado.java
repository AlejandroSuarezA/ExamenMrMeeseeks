package org.foobarspam.main;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.mrmeeseeks.MrMeeseeks;
import org.foobarspam.mrmeeseeks.ProxyMrMeeseeks;

public class AppAlumnado {
	
	public static void listMrMeeseeks(ArrayList<MrMeeseeks> THEREALITY){
		for (MrMeeseeks MrMe : THEREALITY){
			System.out.println(MrMe.getId());
		}
	}
	
	public static void collectIds(ArrayList<MrMeeseeks> THEREALITY, ArrayList<Integer> ids){
		for (MrMeeseeks MrMe : THEREALITY){
			ids.add(MrMe.getId());
		}
	}
	
	public static void explodeMrMeeseeks(ArrayList<MrMeeseeks> THEREALITY, Integer id){
		for (MrMeeseeks MrMe : THEREALITY){
			if(MrMe.getId() == id){
				MrMe.sayMessageOnExplode();
				THEREALITY.remove(MrMe);
				break;
			}
		}
	}
	
	
	public static void main( String[] args ){
        
		// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
		// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
		
		ArrayList<MrMeeseeks> setMrMe = new ArrayList();
		
		ArrayList<Integer> ids = new ArrayList();
		
		        
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		       
		box.pushButton(setMrMe);
		System.out.println("Open Jerry's stupid mayonnaise jar");
		box.getMrMe().formulateRequest("Open", "stupid jar");
		System.out.println();
		
		box.pushButton(setMrMe);    
		System.out.println("I wanna be popular at school!");
		box.getMrMe().formulateRequest("Be", "popular at school");
		System.out.println();
		
		box.pushButton(setMrMe);
		System.out.println("I wanna be a more complete woman!");
		box.getMrMe().formulateRequest("Be", "a more complete woman");
		System.out.println();
		
		System.out.println("Estos son los Mr Meeseeks creados:");
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		collectIds(setMrMe, ids);
		
		System.out.println("Adios, Mr Meeseeks...");
		for(Integer id : ids){
			explodeMrMeeseeks(setMrMe, id);   
		}

		System.out.println("        ___");
		System.out.println("    . -^   `--,");
		System.out.println("   /# =========`-_");
		System.out.println("  /# (--====___====\\");
		System.out.println(" /#   .- --.  . --.|");
		System.out.println("/##   |  * ) (   * ),");
		System.out.println("|##   \\    /\\ \\   / |");
		System.out.println("|###   ---   \\ ---  |");
		System.out.println("|####      ___)    #|");
		System.out.println("|######           ##|");
		System.out.println(" \\##### ---------- /");
		System.out.println("  \\####           (");
		System.out.println("   `\\###          |");
		System.out.println("     \\###         |");
		System.out.println("      \\##        |");
		System.out.println("       \\###.    .)");
		System.out.println("        `======/"); 
		System.out.println("This is what we goooooooooot");
		
	    }
	


		/* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
		 */

		/* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
		 */

		/* explodeMrMeeseeks(setMrMe, id)
		 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
		 */	

}
