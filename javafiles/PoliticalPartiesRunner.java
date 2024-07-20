
class PoliticalPartiesRunner{

public static void politicalParty(String[] parties){
	
	System.out.println("start main");
	
	for(int start=0;start<parties.length;start++){
	
	String ref= parties[start];
	System.out.println("parties name:"+ref);
	}
	for(int start=parties.length-1;start>=0;start--){
	
	String ref= parties[start];
	System.out.println("parties name:"+ref);
	}



}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] PoliticalPartiesNames={"BJP","JDS","CONGRESS","CPI","KPJP",};
	
	
	politicalParty(PoliticalPartiesNames);
	
}


}