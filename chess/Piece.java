package chess;

//This class requires your input
public abstract class Piece {
	private String symbol;
	protected PieceColour colour;


	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String s){
		symbol = s;
	}

	public PieceColour getColour(){
		return colour;
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(iIn > 7 || jIn > 7 || iOut > 7 || jOut > 7){
			return false;
		}
		else if(iIn < 0 || jIn < 0 || iOut < 0 || jOut < 0){
			return false;
		}
		else if(iIn == iOut && jIn == jOut){
			return false;
		}
		else{
			return true;
		}
	}
}

