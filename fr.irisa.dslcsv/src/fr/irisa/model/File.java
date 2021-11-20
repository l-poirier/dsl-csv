package fr.irisa.model;

import java.util.ArrayList;
import java.util.List;

public class File {
	public List<String[]> content;
	
	public File(List<String[]> cont) {
		content = cont;
	}
	
	// TODO temporary, delete when interpreter is done
	public File() {
		content = new ArrayList<String[]>();
	}
}
