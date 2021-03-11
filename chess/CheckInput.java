package chess;

public class CheckInput {
	
	//This method requires your input
	public boolean checkCoordinateValidity(String input){
		int a,b;
		char[] ch = input.toCharArray();
		if(ch.length != 2){
			return false;
		}
		else if(ch[0]<=56 && ch[0]>=49 && ch[1]<=104 && ch[1] >=97){
			a=ch[0]-49;
			b=ch[1]-97;
			if(a<0 || a>7 || b<0 || b>7){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}
}
