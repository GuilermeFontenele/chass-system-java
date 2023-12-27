package boargame;

public class Position {

	private int row;
	private int colluns;
	
	public Position(int row, int colluns) {
		this.row = row;
		this.colluns = colluns;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColluns() {
		return colluns;
	}

	public void setColluns(int colluns) {
		this.colluns = colluns;
	}
	
	@Override
	public String toString() {
		
		return row + ", " + colluns;
	}
	
}
