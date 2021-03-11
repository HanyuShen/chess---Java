package chess;

public class Rook extends Piece{
	public Rook(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♖");
		}
		else{
			setSymbol("♜");
		}
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(iOut == iIn && Math.abs(jOut - jIn) < 8 || jOut == jIn && Math.abs(iOut - iIn) < 8){
			//(1)
			if(iOut == iIn && jOut < jIn){
				for(int j=jIn-1; j>jOut; j--){
					if(Board.hasPiece(iIn,j)){
						return false;
					}
				}
				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(2)
			else if(iOut == iIn && jOut > jIn){
				for(int j=jIn+1; j<jOut; j++){
					if(Board.hasPiece(iIn,j)){
						return false;
					}
				}
				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(3)
			else if(jOut == jIn && iOut < iIn){
				for(int i=iIn-1; i>iOut; i--){
					if(Board.hasPiece(i,jIn)){
						return false;
					}
				}
				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(4)
			else if(jOut == jIn && iOut > iIn){
				for(int i=iIn+1; i<iOut; i++){
					if(Board.hasPiece(i,jIn)){
						return false;
					}
				}
				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}


		}
		return false;
		
	}

}
