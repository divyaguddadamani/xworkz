

class PincodeRunner{

public static void pincode(int[] pincode){
	
	System.out.println("start main");
	
	for(int start=0;start<pincode.length;start++){
	
	int ref= pincode[start];
	System.out.println("pincode:"+ref);
	}
	for(int start=pincode.length-1;start>=0;start--){
	
	int ref= pincode[start];
	System.out.println("pincode:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	int[] pincodeNo={ 587101,583101, 590001,562110 ,560001 ,585401, 571313, 56210 ,577101 ,577501};
	
	
	pincode(pincodeNo);
	
}


}