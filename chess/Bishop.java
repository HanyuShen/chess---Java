package chess;
//import java.util.Random;
public class Bishop extends Piece{
	public Bishop(PieceColour p){
		colour = p;
		if(colour == PieceColour.WHITE){
			setSymbol("♗");
		}
		else{
			setSymbol("♝");
		}
	}

	public boolean isLegitMove(int iIn,int jIn,int iOut,int jOut){
		if(Math.abs(iOut - iIn) == Math.abs(jOut - jIn)){
			//(1)
			if(iOut>iIn && jOut>jIn){
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
			//(2)
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
			//(3)
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
			//(4)
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
