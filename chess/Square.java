package chess;

//This class requires your input
public class Square {
	private boolean hasPiece = false;
	private Piece p;

	public boolean hasPiece(){
		return hasPiece;
	}	

	public void setPiece(Piece pIn){
		p = pIn;
		hasPiece = true;
	}

	public Piece getPiece(){
		return p;
	}

	public boolean removePiece(){
		return hasPiece = false;
	}
}
