package org.foobarspam.mrmeeseeks;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks implements Doable{

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
	
	private static String[] messageOnRequest = {"Oh, yeah!, Yes, ma'am", "Oooh yeah! Can do!"};
	private static String messageOnDone = "All done!";
	private static String messageOnExplode = "Poooof";
			
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
		this.sayMessageOnCreate();
	}
	public void sayMessageOnCreate(){
		System.out.println("I'm Mr Meeseeks " + id + ". Look at meee!");
	}
	
	public Integer getId(){
		return this.id;
	}
	
	public void formulateRequest(String verbo, String sujeto){
		this.sayMessageOnRequest();
		this.doRequest(verbo, sujeto);
	}
	
	public void sayMessageOnRequest(){
		System.out.println(this.generateMessageOnRequest());
	}
	
	public void sayMessageOnDone(){
		System.out.println(messageOnDone);
	}
	
	public void sayMessageOnExplode(){
		System.out.println(messageOnExplode + " " +this.id);
	}
	
	private String generateMessageOnRequest(){
		Integer quote = new Random().nextInt(2);
		return messageOnRequest[quote];
	}
	
	public void doRequest(String verbo, String predicado){
		System.out.println(verbo + " " + predicado);
		this.sayMessageOnDone();
	}
	
	public void stopExisting(){
		this.sayMessageOnExplode();
	}
}
