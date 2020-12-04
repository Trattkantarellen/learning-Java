package 1dv506_lab3;

public class TextAnalyzer {
	private String text;
	public TextAnalyzer (String text){
		this.text = text;
	}
	
	public int charCount(){
		int counter = 0;
		for(int i = 0; i <this.text.length(); i++){
			counter ++; 
		}
		int out = counter;
		return out; 
		
	}

	public int upperCaseCount(){
		int count = 0;
		for(int i = 0; i < this.text.length(); i++){
			if(Character.isUpperCase(text.charAt(i))){
				count ++;
			}
			
		}
		int out = count;
		return out;
	}
	
	public int whitespaceCount(){
	int count = 0;
	for(int i = 0; i < this.text.length(); i++){
		if(text.charAt(i) ==' '){
			count ++;
	}
}
	int out = count;
	return out;
}

	public int digitCount(){
		int count = 0;
		for(int i = 0; i < this.text.length(); i++){
			if(Character.isDigit(text.charAt(i))){
				count ++;
		}
		
	}
		int out = count;
		return out;
		
	}
	
	public boolean containsChar(char c){
		boolean abc = false;
		for(int i = 0; i < this.text.length(); i++){
			if(text.charAt(i) == c){
				abc = true;
		}
		
	}
		boolean out = abc;
		return out;
		
	}
	
	public boolean containsString(String sub){
		boolean abc = false;
		int count = 0; 
		for(int i = 0; i < text.length(); i++){
			if (text.contains(sub)){
				while (i < text.length()){
					count ++;
					i++;
				}
			}
		}
		if (count == text.length()){
			abc = true;
		}
		boolean out = abc;
		return out;
		
	}
}
