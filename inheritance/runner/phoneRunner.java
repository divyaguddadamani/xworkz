package runner;

import com.xworkz.principels.data.phone;
import com.xworkz.principels.data.properties;

public class phoneRunner {

	public static void main(String[] args) {
		
		properties ref=new properties();
		ref.name="vivo";
		ref.price=20000;
		ref.display=14.4;
		ref.storage=256;
		ref.print();
		
		phone ref2= new properties();
		ref2.name="poco";
		ref2.price=18000;
		ref2.display=14.3;
		ref2.storage=126;
		ref2.print();
		

	}

}
