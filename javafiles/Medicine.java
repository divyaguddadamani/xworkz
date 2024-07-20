class Medicine{
	
	public static double price(String name){
		
		System.out.println("running price in medicine");
	
	if(name=="dolo")
	{
		return 30;
	}
	if(name=="aspirin")
	{
		return 20;
	}
	if(name=="paracetamol")
	{
		return 50;
	}
	
	System.out.println("price is not declare");
		return 0;
	}
	
	public static String name(String symptom){
		
		System.out.println("running name in medicine");
	
	if(symptom=="reduce fever and relieve pain")
	{
		return "dolo" ;
	}
	if(symptom=="pain relief")
	{
		return "aspirin";
	}
	if(symptom=="reduce fever")
	{
		return "paracetamol";
	}
	
	System.out.println("tablet is not there");
		return "unknown tablet";
	}
	
	
	public static boolean availability(String doctorName){
		
		System.out.println("running availability in medicine");
	
	if(doctorName=="dr.divya")
	{
		return true ;
	}
	if(doctorName=="dr.vidya")
	{
		return false;
	}
	if(doctorName=="dr.laxmi")
	{
		return true;
	}
	
	System.out.println("availability of doctor");
		return true;
	}
	
	
}