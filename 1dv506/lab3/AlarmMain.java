package 1dv506_lab3;

public class AlarmMain {
	public static void main(String[] args){
		AlarmClock A = new AlarmClock(23, 48);
			 A.displayTime();
			 A.setAlarm(6, 15);
			 A.displayAlarmTime();
		
			 for(int i= 0; i<500; i++ ){
				 A.timeTick();
				 }	
			 A.displayTime();
	}
}
