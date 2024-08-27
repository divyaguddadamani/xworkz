package runner;

import com.xworkz.principels.data.Halwa;
import com.xworkz.principels.data.food;

public class HalwaRunner {

	public static void main(String[] args) {
		
		Halwa halwa =new food();
		halwa.type="gajar halwa";
		halwa.quantity=2;
		halwa.price=100;
		halwa.run();
		halwa.order();
		
		
		food halwa2=new food();
		halwa2.type="sooji halwa";
		halwa2.quantity=1;
		halwa2.price=150;
		halwa2.run();
		halwa2.order();
		
		
		
				
	}

}
