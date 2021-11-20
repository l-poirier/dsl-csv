package fr.irisa.model;

import java.util.ArrayList;
import java.util.List;

public class Vector {

	public List<String> content;
	
	public Vector(List<String> cont) {
		content = cont;
	}
	
	// TODO temporary, delete when interpreter is done
	public Vector() {
		content = new ArrayList<String>();
	}
}
