package 1dv506_lab3;
public class Pnr {

static String prs = "931015-6675";  //YYMMDD-XXXX


	public static int getFirstPart(){
		
		int firstPart = Integer.parseInt(prs.substring(0,6));
		return firstPart; 
	}
	
	public static int getSecondPart(){
		
		int secondpart = Integer.parseInt(prs.substring(7,11));
		return secondpart;
	}
	
	public static boolean isFemaleNumber(){

	 int x = Integer.parseInt(prs.substring(10));
		if(x%2 == 0){
		return true;	
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isMaleNumber(){
		
		int x = Integer.parseInt(prs.substring(10));
		if(x%2 == 0){
		return false;	
		}
		else {
			return true;
		}
			
	}
	
public static boolean areEqual(String secondId){
		
		if(secondId.equals(prs)){
			return true;
		}
		else{
			return false;
		}
} 
	
}
