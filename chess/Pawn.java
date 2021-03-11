package chess;

public class Pawn extends Piece{	
	public Pawn(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♙");
		}
		else{
			setSymbol("♟︎");
		}
	}
	
	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if (Board.getPiece(iOut, jOut) != null){
			if (Board.getPiece(iIn, jIn).getColour() == Board.getPiece(iOut, jOut).getColour()){
				return false;
			}
		}

		
		if (this.getColour() == PieceColour.BLACK){
			// pawn can move front 1 position
			if ((jIn == jOut) && (iIn + 1 == iOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return true;
				}
				return false;
			}
			// pawn can move initially 2 positions
			else if((iIn == 1) && (iIn + 2 == iOut) && (jIn == jOut)){
				return true;
			}
			// pawn can replace the piece at diagonal left
			else if ((iIn + 1 == iOut) && (jIn - 1 == jOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return false;
				}
				return true;
			}
			// pawn can replace the piece at diagonal right
			else if ((iIn + 1 == iOut) && (jIn + 1 == jOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return false;
				}
				return true;
			}
			return false;
		}

		
		else if (this.getColour() == PieceColour.WHITE){
			// pawn can move front
			if ((jIn == jOut) && (iIn - 1 == iOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return true;
				}
				return false;
			}
			
			else if((iIn == 6) && (iIn - 2 == iOut) && (jIn == jOut)){
				return true;
			}
			// pawn can replace the piece at diagonal left
			else if ((iIn - 1 == iOut) && (jIn - 1 == jOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return false;
				}
				return true;
			}
			// pawn can replace the piece at diagonal right
			else if ((iIn - 1 == iOut) && (jIn + 1 == jOut)){
				if (Board.getPiece(iOut,jOut) == null){
					return false;
				}
				return true;
			}
			return false;
		}
		return false;
	}
}
