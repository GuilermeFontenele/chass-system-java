package boargame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int colluns) {
		this.row = row;
		this.column = colluns;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColluns() {
		return column;
	}

	public void setColluns(int colluns) {
		this.column = colluns;
	}
	
	@Override
	public String toString() {
		
		return row + ", " + column;
	}
	
}
