package runner;

import com.xworkz.principels.data.Bull;
import com.xworkz.principels.data.animal;

public class BullRunner {

	public static void main(String[] args) {
		
		
		animal val=new animal();
		val.place="belagavi";
		val.color="white";
		val.runSpeed=2000;
		val.horn="sharp";
		val.weight=135;
		val.bullweight();
		val.bullspeed();
		val.bullcolor();
		val.bullhorn();
		val.bullPlace();
		
		Bull val1=new animal();
		val1.place="hubali";
		val1.color="black";
		val1.runSpeed=3000;
		val1.horn="long";
		val1.weight=145;
		val1.bullweight();
		val1.bullspeed();
		val1.bullcolor();
		val1.bullhorn();
		val1.bullPlace();
		
		

	}

}
