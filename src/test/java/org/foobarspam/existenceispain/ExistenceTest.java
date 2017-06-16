package org.foobarspam.existenceispain;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.mrmeeseeks.MrMeeseeks;
import org.junit.Before;
import org.junit.Test;

public class ExistenceTest {
	MrMeeseeks MrMe;
	
	@Before
	public void init(){
		MrMe = new MrMeeseeks();
		MrMe.sayMessageOnRequest();
	}
	
	@Test
	public void CreationTest() {
		assertTrue(MrMe instanceof MrMeeseeks);
	}
	
	@Test
	public void ArrayTest(){
		ArrayList<MrMeeseeks> setMrMe = new ArrayList();
		
		setMrMe.add(MrMe);
		
		assertTrue(setMrMe.get(0) instanceof MrMeeseeks);
	}
	
	@Test
	public void ACompleteWomanTest(){
		System.out.println();
		System.out.println("COMPLETE WOMAN TEST");
		MrMe.doRequest("Be", "A complete woman");
	}
	
	@Test
	public void BeTheMayonnaiseJarTest(){
		System.out.println();
		System.out.println("MAYONNAISE JAR TEST");
		MrMe.doRequest("Be", " the mayonnaise jar");
	}
	
	@Test
	public void CeaseExistingTest(){
		System.out.println();
		System.out.println("EXISTENCE IS PAIN TEST");
		MrMe.sayMessageOnExplode();
	}
	
	
}
