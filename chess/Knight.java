package chess;

public class Knight extends Piece{
	public Knight(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♘");
		}
		else{
			setSymbol("♞");
		}
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(Math.abs(iOut-iIn) == 1 && Math.abs(jOut-jIn) == 2 || Math.abs(iOut-iIn) == 2 && Math.abs(jOut-jIn) == 1){
			if(Board.hasPiece(iOut,jOut) == true){
				if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
}
