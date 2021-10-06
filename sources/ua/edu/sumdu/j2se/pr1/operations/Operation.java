package ua.edu.sumdu.j2se.pr1.operations;
	/**
	* Operation on two arguments.
	*/
	
public class Operation {
	
	/**
	* Create new operation using two numbers.
	*/
	private int x;
	private int y;
	
	public Operation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	* @return result of operation
	*/
	public int getResult() {
		return x * y;
	}

}