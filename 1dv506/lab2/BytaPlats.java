package 1dv506_lab2;

public class BytaPlats {
	public static void main(String[] args) {
	      char[] text = { 't', 't', '�', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
	         			't', 't', 'e', 'D' };
	         			
	      /*Forts�tt h�r ...*/
	    
	      System.out.println(text);
	      for(int i= 0; i < (text.length)/2; i++){
	    	  char temp = text[i];  //sparar tillf�lligt i
	    	  text[i] = text[text.length -1 -i];
	    	  text[text.length -1 -i] = temp;
	      }
	      System.out.println(text);
	} 
	     
} 

