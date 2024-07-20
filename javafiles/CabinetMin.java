
class CabinetMin{

public static void cabinetMinister(String[] minister){
	
	System.out.println("start main");
	
	for(int start=0;start<minister.length;start++){
	
	String ref= minister[start];
	System.out.println("cabinetMinister name:"+ref);
	}
	for(int start=minister.length-1;start>=0;start--){
	
	String ref= minister[start];
	System.out.println("cabinetMinister name:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] cabinetMinisterNames={"Rajnath Singh","Amit Shah","Nitin Jairam Gadkari","Nirmala Sitharaman",
	   "Shivraj Singh Chouhan","Subrahmanyam Jaishankar","Subrahmanyam Jaishankar","Jagat Prakash Nadda",
	   "Manohar Lal","H. D. Kumaraswamy","Piyush Goyal","Dharmendra Pradhan","Jitan Ram Manjhi","Rajiv Ranjan Singh",
	   "Sarbananda Sonowal","Kinjarapu Rammohan Naidu","Pralhad Joshi","Jual Oram","Giriraj Singh"," Ashwini Vaishnaw",
	   "Jyotiraditya M. Scindia","Bhupender Yadav","Gajendra Singh Shekhawat","Annpurna Devi","Virendra Kumar",
	   "Kiren Rijiju","Hardeep Singh Puri","Mansukh Mandaviya","Kishan Reddy","Chirag Paswan"};
	
	
	cabinetMinister(cabinetMinisterNames);
	
}


}