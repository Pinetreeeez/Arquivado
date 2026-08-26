package retangulo;

public class calcLosango {
	private float diagonalMaior;
	private float diagonalMenor;
	private float area;
	
	float getdiagmaiorLosan() {
		return this.diagonalMaior;
	}
	
	float getdiagmenorLosan() {
		return this.diagonalMenor;
	}
	
	void setdiagmaiorLosan(float diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}
	
	void setdiagmenorLosan(float diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	float calclosanArea() {
		area = ((getdiagmaiorLosan() * getdiagmenorLosan()) / 2);
		return area;
	}
}
