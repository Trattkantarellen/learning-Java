package 1dv506_lab3;


public class Arrays {
	public static void main(String[] args) {
	
	
			int[] arr=new int[]{3,1,2,6,7};

			int[] sub=new int[]{2,2};

		System.out.println(hasSubsequence(arr,sub)); // kollar om sub finns i arr

	String sort = Arrays.toString(Arrays.sort(arr));           
	     System.out.println("arrayS = " + sort);
		}
		
	
	
		   
private static int sum(int[] arr){
	int i = 0;
	int sumOne = 0;
	while (i < arr.length ){
	 sumOne = sumOne + arr[i];
	i ++;
	}
	int out = sumOne;
	return out;
	}

private static String toString(int[] arr){                          
    String print = "";
	for(int i = 0; i < arr.length; i++){
      int  printOne = arr[i]; // hämtar värdet från arr på posistion i
      String space = " ";
      print = print + (Integer.toString(printOne) + space);
    }
	String out = print;
    return out;
}

private static int[] addN(int[] arr, int n){
	int[] addN = new int[arr.length];
		for (int i=0 ;i < addN.length; i++){
			addN[i] = arr[i] + n;
	 }
	int[] out= addN;
	return out;
}

private static int[] reverse(int[] arr){
	int[] rev = new int[arr.length];
	 for (int i=0; i < (arr.length)/2; i++){   
	        int temp = arr[i]; // sparar tillfälligt i
	       arr[i] = arr[rev.length - i - 1];
	      arr[arr.length - i - 1] = temp;
	    }
	 	int[] out = arr;
	    return out;
}

private static boolean hasN(int[] arr, int n){
	int count = 0;
	for(int i = 0; i < arr.length; i++){
		if (arr[i] == n){
			count++;
		}
	}
	if(count == 0){                                  
       boolean out = false;
		return out;
    }
	else{ 
		boolean out = true;
        return out; 
	
}

	
}

private static	void replaceAll(int[] arr, int old, int nw){
	int i = 0;
	for(i = 0;i < arr.length; i++){
		if(arr[i] == old){
			arr[i] = nw;
		}
		else{
			arr[i] = arr[i];
		}
	}
}

private static int[] sort(int[] arr){           
    int [] arraySorted = new int[arr.length];        
    if (arr.length <= 1){             // för tomma och arrayer med ett element
    	int[] Out = arraySorted;
        return Out;
    }
    for(int j = 0; j < arr.length; j++)          
        for(int i = 0; i < arr.length-1; i++){    
            if(arr[i] < arr[i+1]){                
            }
            
            else{                               
                arraySorted[0] = arr[i];                
                arr[i] = arr[i+1];       
                arr[i+1] = arraySorted[0];            
        }
    }
    for(int i = 0; i < arr.length; i++){        
        arraySorted[i] = arr[i];                        
    }
    int[] Out = arraySorted;
    return Out;      
}

 private static boolean hasSubsequence(int[] arr, int[] sub){
	 for (int i = 0; i < arr.length - sub.length + 1; i++){ 
			boolean has;
			if (arr[i] == sub[0]){
			has = true;
			for (int k = 1; k < sub.length; k++)
			if (arr[i+k] != sub[k])
				has = false;
			if (has) 
				return true;
			}
		}
		return false;
	
}
}
