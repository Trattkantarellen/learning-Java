package 1dv506_lab3;

public class multiDisplay {  
private int displayCount;
private String displayMessage;

public void  setDisplayMessage(String in){ 
	displayMessage=in;
}

public  void setDisplayCount(int number){
 displayCount=number;
}

public void display(){ 
    for(int i=0; i<displayCount;i++){   
        System.out.println(displayMessage);
    }
}

public int getDisplayCount(){   
    return displayCount;
}

public void display(String msg, int count){
	for(int i=0;i<count;i++){
    System.out.print(msg);
    }
}
public String getDisplayMessage(){
return displayMessage;
}
}

