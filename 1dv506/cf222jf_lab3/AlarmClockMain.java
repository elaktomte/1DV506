package cf222jf_lab3;

public class AlarmClockMain {

	public static void main(String[] args) {
		
		//St�lla v�ckarklockan till tiden 23:48
		//Visa tiden
		//St�lla in v�ckningstiden till 6:15
		//L�ta klockan g� 500 minuter
		//Visa tiden igen
	AlarmClock ac = new AlarmClock(23,48);
	ac.displayTime();
	ac.setAlarm(6, 15);
	for (int i = 0; i <=500; i++){
		
		ac.timeTick();
			}
	
	ac.displayTime();
	
	
	
	


	}

}
