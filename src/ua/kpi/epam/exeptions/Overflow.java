package ua.kpi.epam.exeptions;

import java.util.LinkedList;

public class Overflow {

	private final static int ARRAY_SIZE = 1000000;
	
	public void overflow() {
		overflow();
	}
	
	public void memoryLack() {
		LinkedList<Long[]> list = new LinkedList<Long[]>();
		Long[] l;
		
		while(true){
			l = new Long[ARRAY_SIZE];
			list.add(l);
		}
		
	}

}
