package chess;

public class Queen extends Piece{
	public Queen(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♕");
		}
		else{
			setSymbol("♛");
		}
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(iOut == iIn && Math.abs(jOut - jIn) < 8 || jOut == jIn && Math.abs(iOut - iIn) < 8 || Math.abs(iOut - iIn) == Math.abs(jOut - jIn)){
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

			//(5)
			else if(iOut>iIn && jOut>jIn){
				int j = jIn + 1;
				for(int i=iIn+1; i<iOut; i++){
					if(Board.hasPiece(i,j) == true){
						return false;
					}
					j += 1;
				}

				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(6)
			else if(iOut<iIn && jOut>jIn){
				int j= jIn + 1;
				for(int i=iIn-1; i>iOut; i--){
					if(Board.hasPiece(i,j) == true){
						return false;
					}
					j += 1;
				}

				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(7)
			else if(iOut>iIn && jOut<jIn){
				int j= jIn - 1;
				for(int i=iIn+1; i<iOut; i++){
					if(Board.hasPiece(i,j) == true){
						return false;
					}
					j -= 1;
				}

				if(Board.hasPiece(iOut,jOut) == true){
					if(Board.getPiece(iOut,jOut).getColour() != Board.getPiece(iIn,jIn).getColour()){
						return true;
					}
					return false;
				}
				return true;
			}
			//(8)
			else if(iOut<iIn && jOut<jIn){
				int j= jIn - 1;
				for(int i=iIn-1; i>iOut; i--){
					if(Board.hasPiece(i,j) == true){
						return false;
					}
					j -= 1;
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
