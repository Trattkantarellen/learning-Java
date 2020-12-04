package 1dv506_lab3;

public class PnrMain {
	public static void main(String[] args){
		
		System.out.println("First part: "+Pnr.getFirstPart());
		System.out.println("Second: "+Pnr.getSecondPart());
		System.out.println("Boy: "+Pnr.isMaleNumber());
		System.out.println("Girl: "+Pnr.isFemaleNumber());
		System.out.println("Equal: " + Pnr.areEqual("901010-1010")); //Jämför med "static String prs =" i Pnr
		
		
	}
}
