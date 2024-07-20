//method to take states :String[]:29

class StatesRunner{

public static void statesName(String[] states){
	
	System.out.println("start main");
	
	for(int start=0;start<states.length;start++){
	
	String ref= states[start];
	System.out.println("state name:"+ref);
	}
	for(int start=states.length-1;start>=0;start--){
	
	String ref1= states[start];
	System.out.println("state name:"+ref1);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] statesNames={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand",
	"Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu",
	"Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
	
	
	statesName(statesNames);
	
}


}