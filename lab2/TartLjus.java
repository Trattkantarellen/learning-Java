package 1dv506_lab2;

public class TartLjus {

public static void main(String[] args) {
	int i = 0;
	int age = 0;
	int agesum = 0;
	int boxes = 0;
	int newcandles = 0;
	int candlesbox = 0;
	int candles = 24;
	
	for (i = 0; i <101; i++){
		age = i;
		agesum = agesum + i;
		newcandles = 0;
		while(candlesbox + newcandles < age){
			newcandles= newcandles + 24;
			boxes++;
		}
		candlesbox = candlesbox + newcandles;
		if (newcandles > 0)
			System.out.println("Before birthday: " + age + " buy: "  +newcandles / candles + "box(es)");
		candlesbox= candlesbox - age;
		
	}
	
	int remaningcandles = (boxes * candles) - agesum;
	System.out.println("total number of boxes: " + boxes + ", candles remaning: " + remaningcandles);
	
	}

}
