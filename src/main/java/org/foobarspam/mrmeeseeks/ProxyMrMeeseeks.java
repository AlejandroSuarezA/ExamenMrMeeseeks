package org.foobarspam.mrmeeseeks;

import java.util.ArrayList;

public class ProxyMrMeeseeks {

	private static MrMeeseeks MrMe;
	
	public void pushButton(ArrayList<MrMeeseeks> THEREALITY){
		this.createMrMeeseeks(THEREALITY);
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> THEREALITY){
		MrMe = new MrMeeseeks();
		THEREALITY.add(MrMe);
	}
	
	public MrMeeseeks getMrMe(){
		return MrMe;
	}
	
}
