package chess;

public class King extends Piece{
	public King(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♔");
		}
		else{
			setSymbol("♚");
		}
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(Math.abs(iOut - iIn) <= 1 && Math.abs(jOut - jIn) <= 1){
			if(Board.hasPiece(iOut,jOut)){
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
