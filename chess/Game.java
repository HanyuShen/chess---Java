package chess;
import java.io.Console;

public class Game {
	private static boolean gameEnd=false;

	//This method requires your input
	public static void play(){
		Console con = System.console();
  	String origin, destination;
		int iIn = 0;
    int jIn = 0;
  	int iOut = 0;
		int jOut = 0;
  	int x = 0;
  	int y = 0;
		boolean white = true;
  	Piece p = null;
  	CheckInput check = new CheckInput();



  	while (!gameEnd){
  		System.out.println(" ");
  		if(white == true){
  			System.out.print("-----Whites move------\n");
  		}
  		else{
  			System.out.print("-----Blacks move------\n");
			}
  			
 			while (true){
   			origin = con.readLine("Enter origin: ");
        //(1)
   			if (check.checkCoordinateValidity(origin) == true){
   				iIn = Character.getNumericValue(origin.charAt(0)) - 1;
   				switch(origin.charAt(1)){
    				case 'a': x = 0;break;
    				case 'b': x = 1;break;
  					case 'c': x = 2;break;
  					case 'd': x = 3;break;
    				case 'e': x = 4;break;
   			 		case 'f': x = 5;break;
    				case 'g': x = 6;break;
    				case 'h': x = 7;break;
   				}
   				jIn = x;
   				if (Board.hasPiece(iIn,jIn)){
   					p = Board.getPiece(iIn,jIn);
            //judge colour
            if(p.getColour() == PieceColour.BLACK && white || p.getColour() == PieceColour.WHITE && !white){
              System.out.print("Wrong colour...\n");
              continue;
            }
   					break;
   				}
   			}
        //(2)
        else if(origin.equals("END")){
          System.out.println("You choose to quit the game.");
          gameEnd = true;
          break;
        }
   			//(3)
        else {
   				System.out.print("The input is invalid.\n");
   				continue;
   			}  
   		}

      while (true){
   		  destination = con.readLine("Enter destination: ");
        //(1)
        if(check.checkCoordinateValidity(destination) == true){
   		    iOut = Character.getNumericValue(destination.charAt(0)) - 1;
   		    switch(destination.charAt(1)){
    			  case 'a': y = 0;break;
    			  case 'b': y = 1;break;
    			  case 'c': y = 2;break;
    		    case 'd': y = 3;break;
   		  	  case 'e': y = 4;break;
   				  case 'f': y = 5;break;
  			    case 'g': y = 6;break;
  				  case 'h': y = 7;break;
  			  }
   			  jOut = y;
   			  if (p.isLegitMove(iIn,jIn,iOut,jOut)){
   			    if(Board.movePiece(iIn,jIn,iOut,jOut,p) == false){
              if(white){
                System.out.println("White you win!!");
                gameEnd = true;
                break;
              }
              System.out.println("Black you win!!");
              gameEnd = true;
              break;
            }
     		    Board.printBoard();
   			    white = !white;
            break;
   			  }
   			  else {
    	  	  System.out.println("Invalid move.");
            continue;
  			  }
        }
        //(2)
        else if(destination.equals("END")){
          System.out.println("You choose to quit the game.");
          gameEnd = true;
          break;
        }
        //(3)
        else{
          System.out.print("The input is invalid.\n");
          continue;
        }
      }
   	}
  }

	//This method should not be edited
	public static void main (String args[]){
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();
	}
}
