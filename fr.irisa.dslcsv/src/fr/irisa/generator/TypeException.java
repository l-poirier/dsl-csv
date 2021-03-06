package fr.irisa.generator;

public class TypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	type l, r;
	
	public TypeException(type l, type r) {
		super();
		this.l = l;
		this.r = r;
	}

	public TypeException(type e) {
		super();
		this.l = e;
	}
	
	@Override
	public String getMessage() {
		if(r!=null)
			return "Type Exception : interaction between " + l + " and " + r + " typed objects";
		return "Type Exception : cannot apply operator on " + l + " typed objects";
	}
	
}
